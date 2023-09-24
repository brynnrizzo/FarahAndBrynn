package com.kenzie.appserver.service;

import com.kenzie.appserver.service.model.JobListing;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class JobListingService {

    private List<JobListing> jobListings;

    public JobListingService(List<JobListing> jobListings) {
        this.jobListings = jobListings;
    }

    public List<JobListing> searchJobsByKeywords(List<String> keywords) {
        //TODO

        /*“As a job seeker I want to search for jobs based on keywords”*/
        List<JobListing> matchingJobs = new ArrayList<>();

        // Iterate through each job listing
        for (JobListing jobListing : jobListings) {
            // each keyword checkS for a match
            for (String keyword : keywords) {
                // Checks if the job title contains the current keyword
                if (jobListing.getJobTitle().contains(keyword)) {
                    // checks if match if found then adds.
                    matchingJobs.add(jobListing);
                    break;
                }
            }
        }

        return matchingJobs;



    }

    public List<JobListing> filterJobs(){
         //TODO
        /*“As a job seeker I want to filter through
        jobs that align with my skills, preferences,
        and career goals”*/

        return null;
    }

    public void postJob (){
        //TODO
        /*“As an employer I want to post a new job listing”*/
    }
    public void updateJob(){
        //TODO
        /*“As an employer I want to update the job listing*/

    }

}
