package com.example.Q2;

import java.util.ArrayList;
import java.util.List;

public class JobDashboard {
    private List<JobObserver> observers = new ArrayList<>();

    public void addObserver(JobObserver observer) {
        observers.add(observer);
    }

    public void postJob(String jobDetails) {
        for (JobObserver observer : observers) {
            observer.update(jobDetails);
        }
    }
}
