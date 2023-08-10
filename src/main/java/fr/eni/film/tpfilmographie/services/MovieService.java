package fr.eni.film.tpfilmographie.services;

import fr.eni.film.tpfilmographie.bo.Movie;

import java.util.List;

public interface MovieService {
    public List<Movie> findMovies();
    public Movie findMovieById(Integer id);
}
