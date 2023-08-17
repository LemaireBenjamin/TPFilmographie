package fr.eni.film.tpfilmographie.controllers;

import fr.eni.film.tpfilmographie.bo.Participant;
import fr.eni.film.tpfilmographie.bo.Type;
import fr.eni.film.tpfilmographie.services.MovieService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TypeController {

    @Autowired private MovieService movieService;

    @GetMapping("/type")
    public String typeListPage(Model model){
        return "typelistpage";
    }

    @GetMapping("/type/{id}")
    public String typeDetailPage(@PathVariable(value = "id",required = true)int id, Model model){

        return "typedetailpage";
    }

    @GetMapping("/types/ajouter")
    public String displayAddParticipant(Model model){
        model.addAttribute("type",new Type());
        return "types/add";
    }

    @PostMapping("/types/ajouter")
    public String addParticipantProcess(
            @Valid @ModelAttribute Type type,
            BindingResult bindingResult
    ){

        if(bindingResult.hasErrors()){
            return "types/add";
        }
        movieService.saveType(type);
        return "redirect:/movies/add";
    }
}
