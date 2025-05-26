package com.example.schedule.service;

import com.example.schedule.domain.Member;
import com.example.schedule.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MemberService {

    private final MemberRepository repository;

    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }

    public Member create(Member member) {
        return repository.save(member);
    }

    public List<Member> findAll() {
        return repository.findAll();
    }

    public Optional<Member> findById(Long id) {
        return repository.findById(id);
    }

    public Member update(Long id, Member newMember) {
        Member old = repository.findById(id).orElseThrow();
        old.setUsername(newMember.getUsername());
        old.setEmail(newMember.getEmail());
        return repository.save(old);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}