package com.joaotinelli.joaostore.repository;

import com.joaotinelli.joaostore.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
