package com.joaotinelli.joaostore.service.impl;

import com.joaotinelli.joaostore.dto.ContactRequestDto;
import com.joaotinelli.joaostore.entity.Contact;
import com.joaotinelli.joaostore.repository.ContactRepository;
import com.joaotinelli.joaostore.service.IContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements IContactService {

    private final ContactRepository contactRepository;

    @Override
    public boolean saveContact(ContactRequestDto contactRequestDto) {
       try {
           Contact contact = transformToEntity(contactRequestDto);
           contact.setCreatedAt(Instant.now());
           contact.setCreatedBy(contactRequestDto.getName());
           contactRepository.save(contact);
           return true;
       } catch (Exception exception){
           return false;
       }
    }

    private Contact transformToEntity(ContactRequestDto contactRequestDto){
        Contact newContact = new Contact();
        BeanUtils.copyProperties(contactRequestDto, newContact);
        return newContact;
    }
}
