package com.jspider.conmanage.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.conmanage.pojo.Contact;
import com.jspider.conmanage.repository.ContactRepository;

@RestController
@CrossOrigin("http://localhost:3000")
public class ContactController {
	@Autowired
	private ContactRepository contactRepository;
	
	 @GetMapping("/contacts")
	    public List<Contact> getAllContacts() {
	        return contactRepository.findAll();
	    }

	    @GetMapping("contacts/{id}")
	    public Optional<Contact> getContact(@PathVariable int id) {
	        return contactRepository.findById(id);
	    }

	    @PostMapping("/contacts")
	    public Contact createContact(@RequestBody Contact contact) {
	        return contactRepository.save(contact);
	    }

	    @PutMapping("contacts/{id}")
	    public Contact updateContact(@PathVariable int id, @RequestBody Contact updatedContact) {
	        updatedContact.setId(id);
	        return contactRepository.save(updatedContact);
	    }

	    @DeleteMapping("contacts/{id}")
	    public void deleteContact(@PathVariable int id) {
	        contactRepository.deleteById(id);
	    }

}
