package com.smart.service;

import com.smart.model.Notes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

public class InitApplicationService {

    private static Logger LOGGER = LoggerFactory.getLogger(InitApplicationService.class);

    @Autowired
    NotesService notesService;

    @EventListener(ApplicationReadyEvent.class)
    public void initializeTestData(){
        LOGGER.info("Initialize test data");
        notesService.saveNotes(new Notes("Test1", "Content1"));
        notesService.saveNotes(new Notes("Test2","Content2"));

        LOGGER.info("Initialization Completed");
    }
}
