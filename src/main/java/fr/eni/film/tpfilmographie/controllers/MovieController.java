package fr.eni.film.tpfilmographie.controllers;

import fr.eni.film.tpfilmographie.services.MovieService;
import fr.eni.film.tpfilmographie.services.ParticipantService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MovieController {


    private MovieService movieService;
    private ParticipantService participantService;


    public MovieController(
            MovieService movieService,
            ParticipantService participantService) {
        this.movieService = movieService;
        this.participantService = participantService;
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

    @GetMapping({"/movies/add"})
    public String movieAdd(Model model){
//        model.addAttribute("type", );
        return "movieadd";
    }

    @PostMapping({"/movies/add"})
    public String movieAddProcess(
            String title,
            int releaseDate,
            String directorLastName,
            String directorFirstName,
            int duration,
            String synopsis
    ){
        return "home";
    }
}
