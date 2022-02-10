package com.mahesh.service;

import java.util.List;

import com.mahesh.entity.Contact;

public interface ContactService {
	public List<Contact> getAllContacts();
	public Contact getContactById(Integer id);
	public boolean saveContact(Contact contact);
	public boolean deleteContactById(Integer id);

}
