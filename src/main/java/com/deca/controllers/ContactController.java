package com.deca.controllers;

import com.deca.entities.Contact;
import com.deca.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
@CrossOrigin(origins="*")
public class ContactController {
    @Autowired
    ContactRepository contactRepo;

    // Create
    @PostMapping
    public Contact save(@RequestBody Contact contact) { return contactRepo.save(contact); }

    // Read
    @GetMapping("{id}")
    public Contact findById(@PathVariable("id") String id) { return contactRepo.findById(id); }

    @GetMapping
    public List<Contact> findAll() {return contactRepo.findAll(); }


    // Update
    @PutMapping("{id}")
    public String update(@PathVariable(value = "id") String id, @RequestBody Contact contact) {
        return contactRepo.update(id, contact);
    }

    // Delete
    @DeleteMapping("{id}")
    public String delete(@PathVariable(value = "id") String id) {
        return contactRepo.delete(id);
    }

}
