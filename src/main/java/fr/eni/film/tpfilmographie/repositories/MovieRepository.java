package fr.eni.film.tpfilmographie.repositories;

import fr.eni.film.tpfilmographie.bo.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
