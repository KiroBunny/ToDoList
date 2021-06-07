package com.example.ToDoList.controller.dto;

import com.example.ToDoList.model.Type;

import java.util.List;
import java.util.stream.Collectors;

public class TypeDtoMapper {

    private TypeDtoMapper() {
    }

    public static List<TypeDto> mapToTypeDtos(List<Type> typeList) {
        return typeList.stream()
                .map(TypeDtoMapper::mapToTypeDto)
                .collect(Collectors.toList());
    }

    public static TypeDto mapToTypeDto(Type type) {
        return TypeDto.builder()
                .id(type.getId())
                .name(type.getName())
                .build();
    }

}
