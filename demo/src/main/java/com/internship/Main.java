// com.internship.Main
package com.internship;

import com.internship.jobdashboard.JobDashboard;
import com.internship.jobdashboard.JobSeeker;

public class Main {
    public static void main(String[] args) {
        JobDashboard jobDashboard = new JobDashboard();

        JobSeeker seeker1 = new JobSeeker("John");
        JobSeeker seeker2 = new JobSeeker("Alice");

        jobDashboard.addObserver(seeker1);
        jobDashboard.addObserver(seeker2);

        jobDashboard.postJob("Software Developer Internship in New York");

        jobDashboard.removeObserver(seeker2);

        jobDashboard.postJob("Data Analyst Full-time in San Francisco");
    }
}
