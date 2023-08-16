package fr.eni.film.tpfilmographie.controllers;

import fr.eni.film.tpfilmographie.bo.Movie;
import fr.eni.film.tpfilmographie.bo.Participant;
import fr.eni.film.tpfilmographie.bo.Type;
import fr.eni.film.tpfilmographie.services.MovieService;
import fr.eni.film.tpfilmographie.services.ParticipantService;
import fr.eni.film.tpfilmographie.services.TypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MovieController {


    private MovieService movieService;
    private ParticipantService participantService;
    private TypeService typeService;


    public MovieController(
            MovieService movieService,
            ParticipantService participantService,
            TypeService typeService
    ) {
        this.movieService = movieService;
        this.participantService = participantService;
        this.typeService = typeService;
    }

    @ModelAttribute("movies")
    public List<Movie> getMovies(){
        return movieService.findMovies();
    }

    @ModelAttribute("types")
    public List<Type> getTypes(){
        return typeService.findTypes();
    }

    @GetMapping({"/",""})
    public String homePage(Model model){
//        model.addAttribute("movies",movieService.findMovies());
        return "home";
    }

    @GetMapping({"/movies/detail/{id}"})
    public String movieDetail(@PathVariable(value = "id",required = true) int id, Model model){
        model.addAttribute("movie",movieService.findMovieById(id));
        return "moviedetail";
    }

    @GetMapping({"/movies/add"})
    public String movieAdd(Model model){
        model.addAttribute("movie", new Movie());
//        model.addAttribute("director", new Participant());
        return "movieadd";
    }

    @PostMapping({"/movies/add"})
    public String movieAddProcess(
        @RequestParam("movie") Movie movie
    ){

        return "home";
    }
}
