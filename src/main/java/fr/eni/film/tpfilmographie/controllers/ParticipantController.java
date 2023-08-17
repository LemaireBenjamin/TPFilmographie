package fr.eni.film.tpfilmographie.controllers;

import fr.eni.film.tpfilmographie.bo.Participant;
import fr.eni.film.tpfilmographie.services.MovieService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ParticipantController {


    @Autowired @Qualifier("JPA") private MovieService movieService;

    @GetMapping("/participant")
    public String ParticipantListPage(Model model){
        return "participants/participantlistpage";
    }

    @GetMapping("/participant/{id}")
    public String ParticipantDetailPage(@PathVariable(value = "id",required = true)int id, Model model){
        return "participants/participantdetailpage";
    }

    @GetMapping("/participants/ajouter")
    public String displayAddParticipant(Model model){
        model.addAttribute("participant",new Participant());
        return "participants/add";
    }

    @PostMapping("/participants/ajouter")
    public String addParticipantProcess(
            @Valid @ModelAttribute Participant participant,
            BindingResult bindingResult
    ){

        if(bindingResult.hasErrors()){
            return "participants/add";
        }
        movieService.saveParticipant(participant);
        return "redirect:/movies/add";
    }

}
