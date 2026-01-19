package com.joaotinelli.joaostore.controller;

import com.joaotinelli.joaostore.dto.ContactRequestDto;
import com.joaotinelli.joaostore.service.IContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/contacts")
@RequiredArgsConstructor
public class ContactController {

    private final IContactService iContactService;

    @PostMapping
    public boolean saveContact(@RequestBody ContactRequestDto contactRequestDto){
        return iContactService.saveContact(contactRequestDto);
    }
}
