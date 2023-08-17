package fr.eni.film.tpfilmographie.controllers;

import fr.eni.film.tpfilmographie.bo.Movie;
import fr.eni.film.tpfilmographie.bo.Opinion;
import fr.eni.film.tpfilmographie.services.MemberService;
import fr.eni.film.tpfilmographie.services.MovieService;
import fr.eni.film.tpfilmographie.services.OpinionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class OpinionController {

    @Autowired
    MovieService movieService;
    @Autowired OpinionService opinionService;
    @Autowired MemberService memberService;


    @GetMapping("/opinion/{id}")
    public String opinionDetailPage(@PathVariable(value = "id",required = true)Integer id, Model model){
        return "opiniondetailpage";
    }
    @GetMapping("/movies/detail/{movieid}/newopinion")
    public String newOpinionPage(@PathVariable(value = "movieid",required = true)Integer movieid,Model model){
        Opinion opinion = new Opinion();
        opinion.setMember(memberService.findMemberById(1));
        opinion.setMovie(movieService.findMovieById(movieid));
        model.addAttribute("opinion",opinion);
        model.addAttribute("movie",movieService.findMovieById(movieid));
        return "newopinion";
    }
    @PostMapping("/movies/detail/{movieid}/newopinion")
    public String addNewOpinion(
            @ModelAttribute Opinion opinion,
            @PathVariable(value = "movieid",required = true)Integer movieid
            ){
        opinion.setMovie(movieService.findMovieById(movieid));
        opinion.setMember(memberService.findMemberById(1));
        opinionService.insertOpinion(opinion);
        return "redirect:/movies/detail/"+movieid;
    }
}
