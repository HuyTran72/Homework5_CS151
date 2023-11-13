package com.example.Q2;

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
