package com.example.ToDoList.service;

import com.example.ToDoList.model.Note;
import com.example.ToDoList.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteService {
    private final NoteRepository noteRepository;

    public List<Note> getNoteList(){return noteRepository.findAll();}

    public Note getSingleNote(int id){return noteRepository.findById(id).orElseThrow();}
}
