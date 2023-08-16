package fr.eni.film.tpfilmographie.bo;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.util.ArrayList;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Actor extends Participant {
    @Serial
    private static final long serialVersionUID = -1864061891237264032L;
    @ManyToMany(mappedBy = "actors")
    private ArrayList<Movie> movies;
}
