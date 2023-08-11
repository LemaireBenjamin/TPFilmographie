package fr.eni.film.tpfilmographie.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ParticipantController {

    @GetMapping("/participant")
    public String ParticipantListPage(Model model){
        return "participantlistpage";
    }

    @GetMapping("/participant/{id}")
    public String ParticipantDetailPage(@PathVariable(value = "id",required = true)int id, Model model){
        return "participantdetailpage";
    }
}
