package com.kenzie.appserver.service.model;

import java.util.Objects;

public class Company {
    private String companyId;
    private String companyName;
    private String Email;
    private String website;
    private String location;
    private String contactNumber;

    public Company(String companyId, String companyName, String contactNumber, String location){
        this.companyId= companyId;
        this.companyName= companyName;
        this.contactNumber= contactNumber;
        this.location= location;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }


}
