package fr.eni.film.tpfilmographie.services;

import fr.eni.film.tpfilmographie.bo.Type;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public interface TypeService {
    ArrayList<Type> findTypes();
    Type findTypeById(Integer id);
    void insertType(Type type);

}
