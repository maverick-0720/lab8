package com.cenfotec.contacs.contactsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cenfotec.contacs.contactsapi.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
