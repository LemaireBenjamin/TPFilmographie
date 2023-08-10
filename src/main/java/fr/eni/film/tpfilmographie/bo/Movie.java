package fr.eni.film.tpfilmographie.bo;

import java.util.ArrayList;

public class Movie {
    private String title;
    private int releaseDate;
    private int duration;
    private String synopsis;
    private Type type;
    private ArrayList<Opinion> opinions;
    private ArrayList<Participant> actors;
    private Participant director;
}
