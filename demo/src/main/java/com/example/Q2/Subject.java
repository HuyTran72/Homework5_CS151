package com.example.Q2;

public interface Subject {
    void addObserver(JobObserver observer);

    void removeObserver(JobObserver observer);

    void notifyObservers(String jobDetails);
}
