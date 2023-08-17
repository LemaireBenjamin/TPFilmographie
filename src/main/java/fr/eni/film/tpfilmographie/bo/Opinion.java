package fr.eni.film.tpfilmographie.bo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Opinion implements Serializable {
    @Serial
    private static final long serialVersionUID = 7057753112314604136L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String text;
    private Integer rating;

    @ManyToOne(cascade = CascadeType.ALL)
    private Movie movie;
    @ManyToOne(cascade = CascadeType.ALL)
    private Member member;

}
