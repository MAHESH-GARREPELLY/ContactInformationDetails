package com.mahesh.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahesh.repository.ContactRepository;
import com.mahesh.entity.Contact;
@Service
@Transactional
public class ContactServiceImpl implements ContactService{
	// Implementing Constructor based DI
			private ContactRepository repository;
			
			public ContactServiceImpl() {
				
			}
			@Autowired
			public ContactServiceImpl(ContactRepository repository) {
				super();
				this.repository = repository;
			}

	public List<Contact> getAllContacts() {
		List<Contact> list = new ArrayList<Contact>();
		repository.findAll().forEach(e -> list.add(e));
		return list;
	}

	public Contact getContactById(Integer id) {
		Contact contact = repository.findById(id).get();
		return contact;
	}

	public boolean saveContact(Contact contact) {
		try {
			repository.save(contact);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}

	public boolean deleteContactById(Integer id) {
		try {
			repository.deleteById(id);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}

}
