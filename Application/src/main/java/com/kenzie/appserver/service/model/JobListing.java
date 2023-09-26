package com.kenzie.appserver.service.model;

import java.util.List;

public class JobListing {
    private String jobId;
    private String jobTitle;
    private String jobDescription;
    private String location;
    private boolean status;
    private double salary;
    private List<String>skills;

    public JobListing(String jobId, String jobTitle,String jobDescription,String location,boolean status,double salary,List<String>skills) {
      this.jobId= jobId;
      this.jobTitle=jobTitle;
      this.jobDescription=jobDescription;
      this.location= location;
      this.status= status;
      this.salary= salary;
      this.skills= skills;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
    }
}
