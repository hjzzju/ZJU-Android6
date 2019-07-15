package com.hjz.todolist_pro;

import com.hjz.todolist_pro.model.Note;

public interface NoteOperator {
    void deleteNote(Note note);
    void updateNote(Note note);
}
