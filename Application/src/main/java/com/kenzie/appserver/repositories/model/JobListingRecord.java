package com.kenzie.appserver.repositories.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.List;
@DynamoDBTable(tableName = "JobListing")
public class JobListingRecord {
    private String jobId;
    private String jobTitle;
    private String jobDescription;
    private String Location;
    private boolean Status;
    private double Salary;
    private List<String> Skills;
    @DynamoDBHashKey(attributeName = "jobId")
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
    @DynamoDBAttribute(attributeName = "JobTitle")
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    @DynamoDBAttribute(attributeName = "JobDescription")
    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
    @DynamoDBAttribute(attributeName = "Location")
    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {

    }
    @DynamoDBAttribute(attributeName = "status")
    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }
    @DynamoDBAttribute(attributeName = "Salary")
    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
    @DynamoDBAttribute(attributeName = "Skills")
    public List<String> getSkills() {
        return Skills;
    }

    public void setSkills(List<String> skills) {
        Skills = skills;
    }

}
