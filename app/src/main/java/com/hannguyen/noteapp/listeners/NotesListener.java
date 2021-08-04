package com.hannguyen.noteapp.listeners;

import com.hannguyen.noteapp.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
