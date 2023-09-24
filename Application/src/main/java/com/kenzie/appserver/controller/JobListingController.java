package com.kenzie.appserver.controller;

import com.kenzie.appserver.controller.model.JobListingCreateRequest;
import com.kenzie.appserver.controller.model.JobListingResponse;

import com.kenzie.appserver.service.JobListingService;
import com.kenzie.appserver.service.model.JobListing;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Eva's task #2 out of 3 for Sprint 1
@RestController
@RequestMapping("/job")  //what the address is to the page.. localhost:5001/job  -- to the main job - api side
public class JobListingController {

    private JobListingService jobListingService;
    JobListingController(JobListingService jobListingService) {this.jobListingService = jobListingService;}

    //RETURN A JOB BY ID
    @GetMapping("/{jobId}")  //localhost:5001/job/jobId -- should return json object of a job listing
    public ResponseEntity<JobListingResponse> getJobById(@PathVariable("jobId") String jobId){

        //JobListing jobListing = JobListingService.findById(jobId);
        //check null.. return the response
        return null;
    }

    //TODO 1.Handles job search by keyword
    //User Story: As a job seeker I want to search for jobs when I type a keyword(s)
    //It should have endpoints to perform keyword-based searches and return a list of matching job listings.
    @GetMapping("/search") //edit annotation if needed.. send the keywords through a post*???? overwise maybe use req para........
    public ResponseEntity<JobListingResponse> searchJobsByKeyword(@RequestParam("keywords") List<String> keywords) {

        //check if keywords are null

        JobListingResponse jobListingResponse = new JobListingResponse(); //edit this if needed

        //check if job listings is null

        return ResponseEntity.ok(jobListingResponse); //edit this if needed return the list of jobs by keyword

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
