package com.example.schedule.repository;

import com.example.schedule.domain.Schedules;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedules, Long> {
}
