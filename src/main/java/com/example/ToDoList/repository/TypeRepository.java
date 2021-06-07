package com.example.ToDoList.repository;

import com.example.ToDoList.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeRepository extends JpaRepository<Type, Integer>{

    @Query("select e from Type e, Task t left join fetch e.tasks")
    List<Type> findAllTypes();
}
