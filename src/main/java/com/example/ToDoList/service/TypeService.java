package com.example.ToDoList.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.ToDoList.model.Type;
import com.example.ToDoList.repository.TypeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TypeService {

    private final TypeRepository typeRepository;

    public List<Type> getTypeList(){
        return typeRepository.findAll();
    }

    public  Type getSingleType(int id) {
        return  typeRepository.findById(id).orElseThrow();
    }

}
