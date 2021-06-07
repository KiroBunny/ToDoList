package com.example.ToDoList.controller;

import com.example.ToDoList.controller.dto.TaskDto;
import com.example.ToDoList.controller.dto.TaskDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.ToDoList.model.Task;
import com.example.ToDoList.service.TaskService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/tasks")
    public List<TaskDto> getTaskList(){
        return TaskDtoMapper.mapToTaskDtos(taskService.getTaskList());
    }

    @GetMapping("/tasks/{id}")
    public Task getSingleTask(@PathVariable int id){
        return  taskService.getSingleTask(id);
    }
}