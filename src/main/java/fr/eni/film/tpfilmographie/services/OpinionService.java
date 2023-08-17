package fr.eni.film.tpfilmographie.services;

import fr.eni.film.tpfilmographie.bo.Opinion;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public interface OpinionService {
    public ArrayList<Opinion> findOpinions();
    public Opinion findOpinionById(Integer id);
    public void insertOpinion(Opinion opinion);


}
