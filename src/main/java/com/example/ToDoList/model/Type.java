package com.example.ToDoList.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Type {
    @Id
    private int id;
    private String name;

    @OneToMany
    @JoinColumn(name = "id_type")
    private List<Task> tasks;
}