package com.kenzie.appserver.controller.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

//Eva's task #1 out of 3 for Sprint 1  FROM BACKEND TO THE FRONTEND
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JobListingResponse {
    @JsonProperty("jobID")  //THIS WHEN THE JOB LISTING HAS BEEN CREATED AND WE WERE GIVEN A JOBID
    private String jobID;

    @JsonProperty("jobTitle")
    private String jobTitle;

    @JsonProperty("jobDescription")
    private String jobDescription;

    @JsonProperty("location")
    private String location;

    @JsonProperty("status")
    private boolean status;

    @JsonProperty("Salary")
    private double salary;

    @JsonProperty("Skills")
    private List<String> skills;

    @JsonProperty("jobType")
    private String jobType;

    @JsonProperty("employerID")
    private String employerID;

    @JsonProperty("keywords")
    private List<String> keywords;

    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getEmployerID() {
        return employerID;
    }

    public void setEmployerID(String employerID) {
        this.employerID = employerID;
    }

    public List<String> getKeywords() {return keywords;}

    public void setKeywords(List<String> keywords) {this.keywords = keywords;}

    //add equals & hashcode and toString later if needed
}
