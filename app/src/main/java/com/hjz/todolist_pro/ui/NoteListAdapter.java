package com.hjz.todolist_pro.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hjz.todolist_pro.NoteOperator;
import com.hjz.todolist_pro.R;
import com.hjz.todolist_pro.model.Note;

import java.util.ArrayList;
import java.util.List;

public class NoteListAdapter extends RecyclerView.Adapter<NoteViewHolder>{
    private final NoteOperator operator;
    private final List<Note> notes = new ArrayList<>();

    public NoteListAdapter(NoteOperator operator) {
        this.operator = operator;
    }

    public void refresh(List<Note> newNotes) {
        notes.clear();
        if (newNotes != null) {
            notes.addAll(newNotes);
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int pos) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_note, parent, false);
        return new NoteViewHolder(itemView, operator);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int pos) {
        holder.bind(notes.get(pos));
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }
}
