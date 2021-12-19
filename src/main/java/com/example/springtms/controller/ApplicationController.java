package com.example.springtms.controller;

import com.example.springtms.entity.Application;
import com.example.springtms.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/application")
public class ApplicationController {
    @Autowired
    private ApplicationRepository applicationRepository;

    @GetMapping
    public List<Application> index() {
        var numbers = new LinkedList<Application>();
        this.applicationRepository.findAll().forEach(numbers::add);
        return numbers;
    }

    @GetMapping("/{id}")
    public Application getById(@PathVariable("id")Long id){
        return this.applicationRepository.findById(id).orElseGet(Application::new);
    }
}
