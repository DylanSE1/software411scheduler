package com.psu.scheduler.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psu.scheduler.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findAll();

    Object findById(Long id);
}