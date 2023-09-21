package com.kenzie.appserver.service;

import com.kenzie.appserver.repositories.ExampleRepository;

public class EmployerService {

    private EmployerRepository employerRepository;

    public EmployerService(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }
}
