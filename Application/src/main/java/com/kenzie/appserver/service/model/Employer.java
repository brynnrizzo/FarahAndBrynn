package com.kenzie.appserver.service.model;

public class Employer {
private String employerId;
private String companyName;
private String credentials;


public Employer(String employerId, String companyName, String credentials){
    this.employerId= employerId;
    this.companyName= companyName;
    this.credentials= credentials;
}

    public String getEmployerId() {
        return employerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCredentials() {
        return credentials;
    }
}
