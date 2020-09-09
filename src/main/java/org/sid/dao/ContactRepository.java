package org.sid.dao;

import java.util.Optional;

import org.sid.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Long>{

	//public Contact findById(Long id);
	
	
}

         