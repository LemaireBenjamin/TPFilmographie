package fr.eni.film.tpfilmographie.bo;

import java.util.ArrayList;

public class Movie {
    private int id;
    private String title;
    private int releaseDate;
    private int duration; // minute
    private String synopsis;
    private Type type;
    private ArrayList<Opinion> opinions;
    private ArrayList<Participant> actors;
    private Participant director;

    public Movie() {
    }

    public Movie(int id, String title, int releaseDate, int duration, String synopsis, Type type, ArrayList<Opinion> opinions, ArrayList<Participant> actors, Participant director) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.synopsis = synopsis;
        this.type = type;
        this.opinions = opinions;
        this.actors = actors;
        this.director = director;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public ArrayList<Opinion> getOpinions() {
        return opinions;
    }

    public void setOpinions(ArrayList<Opinion> opinions) {
        this.opinions = opinions;
    }

    public ArrayList<Participant> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Participant> actors) {
        this.actors = actors;
    }

    public Participant getDirector() {
        return director;
    }

    public void setDirector(Participant director) {
        this.director = director;
    }
}
