package com.example.notes.controller;

import com.example.notes.model.Note;
import com.example.notes.service.NoteService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class NotesControllerTest {

    @Mock
    private NoteService service;

    @InjectMocks
    private NotesController controller;

    @Test
    void shouldGetNotes() {
        String noteId = "sampleId";
        String userId = "user1";
        String note = "Here is the sample notes";
        List<Note> notes = new ArrayList<>();
        notes.add(new Note(noteId, note));
        when(service.getAllNotes(userId)).thenReturn(notes);

        ResponseEntity<List<Note>> result = controller.getAllNotes(userId);

        assertEquals(result.getStatusCode(), HttpStatus.OK);
        assertEquals(result.getBody(), notes);
    }
}