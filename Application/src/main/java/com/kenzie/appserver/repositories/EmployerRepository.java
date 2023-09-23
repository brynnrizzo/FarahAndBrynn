package com.kenzie.appserver.repositories;

import com.kenzie.appserver.repositories.model.ExampleRecord;
import org.springframework.data.repository.CrudRepository;

public interface EmployerRepository extends CrudRepository<ExampleRecord, String> {
}
