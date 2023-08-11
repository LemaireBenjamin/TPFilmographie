package fr.eni.film.tpfilmographie.bll;

import fr.eni.film.tpfilmographie.bo.Type;
import fr.eni.film.tpfilmographie.services.TypeService;

import java.util.ArrayList;

public class TypeServiceImpl implements TypeService {
    private ArrayList<Type> types;

    public TypeServiceImpl() {
        this.types = new ArrayList<Type>();
        types.add(new Type(1,"Guerre"));
        types.add(new Type(2,"Thriller"));
        types.add(new Type(3,"Action"));
        types.add(new Type(4,"Science-fiction"));
        types.add(new Type(5,"Aventure"));
    }

    @Override
    public ArrayList<Type> findTypes() {
        return this.types;
    }

    @Override
    public Type findTypeById(int id) {
        for(Type t: types){
            if (t.getId()==id){
                return t;
            }
        }
        return null;
    }

    @Override
    public void insertType(Type type) {
        types.add(type);
    }

    @Override
    public int getNextTypeId() {
        return types.size()+1;
    }
}
