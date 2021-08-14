package com.stackroute.contact.service;

import com.stackroute.contact.model.Contact;

import java.util.Optional;

public interface ContactService {
    Optional<Contact> addNewContact(Contact contact);
}
