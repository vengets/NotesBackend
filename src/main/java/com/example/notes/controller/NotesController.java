package com.example.notes.controller;

import com.example.notes.model.Note;
import com.example.notes.service.NoteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/notes")
public class NotesController {

    private NoteService service;

    public NotesController(NoteService service) {
        this.service = service;
    }

    @GetMapping(value = "/test")
    public ResponseEntity<String> getTest() {
        return new ResponseEntity<>("works", HttpStatus.OK);
    }

    @GetMapping(value = "/{userid}")
    public ResponseEntity<List<Note>> getAllNotes(@PathVariable("userid") String userId) {

        List<Note> result = service.getAllNotes(userId);
        if(result == null)
            return new ResponseEntity<>(HttpStatus.OK);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
