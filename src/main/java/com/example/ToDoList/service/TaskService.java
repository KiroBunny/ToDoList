package com.example.ToDoList.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.ToDoList.model.Task;
import com.example.ToDoList.repository.TaskRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public List<Task> getTaskList(){
        return taskRepository.findAll();
    }

    public Task getSingleTask(int id) {
        return taskRepository.findById(id).orElseThrow();

    }
}
