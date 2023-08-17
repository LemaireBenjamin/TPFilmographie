package fr.eni.film.tpfilmographie.services;

import fr.eni.film.tpfilmographie.bo.Participant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public interface ParticipantService {

    void insertParticipant(Participant participant);
    Participant findParticipantById(Integer id);
    ArrayList<Participant> findParticipants();


    List<Participant> findDirectors();


    List<Participant> findActors();

}
