package com.jspider.conmanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspider.conmanage.pojo.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
