package fr.eni.film.tpfilmographie.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.util.ArrayList;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Director extends Participant {
    @Serial
    private static final long serialVersionUID = 127462125642238869L;
    @OneToMany(mappedBy = "director")
    private ArrayList<Movie> directed_movies;
}
