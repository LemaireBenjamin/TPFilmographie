package fr.eni.film.tpfilmographie.services;

import fr.eni.film.tpfilmographie.bo.Participant;

import java.util.ArrayList;

public interface ParticipantService {

    void insertParticipant(Participant participant);
    Participant findParticipantById(int id);
    ArrayList<Participant> findParticipants();
    int getNextParticipantId();

}
