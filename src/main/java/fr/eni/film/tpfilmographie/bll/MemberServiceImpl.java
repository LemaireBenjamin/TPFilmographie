package fr.eni.film.tpfilmographie.bll;

import fr.eni.film.tpfilmographie.bo.Member;
import fr.eni.film.tpfilmographie.repositories.MemberRepository;
import fr.eni.film.tpfilmographie.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberRepository memberRepository;


    @Override
    public Member findMemberById(Integer id) {
        return memberRepository.findById(id).get();
    }
}
