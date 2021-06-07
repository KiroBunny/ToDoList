package com.example.ToDoList.controller.dto;

import com.example.ToDoList.model.Task;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TaskDtoMapper {

    private TaskDtoMapper() {
    }

    public  static List<TaskDto> mapToTaskDtos(List<Task> taskList){
        return taskList.stream()
                .map(TaskDtoMapper::mapToTypeDto).collect(Collectors.toList());
    }

    public static TaskDto mapToTypeDto(Task task) {
        return TaskDto.builder()
                .id(task.getId())
                .name(task.getName())
                .done(task.isDone())
                .end_Date(task.getEnd_Date())
                .build();
    }
}
