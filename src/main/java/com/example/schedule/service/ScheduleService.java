package com.example.schedule.service;

import com.example.schedule.domain.Schedules;
import com.example.schedule.repository.ScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScheduleService {
    private final ScheduleRepository repository;
    public ScheduleService(ScheduleRepository repository){
        this.repository = repository;
    }
    public Schedules create(Schedules schedule) {
        return repository.save(schedule);
    }

    public List<Schedules> findAll() {
        return repository.findAll();
    }

    public Optional<Schedules> findById(Long id) {
        return repository.findById(id);
    }

    public Schedules update(Long id, Schedules newSchedule) {
        Schedules old = repository.findById(id).orElseThrow();
        old.setTitle(newSchedule.getTitle());
        old.setContent(newSchedule.getContent());
        return repository.save(old);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
