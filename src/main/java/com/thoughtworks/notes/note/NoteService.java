package com.thoughtworks.notes.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService {

    @Autowired
    NoteRepository noteRepository;

    public Note create(Note note) {
        return noteRepository.save(note);
    }
}
