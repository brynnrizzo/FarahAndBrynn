package com.kenzie.appserver.service;

import com.kenzie.appserver.repositories.EmployerRepository;
import com.kenzie.appserver.repositories.ExampleRepository;
import com.kenzie.appserver.repositories.model.ExampleRecord;
import com.kenzie.appserver.service.model.Employer;

public class EmployerService {

    private EmployerRepository employerRepository;

    public EmployerService(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }
    public Employer findById(String id){
        Employer employerFromBackend= employerRepository
                .findById(id)
                .map(employer-> new Employer(employer.getId(), employer.getName()))
                .orElse(null);
        return employerFromBackend;

    }
    public Employer addNewEmployer(Employer employer){
        EmployerRepository employerRepository = new EmployerRecord();
        exampleRecord.setId(example.getId());
        exampleRecord.setName(example.getName());
        exampleRepository.save(exampleRecord);
        return example;

    }

}
