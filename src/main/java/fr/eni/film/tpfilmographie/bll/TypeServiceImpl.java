package fr.eni.film.tpfilmographie.bll;

import fr.eni.film.tpfilmographie.bo.Type;
import fr.eni.film.tpfilmographie.repositories.MovieRepository;
import fr.eni.film.tpfilmographie.repositories.OpinionRepository;
import fr.eni.film.tpfilmographie.repositories.ParticipantRepository;
import fr.eni.film.tpfilmographie.repositories.TypeRepository;
import fr.eni.film.tpfilmographie.services.TypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Optional;

public class TypeServiceImpl implements TypeService {
    @Autowired
    private MovieRepository movieRepository;
    @Autowired private OpinionRepository opinionRepository;
    @Autowired private TypeRepository typeRepository;
    @Autowired private ParticipantRepository participantRepository;
    @Override
    public ArrayList<Type> findTypes() {
        return (ArrayList<Type>) typeRepository.findAll();
    }

    @Override
    public Type findTypeById(Integer id) {
        return typeRepository.findById(id).get();
    }

    @Override
    public void insertType(Type type) {

    }


}
