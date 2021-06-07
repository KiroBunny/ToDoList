package com.example.ToDoList.controller;

import com.example.ToDoList.controller.dto.TypeDto;
import com.example.ToDoList.controller.dto.TypeDtoMapper;
import com.example.ToDoList.model.Type;
import com.example.ToDoList.service.TypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class TypeController {

    private  final TypeService typeService;

    @GetMapping("/types")
    public List<TypeDto> getTypeList(){
        return TypeDtoMapper.mapToTypeDtos(typeService.getTypeList());
    }


    @GetMapping("/types/{id}")
    public Type getSingleType(@PathVariable int id){
        return typeService.getSingleType(id);
    }
}
