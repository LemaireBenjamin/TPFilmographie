package fr.eni.film.tpfilmographie.bll;

import fr.eni.film.tpfilmographie.bo.Opinion;
import fr.eni.film.tpfilmographie.repositories.MovieRepository;
import fr.eni.film.tpfilmographie.repositories.OpinionRepository;
import fr.eni.film.tpfilmographie.repositories.ParticipantRepository;
import fr.eni.film.tpfilmographie.repositories.TypeRepository;
import fr.eni.film.tpfilmographie.services.OpinionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Optional;

public class OpinionServiceImpl implements OpinionService {
    @Autowired
    private MovieRepository movieRepository;
    @Autowired private OpinionRepository opinionRepository;
    @Autowired private TypeRepository typeRepository;
    @Autowired private ParticipantRepository participantRepository;


    @Override
    public ArrayList<Opinion> findOpinions() {
        return (ArrayList<Opinion>) opinionRepository.findAll();
    }

    @Override
    public Opinion findOpinionById(Integer id) {
        return opinionRepository.findById(id).get();
    }

    @Override
    public void insertOpinion(Opinion opinion) {
        opinionRepository.save(opinion);
    }


}
