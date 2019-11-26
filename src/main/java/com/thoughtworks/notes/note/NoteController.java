package com.thoughtworks.notes.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notes")
public class NoteController {
    @Autowired
    NoteService noteService;

    @Autowired
    NoteRepository noteRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Note create(@RequestBody Note note) {
        return noteService.create(note);
    }
}
