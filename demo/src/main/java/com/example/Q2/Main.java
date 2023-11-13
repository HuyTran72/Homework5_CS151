package com.example.Q2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JobDashboard jobDashboard = new JobDashboard();

        // Creating job seekers
        JobObserver jobSeeker1 = new JobSeeker("John");
        JobObserver jobSeeker2 = new JobSeeker("Jane");

        // Adding job seekers as observers
        jobDashboard.addObserver(jobSeeker1);
        jobDashboard.addObserver(jobSeeker2);

        // Posting a new job
        jobDashboard.postJob("Software Engineer Internship in San Francisco, $30/hour");

        // Output:
        // John received job notification: Software Engineer Internship in San Francisco, $30/hour
        // Jane received job notification: Software Engineer Internship in San Francisco, $30/hour
    }
}
