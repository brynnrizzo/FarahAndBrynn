package com.kenzie.appserver.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kenzie.appserver.IntegrationTest;
import com.kenzie.appserver.service.JobListingService;
import net.andreinc.mockneat.MockNeat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

@IntegrationTest
public class JobListingControllerTest {

    private MockMvc mvc;

    @Autowired
    JobListingService jobListingService;

    private final MockNeat mockNeat = MockNeat.threadLocal();

    private final ObjectMapper mapper = new ObjectMapper();

    //still thinking this test class through***
    //TODO test 1 getJobById
    @Test
    public void getJobById_Exists()throws Exception{

        //GIVEN

        //WHEN

        //THEN

    }

    //TODO test 2 searchJobsByKeyword
    @Test
    public void searchJobsByKeyword_Successful()throws Exception{

        //GIVEN

        //WHEN

        //THEN

    }

    //TODO test 3 filterJobListings
    @Test
    public void filterJobListings_Successful()throws Exception{

        //GIVEN

        //WHEN

        //THEN

    }

    //TODO test 4 createJobListing
    @Test
    public void createJobListing_Successful()throws Exception{

        //GIVEN

        //WHEN

        //THEN

    }

    //TODO test 5 updateJobListing
    @Test
    public void updateJobListing_Successful()throws Exception{

        //GIVEN

        //WHEN

        //THEN

    }

}
