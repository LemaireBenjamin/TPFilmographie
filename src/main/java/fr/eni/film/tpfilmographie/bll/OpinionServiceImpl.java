package fr.eni.film.tpfilmographie.bll;

import fr.eni.film.tpfilmographie.bo.Opinion;
import fr.eni.film.tpfilmographie.services.OpinionService;

import java.util.ArrayList;

public class OpinionServiceImpl implements OpinionService {

    private ArrayList<Opinion> opinions;

    public OpinionServiceImpl() {
        this.opinions = new ArrayList<Opinion>();
        opinions.add(new Opinion(1, "Extra !", 5));
        opinions.add(new Opinion(2, "Bien.", 4));
        opinions.add(new Opinion(3, "Moyen.", 3));
        opinions.add(new Opinion(4, "Mauvais.", 2));
        opinions.add(new Opinion(5, "Nul !", 1));
    }

    @Override
    public ArrayList<Opinion> findOpinions() {
        return this.opinions;
    }

    @Override
    public Opinion findOpinionById(int id) {
        for (Opinion opinion:opinions
             ) {
            if(opinion.getId()==id){
                return opinion;
            }
        }
        return null;
    }

    @Override
    public void insertOpinion(Opinion opinion) {
        this.opinions.add(opinion);
    }

    @Override
    public int getNextOpinionId() {
        return this.opinions.toArray().length+1;
    }
}
