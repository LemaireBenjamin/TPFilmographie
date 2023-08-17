package fr.eni.film.tpfilmographie.services;

import fr.eni.film.tpfilmographie.bo.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MovieService {
    public List<Movie> findMovies();
    public Movie findMovieById(Integer id);

    void updateMovie(Movie movie);
}
