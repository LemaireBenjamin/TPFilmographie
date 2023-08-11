package fr.eni.film.tpfilmographie.bll;

import fr.eni.film.tpfilmographie.bo.Movie;
import fr.eni.film.tpfilmographie.bo.Opinion;
import fr.eni.film.tpfilmographie.bo.Participant;
import fr.eni.film.tpfilmographie.bo.Type;
import fr.eni.film.tpfilmographie.services.MovieService;

import java.util.ArrayList;
import java.util.List;

public class MovieServiceImpl implements MovieService {
    private List<Movie> movies;

    public MovieServiceImpl() {
        this.movies = new ArrayList<Movie>();
        Participant director = new Participant(1, "Benjam", "Prejen", true, true);
        Type type = new Type(1, "Guerre");
        ArrayList<Participant> actors = new ArrayList<Participant>();
        ArrayList<Opinion> opinions = new ArrayList<Opinion>();
        actors.add(director);
        actors.add(new Participant(2, "Fanch", "Triangle", false, true));
        actors.add(new Participant(3, "Sebastien", "Gloopy", false, true));
        actors.add(new Participant(4, "Robin", "SonCrusoe", false, true));


        opinions.add(new Opinion(1, "Extra !", 5));
        opinions.add(new Opinion(2, "Bien.", 4));
        opinions.add(new Opinion(3, "Moyen.", 3));
        opinions.add(new Opinion(4, "Mauvais.", 2));
        opinions.add(new Opinion(5, "Nul !", 1));
        this.movies.add(new Movie(
                        1,
                        "Un gros titre de fou furieux : Episode 2",
                        2000,
                        120,
                        "C'est la guerre !",
                        type,//type
                        opinions,//opinion
                        actors,//actor
                        director//director
                )
        );
        this.movies.add(new Movie(
                        2,
                        "Un gros titre de fou furieux : Episode 2",
                        2000,
                        120,
                        "C'est la guerre ! (bis)",
                        type,//type
                        opinions,//opinion
                        actors,//actor
                        director//director
                )
        );
        this.movies.add(new Movie(
                        3,
                        "Un gros titre de fou furieux : Episode 3",
                        2000,
                        120,
                        "C'est la guerre ! (ter)",
                        type,//type
                        opinions,//opinion
                        actors,//actor
                        director//director
                )
        );
    }

    @Override
    public List<Movie> findMovies() {
        return movies;
    }

    @Override
    public Movie findMovieById(Integer id) {
        for (Movie m : this.movies) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }
}
