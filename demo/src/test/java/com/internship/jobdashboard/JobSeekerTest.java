
package com.internship.jobdashboard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JobSeekerTest {

    @Test
    public void testJobSeekerUpdate() {
        JobSeeker seeker = new JobSeeker("Charlie");
        seeker.update("Job Update");
    }
}
