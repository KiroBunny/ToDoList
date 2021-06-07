package com.example.ToDoList.controller;


import com.example.ToDoList.model.Note;
import com.example.ToDoList.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NoteController {
    private final NoteService noteService;

    @GetMapping("/notes")
    public List<Note> getNoteList(){
        return  noteService.getNoteList();
    }

    @GetMapping("/notes/{id}")
    public Note getSingleNote(@PathVariable int id){
        return noteService.getSingleNote(id);
    }
}
