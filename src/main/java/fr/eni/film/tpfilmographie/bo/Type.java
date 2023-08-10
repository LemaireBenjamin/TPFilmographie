package fr.eni.film.tpfilmographie.bo;

import java.util.ArrayList;

public class Type {
    private int id;
    private String label;
    private ArrayList<Movie> movies;

    public Type(int id, String label, ArrayList<Movie> movies) {
        this.id = id;
        this.label = label;
        this.movies = movies;
    }

    public Type() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }
}
