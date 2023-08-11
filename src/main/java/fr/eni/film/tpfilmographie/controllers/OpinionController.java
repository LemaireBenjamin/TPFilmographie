package fr.eni.film.tpfilmographie.controllers;

import fr.eni.film.tpfilmographie.bo.Movie;
import fr.eni.film.tpfilmographie.bo.Opinion;
import fr.eni.film.tpfilmographie.services.MovieService;
import fr.eni.film.tpfilmographie.services.OpinionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OpinionController {

    MovieService movieService;
    OpinionService opinionService;

    public OpinionController(MovieService movieService, OpinionService opinionService) {
        this.movieService = movieService;
        this.opinionService = opinionService;
    }

    @GetMapping("/opinion/{id}")
    public String opinionDetailPage(@PathVariable(value = "id",required = true)int id, Model model){

        return "opiniondetailpage";
    }
    @GetMapping("/movies/detail/{movieid}/newopinion")
    public String newOpinionPage(@PathVariable(value = "movieid",required = true)int movieid,Model model){
        model.addAttribute("movie",movieService.findMovieById(movieid));
        return "newopinion";
    }
    @PostMapping("/movies/detail/{movieid}/newopinion")
    public String addNewOpinion(
            @PathVariable(value = "movieid",required = true)int movieid,
            @RequestParam("rating") int rating,
            @RequestParam("opinion") String opinionText
            ){
        Movie movie=movieService.findMovieById(movieid);
        Opinion newOpinion=new Opinion(opinionService.getNextOpinionId(),opinionText,rating);
        movie.getOpinions().add(newOpinion);
        movieService.updateMovie(movie);
        return "redirect:/movies/detail/"+movie.getId();
    }
}
