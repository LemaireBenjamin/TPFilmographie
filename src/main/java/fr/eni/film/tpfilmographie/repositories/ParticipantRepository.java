package fr.eni.film.tpfilmographie.repositories;

import fr.eni.film.tpfilmographie.bo.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant,Integer> {
}
