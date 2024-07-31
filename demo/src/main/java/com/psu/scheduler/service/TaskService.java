package com.psu.scheduler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psu.scheduler.model.Task;
import com.psu.scheduler.repository.TaskRepository;

import java.util.List;

@Service
public class TaskService
{

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() 
    {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) 
    {
        return taskRepository.findById(id).orElse(null);
    }

    public Task saveTask(org.springframework.scheduling.config.Task task) 
    {
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) 
    {
        taskRepository.deleteById(id);
    }
}
