package fr.eni.film.tpfilmographie;

import fr.eni.film.tpfilmographie.bll.*;
import fr.eni.film.tpfilmographie.bo.Type;
import fr.eni.film.tpfilmographie.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

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
    @Bean public List<Type> types(){
        return typeService().findTypes();
    }

    @Bean
    MemberService memberService(){return new MemberServiceImpl();
    }
}
