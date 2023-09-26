package com.kenzie.appserver.service;

import com.kenzie.appserver.repositories.EmployerRepository;
import com.kenzie.appserver.repositories.ExampleRepository;
import com.kenzie.appserver.repositories.JobListingRepository;
import com.kenzie.appserver.repositories.model.JobListingRecord;
import com.kenzie.appserver.service.model.JobListing;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class JobListingService {
    private JobListingRepository jobListingRepository;
   public JobListingService(JobListingRepository jobListingRepository){
       this.jobListingRepository=jobListingRepository;
   }
public List<JobListing> findAllJobListing(){
       List<JobListing> listings= new ArrayList<>();
       Iterable<JobListingRecord> listingIterable= jobListingRepository.findAll();
       for(JobListingRecord record: listingIterable){
           listings.add(new JobListing(record.getJobId(),
                   record.getJobTitle(),
                   record.getJobDescription(),
                   record.getLocation(),
                   record.isStatus(),
                   record.getSalary(),
                   record.getSkills()));
       }
       return listings;
}



    public JobListing findById(String id) {
       JobListing jobListingFromBackend= jobListingRepository
               .findById(id)
               .map(jobListing -> new JobListing(jobListing.getJobId(),
                       jobListing.getJobTitle(),
                       jobListing.getJobDescription(),
                       jobListing.getLocation(),
                       jobListing.isStatus(),
                       jobListing.getSalary(),
                       jobListing.getSkills()))

               .orElse(null);

       return jobListingFromBackend;

    }


    public JobListing addNewJobListing(JobListing jobListing){
        JobListingRecord jobListingRecord= new JobListingRecord();
        jobListingRecord.setJobId(jobListing.getJobId());
        jobListingRecord.setJobTitle(jobListing.getJobTitle());
        jobListingRecord.setJobDescription(jobListing.getJobDescription());
        jobListingRecord.setLocation(jobListing.getLocation());
        jobListingRecord.setSkills(jobListing.getSkills());
        jobListingRecord.setStatus(jobListing.isStatus());
        jobListingRecord.setSalary(jobListing.getSalary());
        return jobListing;

    }

    public void updateJobListing (JobListing jobListing){
       if(jobListingRepository.existsById(jobListing.getJobId())){
           JobListingRecord jobListingRecord= new JobListingRecord();
           jobListingRecord.setJobId(jobListing.getJobId());
           jobListingRecord.setJobTitle(jobListing.getJobTitle());
           jobListingRecord.setJobDescription(jobListing.getJobDescription());
           jobListingRecord.setLocation(jobListing.getLocation());
           jobListingRecord.setSkills(jobListing.getSkills());
           jobListingRecord.setStatus(jobListing.isStatus());
           jobListingRecord.setSalary(jobListing.getSalary());

           jobListingRepository.save(jobListingRecord);
       }


    }
    public void deleteJobListing(String jobListingId){
       jobListingRepository.deleteById(jobListingId);


    }

}
