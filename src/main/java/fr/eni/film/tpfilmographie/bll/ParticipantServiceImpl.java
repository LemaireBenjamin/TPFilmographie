package fr.eni.film.tpfilmographie.bll;

import fr.eni.film.tpfilmographie.bo.Director;
import fr.eni.film.tpfilmographie.bo.Participant;
import fr.eni.film.tpfilmographie.repositories.MovieRepository;
import fr.eni.film.tpfilmographie.repositories.OpinionRepository;
import fr.eni.film.tpfilmographie.repositories.ParticipantRepository;
import fr.eni.film.tpfilmographie.repositories.TypeRepository;
import fr.eni.film.tpfilmographie.services.ParticipantService;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("participantsService")
public class ParticipantServiceImpl implements ParticipantService {
    @Autowired
    EntityManager em;
    @Autowired
    private MovieRepository movieRepository;
    @Autowired private OpinionRepository opinionRepository;
    @Autowired private TypeRepository typeRepository;
    @Autowired private ParticipantRepository participantRepository;

    @Override
    public void insertParticipant(Participant participant) {
        participantRepository.save(participant);
    }

    @Override
    public Participant findParticipantById(Integer id) {
        return participantRepository.findById(id).get();
    }

    @Override
    public ArrayList<Participant> findParticipants() {
        return (ArrayList<Participant>) participantRepository.findAll();
    }

    @Override
    public List<Participant> findDirectors() {
        return em.createNativeQuery("SELECT * FROM participant WHERE dtype = 'director'", Participant.class)
                .getResultList();
    }

    @Override
    public List<Participant> findActors() {
        return em.createNativeQuery("SELECT * FROM participant WHERE dtype = 'actor'", Participant.class)
                .getResultList();
    }


}
