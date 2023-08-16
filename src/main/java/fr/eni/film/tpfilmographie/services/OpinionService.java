package fr.eni.film.tpfilmographie.services;

import fr.eni.film.tpfilmographie.bo.Opinion;

import java.util.ArrayList;

public interface OpinionService {
    public ArrayList<Opinion> findOpinions();
    public Opinion findOpinionById(int id);
    public void insertOpinion(Opinion opinion);
    public int getNextOpinionId();


}
