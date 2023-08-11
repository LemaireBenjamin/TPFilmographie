package fr.eni.film.tpfilmographie;

import fr.eni.film.tpfilmographie.bll.MovieServiceImpl;
import fr.eni.film.tpfilmographie.bll.OpinionServiceImpl;
import fr.eni.film.tpfilmographie.bll.ParticipantServiceImpl;
import fr.eni.film.tpfilmographie.bll.TypeServiceImpl;
import fr.eni.film.tpfilmographie.bo.Type;
import fr.eni.film.tpfilmographie.services.MovieService;
import fr.eni.film.tpfilmographie.services.OpinionService;
import fr.eni.film.tpfilmographie.services.ParticipantService;
import fr.eni.film.tpfilmographie.services.TypeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class AppConfig {
    @Bean
    public MovieService movieService(){
        return new MovieServiceImpl();
    }
    @Bean
    public OpinionService opinionService(){
        return new OpinionServiceImpl();
    }
    @Bean
    public TypeService typeService(){
        return new TypeServiceImpl();
    }
    @Bean public ParticipantService participantService(){
        return new ParticipantServiceImpl();
    }
    @Bean public ArrayList<Type> types(){
        return typeService().findTypes();
    }
}
