package com.kenzie.appserver.controller;

import com.kenzie.appserver.controller.model.JobListingCreateRequest;
import com.kenzie.appserver.controller.model.JobListingResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Eva's task #2 out of 3 for Sprint 1
@RestController
@RequestMapping("/job")
public class JobController {
    /*
    once it merges I can uncomment this b/c I need the job listing service

    private JobListingService jobListingService;
    JobController(JobListingService jobListingService) {this.jobListingService = jobListingService;}
     */

    //TODO 1.Handles job search by keyword
    //User Story: As a job seeker I want to search for jobs when I type a keyword(s)
    //It should have endpoints to perform keyword-based searches and return a list of matching job listings.
    @GetMapping("/search") //edit annotation if needed
    public ResponseEntity<JobListingResponse> searchJobsByKeyword(@RequestParam("keywords") List<String> keywords) {

        //more code here

        JobListingResponse jobListingResponse = new JobListingResponse(); //edit this if needed

        //more code here

        return ResponseEntity.ok(jobListingResponse); //edit this if needed

    }

    //TODO 2.Handles filtering job listings based on criteria - still thinking this one
    @GetMapping("/filter") //edit annotation if needed
    public ResponseEntity<List<JobListingResponse>> filterJobListings(@RequestParam("criteria") String criteria){

        //code here

        return null; //edit this when ready
    }

    //TODO 3.Handles posting new job listings
    @PostMapping("/create") //edit annotation if needed
    public ResponseEntity<JobListingResponse> createJobListing(@RequestBody JobListingCreateRequest request){

        //code here

        return null; //edit this when ready
    }

    //TODO 4.Handles updating the job listing
    @PutMapping("/update/{jobID}") //edit annotation if needed
    public ResponseEntity<JobListingResponse> updateJobListing(@PathVariable("jobID") String jobID, @RequestBody JobListingCreateRequest request){

        //code here

        return null; //edit this when ready
    }

}
