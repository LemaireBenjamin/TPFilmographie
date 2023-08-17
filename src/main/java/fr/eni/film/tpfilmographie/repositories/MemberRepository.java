package fr.eni.film.tpfilmographie.repositories;

import fr.eni.film.tpfilmographie.bo.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Integer> {

}
