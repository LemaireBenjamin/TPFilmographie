package fr.eni.film.tpfilmographie.bo;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Movie implements Serializable {

    @Serial
    private static final long serialVersionUID = 8143000843419167816L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Le titre ne doit pas être nul")
    private String title;

    @NotNull
    @Digits(integer = 4, fraction = 0)
    private int releaseDate;
    @Min(0)
    private int duration; // minute

    @Size(min = 20,max=250,message = "Le nombre de caractère doit être entre 20 et 250")
    private String synopsis;

    @ManyToOne
    private Type type;

    @OneToMany(mappedBy = "opinions")
    private ArrayList<Opinion> opinions;

    @ManyToMany
    private ArrayList<Actor> actors;

    @ManyToOne
    private Director director;


}
