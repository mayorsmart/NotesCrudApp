package com.smart.service;

import com.smart.model.Notes;

import java.util.List;
import java.util.Optional;

public interface NotesService {

    List<Notes> findAll();

    Notes findOne(Long id);

    Notes saveNotes(Notes notes);

    void deleteNotes(Long id);


    }



