package com.thoughtworks.notes.note;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Note {
    @Id
    private int id;
    private String title;
    private String description;

    public Note(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Note() {

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
