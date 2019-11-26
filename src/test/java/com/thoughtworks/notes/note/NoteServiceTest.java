package com.thoughtworks.notes.note;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NoteServiceTest {

    @Autowired
    NoteService noteService;

    @Test
    public void createANote() {
        Note note = noteService.create(new Note(2, "first Note", "first note"));
        Assert.assertEquals("first Note", note.getTitle());
    }
}
