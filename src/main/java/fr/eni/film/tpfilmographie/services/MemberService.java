package fr.eni.film.tpfilmographie.services;

import fr.eni.film.tpfilmographie.bo.Member;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {
    Member findMemberById(Integer id);
}
