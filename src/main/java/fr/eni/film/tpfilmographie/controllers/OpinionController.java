package fr.eni.film.tpfilmographie.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class OpinionController {

    @GetMapping("/opinion/{id}")
    public String opinionDetailPage(@PathVariable(value = "id",required = true)int id, Model model){

        return "opiniondetailpage";
    }
}
