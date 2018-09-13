package com.smart.service;

import com.smart.model.Notes;
import com.smart.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NotesServiceImpl implements NotesService {

    @Autowired
    private NotesRepository notesRepository;

    @Override
    public List<Notes> findAll() {
        return notesRepository.findAll();
    }

    @Override
    public Notes findOne(Long id) {
        return notesRepository.findOneById(id);
    }


    @Override
    public Notes saveNotes(Notes notes) {
        return notesRepository.save(notes);
    }

    @Override
    public void deleteNotes(Long id) {
        notesRepository.deleteById(id);
    }


}
