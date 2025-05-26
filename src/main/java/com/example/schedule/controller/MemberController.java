package com.example.schedule.controller;

import com.example.schedule.domain.Member;
import com.example.schedule.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    private final MemberService service;

    public MemberController(MemberService service) {
        this.service = service;
    }

    @PostMapping
    public Member create(@RequestBody Member member) {
        return service.create(member);
    }

    @GetMapping
    public List<Member> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Member getOne(@PathVariable Long id) {
        return service.findById(id).orElseThrow();
    }

    @PatchMapping("/{id}")
    public Member update(@PathVariable Long id, @RequestBody Member member) {
        return service.update(id, member);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
