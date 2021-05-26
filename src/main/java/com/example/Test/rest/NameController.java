package com.example.Test.rest;

import com.example.Test.dtos.Name;
import com.example.Test.repository.NameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/name")
public class NameController {

    @Autowired
    private NameRepository nameRepository;

    @GetMapping("/create")
    public void createName() {
        Name name = new Name();
        name.setName("test");
        nameRepository.save(name);
    }
}
