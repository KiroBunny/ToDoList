package com.example.ToDoList.controller.dto;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Id;

@Getter
@Builder
public class TypeDto {
    private int id;
    private String name;

}
