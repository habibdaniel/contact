package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Stream;

import org.sid.dao.ContactRepository;
import org.sid.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactsApplication implements CommandLineRunner{

	@Autowired
	private ContactRepository contactRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ContactsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//DateFormat df = new SimpleDateFormat("dd/mm/YYYY");
		/*contactRepository.save(new Contact ("SORO","CHOUNFOUGO",df.parse("01/01/2020"),"joch@gmail.com",01643,"src/test/photo.jpg"));
		contactRepository.save(new Contact ("DIALLO","CHECK",df.parse("01/02/2020"),"check@gmail.com",01643,"src/test/photo.jpg"));
		contactRepository.save(new Contact ("ADJIDAN","Joel",df.parse("01/03/2020"),"adj@gmail.com",01643,"src/test/photo.jpg"));
		contactRepository.save(new Contact ("GOMISSI","Noel",df.parse("01/04/2020"),"noel@gmail.com",01643,"src/test/photo.jpg"));
		contactRepository.save(new Contact ("ELIDJE","Aka",df.parse("01/04/2020"),"noel@gmail.com",01643,"src/test/photo.jpg"));
	  */
		
		
		/*contactRepository.findAll().forEach(c ->{
			System.out.println(c.toString());
		});*/
		
		/*********************************************/
		
		
		   
	  /*  Stream.of("SORO","CHOUNFOUGO",df.parse("01/01/2020"),"joch@gmail.com",01643,"src/test/photo.jpg").forEach(name -> {
	    	Contact contact = new Contact();
	    	contactRepository.save(contact);
	       });
	   
	    
	    Stream.of("administrateur", "utilisateur", "etranger", "visiteur", "anonyme").forEach(name -> {
	        Role role = new Role(name.toUpperCase());
	        roleRepository.save(role);
	       });
	    
	    
	    Stream.of("DIALLO","cHECK",df.parse("01/02/2020"),"check@gmail.com",01643,"src/test/photo.jpg").forEach(name -> {
	    	Contact contact = new Contact();
	    	contactRepository.save(contact);
	    });
	    
	    Stream.of("ADJIDAN","Joel",df.parse("01/03/2020"),"adj@gmail.com",01643,"src/test/photo.jpg").forEach(name -> {
	    	Contact contact = new Contact();
	    	contactRepository.save(contact);
	    });
	    
	    Stream.of("GOMISSI","Noel",df.parse("01/04/2020"),"noel@gmail.com",01643,"src/test/photo.jpg").forEach(name -> {
	    	Contact contact = new Contact();
	    	contactRepository.save(contact);
	    });
	    
	    contactRepository.findAll().forEach((contact) -> {
	         System.out.println("valeur contact --- "+contact);
	       });
		
		*/
		
		
	}

	
}
