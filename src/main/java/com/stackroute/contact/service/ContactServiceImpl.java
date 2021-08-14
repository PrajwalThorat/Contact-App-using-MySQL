package com.stackroute.contact.service;

import com.stackroute.contact.dao.ContactRepository;
import com.stackroute.contact.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ContactServiceImpl implements ContactService{
    private ContactRepository contactRepository;

    @Autowired
    public ContactServiceImpl(ContactRepository contactRepository){
        this.contactRepository=contactRepository;
    }
    @Override
    public Optional<Contact> addNewContact(Contact contact) {
        Contact newContact=contactRepository.save(contact);
        return Optional.of(newContact);
    }
}
