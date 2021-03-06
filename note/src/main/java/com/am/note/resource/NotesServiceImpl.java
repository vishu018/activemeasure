package com.am.note.resource;

import com.am.note.dao.NotesRepository;
import com.am.note.model.Note;
import com.am.note.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class NotesServiceImpl implements NotesService {
    NotesRepository notesRepository;

    @Autowired
    NotesServiceImpl(NotesRepository notesRepository){
        this.notesRepository = notesRepository;
    }

    @Override
    public List<Note> getAllNotes(String email) {
        return notesRepository.findByEmail(email);
    }

    @Override
    public boolean createNotes(Note note, String email) {
        return false;
    }

    @Override
    public boolean deleteNotes(Note note) {
        return false;
    }
}
