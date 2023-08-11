package fr.eni.film.tpfilmographie.services;

import fr.eni.film.tpfilmographie.bo.Type;

import java.util.ArrayList;

public interface TypeService {
    ArrayList<Type> findTypes();
    Type findTypeById(int id);
    void insertType(Type type);
    int getNextTypeId();
}
