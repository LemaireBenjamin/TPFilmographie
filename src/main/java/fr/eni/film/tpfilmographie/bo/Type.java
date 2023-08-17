package fr.eni.film.tpfilmographie.bo;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Type implements Serializable {
    @Serial
    private static final long serialVersionUID = -669341106819076166L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Le label ne peut pas être vide.")
    private String label;

    @OneToMany(mappedBy = "type",cascade = CascadeType.ALL)
    private List<Movie> movies;




}
