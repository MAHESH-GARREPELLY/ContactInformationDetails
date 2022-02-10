package com.mahesh.repository;

import org.springframework.data.repository.CrudRepository;

import com.mahesh.entity.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
