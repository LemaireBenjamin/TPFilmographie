package fr.eni.film.tpfilmographie.bo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("director")
public class Director extends Participant {
    @Serial
    private static final long serialVersionUID = 127462125642238869L;
    @OneToMany(mappedBy = "director",cascade = CascadeType.ALL)
    private List<Movie> directed_movies;
}
