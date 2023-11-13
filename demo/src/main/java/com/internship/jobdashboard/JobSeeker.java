// com.internship.jobdashboard.JobSeeker
package com.internship.jobdashboard;

public class JobSeeker implements JobObserver {
    private String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void update(String jobDetails) {
        System.out.println(name + " received job update: " + jobDetails);
    }
}
