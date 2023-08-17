package fr.eni.film.tpfilmographie.bo;


import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
@DiscriminatorValue("actor")
public class Actor extends Participant {
    @Serial
    private static final long serialVersionUID = -1864061891237264032L;
    @ManyToMany(mappedBy = "actors",cascade = CascadeType.ALL)
    private List<Movie> movies;
}
