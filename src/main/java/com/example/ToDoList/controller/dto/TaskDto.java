package com.example.ToDoList.controller.dto;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder

public class TaskDto {
    private  int id;
    private String name;
    private boolean done;
    private LocalDate end_Date;
}
