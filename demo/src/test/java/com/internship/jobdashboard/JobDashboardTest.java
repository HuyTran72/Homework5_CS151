// com.internship.jobdashboard.JobDashboardTest
package com.internship.jobdashboard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JobDashboardTest {

    @Test
    public void testJobDashboardPostJob() {
        JobDashboard jobDashboard = new JobDashboard();
        JobSeeker seeker = new JobSeeker("Bob");

        jobDashboard.addObserver(seeker);
        jobDashboard.postJob("Test Job");

        // Add more assertions or test cases as needed
    }

    // Add more tests for different scenarios...
}
