package fr.eni.film.tpfilmographie.bo;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
@DiscriminatorValue("participant")
public class Participant implements Serializable {
    @Serial
    private static final long serialVersionUID = -362058956527358713L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message="Le nom ne peut pas être vide.")
    @Size(min = 2,max = 255,message = "Le nom doit être de minimum 2 et maximum 255 caractères.")
    private String firstName;
    @NotBlank(message = "Le prénom ne peut pas être vide.")
    @Size(min = 2,max = 255,message = "Le prénom doit être de minimum 2 et maximum 255 caractères.")
    private String lastName;


}
