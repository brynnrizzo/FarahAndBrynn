package com.kenzie.appserver.service;

import com.kenzie.appserver.repositories.EmployerRepository;
import com.kenzie.appserver.repositories.ExampleRepository;
import com.kenzie.appserver.repositories.model.EmployerRecord;
import com.kenzie.appserver.repositories.model.ExampleRecord;
import com.kenzie.appserver.service.model.Employer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class EmployerService {

    private EmployerRepository employerRepository;

    public EmployerService(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }
    public Employer findEmployerById(String id){

        Employer employerFromBackend= employerRepository
                .findById(id)
                .map(employer-> new Employer(employer.getEmployerId(),
                        employer.getCompanyName(),
                        employer.getCredentials()))
                .orElse(null);

        return employerFromBackend;
    }

    public List<Employer> findByIdAndCredentialsAndCompanyName(String id, String credentials, String companyName) {

        Iterable<EmployerRecord> employerRecords =
                employerRepository.filterEmployer(id, credentials, companyName);

        List<Employer> employers = new ArrayList<>();

        for (EmployerRecord record : employerRecords) {
            Employer employer = convertToEmployer(record);
            employers.add(employer);
        }
        return employers;
    }

        public Employer convertToEmployer(EmployerRecord employerRecord) {

            Employer employer = new Employer(employerRecord.getEmployerId(),
                    employerRecord.getCompanyName(),
                    employerRecord.getCredentials());

            return employer;
        }


}

