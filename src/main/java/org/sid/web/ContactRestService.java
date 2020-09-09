package org.sid.web;

import java.util.List;
import java.util.Optional;

import org.sid.dao.ContactRepository;
import org.sid.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactRestService {

	@Autowired
	private ContactRepository contactRepository;
	
	@GetMapping("/listeContact")
	public List<Contact> listeDesContacts(){
		
		return contactRepository.findAll();
	}
	
	@GetMapping("/getContact/{id}")
	public Object getContact(@PathVariable Long id){
		
		return contactRepository.findById(id);
	}
	
	@PostMapping("/saveContact")
	public void getContact(@RequestBody Contact c){
		 contactRepository.save(c);
	}
	
	@DeleteMapping("/deleteContact/{id}")
	public void supprimer(@PathVariable Long id){
		contactRepository.deleteById(id);
	}
	
	
}
