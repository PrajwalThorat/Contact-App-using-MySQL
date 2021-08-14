package com.stackroute.contact.controller;

import com.stackroute.contact.model.Contact;
import com.stackroute.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/contact")
public class ContactController {
    private ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService){
        this.contactService=contactService;
    }
    @GetMapping("/welcome")
    public String welcomeMessage(){
        return "Welcome to Spring Boot";
    }

    @PostMapping
    public Contact addContact(@RequestBody Contact contact){
        final Optional<Contact> con=this.contactService.addNewContact(contact);
        if(con.isPresent())
            return con.get();
        else
            return null;
    }
}
