package fr.eni.film.tpfilmographie.bll;

import fr.eni.film.tpfilmographie.bo.Participant;
import fr.eni.film.tpfilmographie.services.ParticipantService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("participantsService")
public class ParticipantServiceImpl implements ParticipantService {
    private ArrayList<Participant> participants;

    public ParticipantServiceImpl() {
        this.participants = new ArrayList<Participant>();
//        participants.add(new Participant(1, "Benjam", "Prejen", true, true));
//        participants.add(new Participant(2, "Fanch", "Triangle", false, true));
//        participants.add(new Participant(3, "Sebastien", "Gloopy", false, true));
//        participants.add(new Participant(4, "Robin", "SonCrusoe", false, true));

    }

    @Override
    public void insertParticipant(Participant participant) {
//        participants.add(new Participant(
//                getNextParticipantId(),
//                participant.getFirstName(),
//                participant.getLastName(),
//                true,
//                false
//                )
//        );
    }

    @Override
    public Participant findParticipantById(int id) {
        for (Participant p : this.participants) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Participant> findParticipants() {
        return participants;
    }

    @Override
    public int getNextParticipantId() {
        int id = participants.get(participants.size()).getId()+1;
        return id;
    }
}
