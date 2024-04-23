package com.cyberevolve.journalApp.service;
import com.cyberevolve.journalApp.entity.JournalEntry;

import org.springframework.beans.factory.annotation.Autowired;
import com.cyberevolve.journalApp.repository.JournalEntryRepository;
import org.springframework.stereotype.Component;
import org.bson.types.ObjectId;
import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntry journalEntry) {
        journalEntryRepository.save(journalEntry);
    }

    public List<JournalEntry> getAll(){
        return journalEntryRepository.findAll();
    }

    public Optional<JournalEntry> findById(ObjectId id) {
        return journalEntryRepository.findById(id);
    }
    public void deleteById(ObjectId id) {
         journalEntryRepository.deleteById(id);
    }
}
