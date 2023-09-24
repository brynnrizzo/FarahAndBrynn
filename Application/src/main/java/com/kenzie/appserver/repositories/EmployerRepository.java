package com.kenzie.appserver.repositories;


import com.kenzie.appserver.repositories.model.EmployerRecord;
import com.kenzie.appserver.repositories.model.ExampleRecord;
import org.socialsignin.spring.data.dynamodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployerRepository extends CrudRepository<EmployerRecord, String> {
    @Query(fields = "SELECT e FROM EmployerRecord e " +
            "WHERE (:id is null OR e.id = :id) " +
            "AND (:credentials is null OR e.credentials = :credentials) " +
            "AND (:companyName is null OR e.companyName = :companyName)")
    public List<EmployerRecord> filterEmployer(@Param("id") String id,
                                               @Param("credentials") String credentials,
                                               @Param("companyName") String companyName);

import com.kenzie.appserver.repositories.model.ExampleRecord;
import org.springframework.data.repository.CrudRepository;

public interface EmployerRepository extends CrudRepository<ExampleRecord, String> {

}
