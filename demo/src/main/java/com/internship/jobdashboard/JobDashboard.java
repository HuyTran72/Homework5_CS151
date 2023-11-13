// com.internship.jobdashboard.JobDashboard
package com.internship.jobdashboard;

import java.util.ArrayList;
import java.util.List;

public class JobDashboard {
    private List<JobObserver> observers = new ArrayList<>();

    public void addObserver(JobObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(JobObserver observer) {
        observers.remove(observer);
    }

    public void postJob(String jobDetails) {
        for (JobObserver observer : observers) {
            observer.update(jobDetails);
        }
    }
}
