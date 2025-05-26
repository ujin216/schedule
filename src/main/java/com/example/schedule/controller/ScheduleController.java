package com.example.schedule.controller;

import com.example.schedule.domain.Schedules;
import com.example.schedule.service.ScheduleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/schedules")
public class ScheduleController {

    private final ScheduleService service;

    public ScheduleController(ScheduleService service) {
        this.service = service;
    }

    @PostMapping
    public Schedules create(@RequestBody Schedules schedule) {
        return service.create(schedule);
    }

    @GetMapping
    public List<Schedules> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Schedules getOne(@PathVariable Long id) {
        return service.findById(id).orElseThrow();
    }

    @PatchMapping("/{id}")
    public Schedules update(@PathVariable Long id, @RequestBody Schedules schedule) {
        return service.update(id, schedule);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}