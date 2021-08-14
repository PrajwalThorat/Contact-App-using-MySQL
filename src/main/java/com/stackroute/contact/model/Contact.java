package com.stackroute.contact.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {
    @Id
    private String contactId;
    private String name;
    private String email;
    private String category;

    public Contact(){

    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactId=" + contactId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
