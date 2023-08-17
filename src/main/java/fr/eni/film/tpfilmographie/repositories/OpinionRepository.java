package fr.eni.film.tpfilmographie.repositories;

import fr.eni.film.tpfilmographie.bo.Opinion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpinionRepository extends JpaRepository<Opinion,Integer> {
}
