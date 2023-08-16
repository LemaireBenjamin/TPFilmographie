package fr.eni.film.tpfilmographie.bo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member implements Serializable {
    @Serial
    private static final long serialVersionUID = -600562343613848979L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message="Le prénom ne peut être vide")
    @NotNull(message = "L'email ne peut pas être nul")
    private String firstName;
    @NotBlank(message="Le nom ne peut être vide")
    @NotNull(message = "L'email ne peut pas être nul")
    private String lastName;
    @Email
    @NotNull(message = "L'email ne peut pas être nul")
    private String emailAdress;
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$")
    @NotNull(message = "L'email ne peut pas être nul")
    private String password;
    private boolean admin;

    @OneToMany(mappedBy = "opinions")
    private ArrayList<Opinion> opinions;
}
