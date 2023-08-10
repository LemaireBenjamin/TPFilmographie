package fr.eni.film.tpfilmographie.bo;

import java.util.ArrayList;

public class Participant {
    private int id;
    private String firstName;
    private String lastName;
    private ArrayList<Movie> movies;
    private boolean director;
    private boolean actor;

    public Participant() {
    }

    public Participant(int id, String firstName, String lastName, ArrayList<Movie> movies, boolean director, boolean actor) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.movies = movies;
        this.director = director;
        this.actor = actor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public boolean isDirector() {
        return director;
    }

    public void setDirector(boolean director) {
        this.director = director;
    }

    public boolean isActor() {
        return actor;
    }

    public void setActor(boolean actor) {
        this.actor = actor;
    }
}
