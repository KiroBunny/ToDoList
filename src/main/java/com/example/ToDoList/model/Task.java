package com.example.ToDoList.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private String name;
    private boolean done;
    private LocalDate end_Date;

    @OneToMany
    @JoinColumn(name = "id_task")
    private List<Note> notes;

}