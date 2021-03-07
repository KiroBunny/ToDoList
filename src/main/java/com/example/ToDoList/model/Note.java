package com.example.ToDoList.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Note {
    @Id
    private int id;
    private String note;
}