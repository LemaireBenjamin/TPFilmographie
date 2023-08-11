package fr.eni.film.tpfilmographie.controllers;

import fr.eni.film.tpfilmographie.services.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MovieController {

    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }



    @GetMapping({"/",""})
    public String homePage(Model model){
        model.addAttribute("movies",movieService.findMovies());
        return "home";
    }

    @GetMapping({"/movies/detail/{id}"})
    public String movieDetail(@PathVariable(value = "id",required = true) int id, Model model){
        model.addAttribute("movie",movieService.findMovieById(id));
        return "moviedetail";
    }

    @GetMapping({"movies/add/"})
    public String movieAdd(){
        return null;
    }
}
