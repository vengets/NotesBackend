package com.example.notes.service;

import com.example.notes.model.Note;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class NoteService {

    Map<String, Map<String, String>> notes;

    public NoteService() {
        this.notes = new HashMap<>();

        Map<String, String> userNotes = new HashMap<>();
        userNotes.put("a", "Apples are one of the most popular fruits");
        userNotes.put("b", "A banana is an elongated, edible fruit");
        userNotes.put("c", "The carrot is a root vegetable,not fruit");
        Map<String, String> userNotes1 = new HashMap<>();
        userNotes1.put("a", "abacus - Some text");
        userNotes1.put("b", "Charles Babbage was an English polymath.");
        userNotes1.put("c", "At each increase of knowledge, human labour becomes abridged.");

        notes.put("user1", userNotes);
        notes.put("user2", userNotes1);
    }


    public List<Note> getAllNotes(String userId) {
        if(notes.containsKey(userId))  {
           return notes.get(userId).keySet().stream().map(key -> new Note(key, notes.get(userId).get(key))).collect(Collectors.toList());
        }
        return null;
    }

    public String getNotes(String noteId, String userId) {
        if(notes.containsKey(userId))  {
            return notes.get(userId).get(noteId);
        }
        return null;
    }
}
