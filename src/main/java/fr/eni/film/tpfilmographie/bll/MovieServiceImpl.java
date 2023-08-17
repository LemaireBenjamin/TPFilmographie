package fr.eni.film.tpfilmographie.bll;

import fr.eni.film.tpfilmographie.bo.Movie;
import fr.eni.film.tpfilmographie.repositories.MovieRepository;
import fr.eni.film.tpfilmographie.repositories.OpinionRepository;
import fr.eni.film.tpfilmographie.repositories.ParticipantRepository;
import fr.eni.film.tpfilmographie.repositories.TypeRepository;
import fr.eni.film.tpfilmographie.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


public class MovieServiceImpl implements MovieService {

    @Autowired private MovieRepository movieRepository;
    @Autowired private OpinionRepository opinionRepository;
    @Autowired private TypeRepository typeRepository;
    @Autowired private ParticipantRepository participantRepository;

    @Override
    public List<Movie> findMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie findMovieById(Integer id) {
        Optional<Movie> movie = movieRepository.findById(id);
        if(movie.isPresent()){
            return movie.get();
        }else{
            return null;
        }
    }

    @Override
    public void updateMovie(Movie movie) {
        movieRepository.save(movie);
    }
}
