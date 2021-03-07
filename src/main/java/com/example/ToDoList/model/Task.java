package com.example.ToDoList.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Task {
    @Id
    private  int id;
    private String name;
    private boolean done;
    private LocalDate end_Date;

    @OneToMany
    @JoinColumn(name = "id_task")
    private List<Note> notes;

}