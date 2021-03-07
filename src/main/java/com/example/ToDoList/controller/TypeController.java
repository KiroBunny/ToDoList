package com.example.ToDoList.controller;

import com.example.ToDoList.model.Type;
import com.example.ToDoList.service.TypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TypeController {

    private  final TypeService typeService;

    @GetMapping("/types")
    public List<Type> getTypeList(){
        return typeService.getTypeList();
    }

    @GetMapping("/types/{id}")
    public Type getSingleType(@PathVariable int id){
        return typeService.getSingleType(id);
    }
}
