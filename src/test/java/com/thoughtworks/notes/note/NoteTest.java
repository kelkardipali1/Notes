package com.thoughtworks.notes.note;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class NoteTest {
    @Test
    public void expectsNoteWithTitleAndDescriptionAfterSerialization() throws IOException {
        Note note = new Note(1, "first Note", "first Note");
        ObjectMapper objectMapper = new ObjectMapper();

        String noteString = objectMapper.writeValueAsString(note);

        Assert.assertTrue(noteString.contains("\"title\":\"first Note\""));
        Assert.assertTrue(noteString.contains("\"description\":\"first Note\""));
        Assert.assertTrue(noteString.contains("\"id\":1"));
    }
}
