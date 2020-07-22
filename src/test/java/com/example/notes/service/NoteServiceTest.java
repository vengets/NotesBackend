package com.example.notes.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class NoteServiceTest {

    @InjectMocks
    NoteService service;

    @Test
    public void shouldReturnUsersNotes() {
        String userId = "venkat";
        Map<String, String> notes = new HashMap<>();
        String key = "sample";
        String content = "This is a sample notes";
        notes.put(key, content);
        service.notes = new HashMap<>();
        service.notes.put(userId, notes);

        String result = service.getNotes("sample", userId);

        assertEquals(result, content);

    }

}