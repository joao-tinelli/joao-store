package com.joaotinelli.joaostore.service;

import com.joaotinelli.joaostore.dto.ContactRequestDto;

public interface IContactService {
    boolean saveContact(ContactRequestDto contactRequestDto);
}
