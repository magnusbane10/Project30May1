package com.company1;

public class Unemployed extends Person {
    private boolean freeTime;
    private String mainJob;

    public Unemployed(int age, String name, String CNP, Address address, boolean freeTime, String mainJob) {
        super(age, name, CNP, address);
        this.freeTime = freeTime;
        this.mainJob = mainJob;
    }

    public Unemployed(boolean freeTime, String mainJob) {
        this.freeTime = freeTime;
        this.mainJob = mainJob;
    }

    public Unemployed() {
    }

    public boolean isFreeTime() {
        return freeTime;
    }

    public void setFreeTime(boolean freeTime) {
        this.freeTime = freeTime;
    }

    public String getMainJob() {
        return mainJob;
    }

    public void setMainJob(String mainJob) {
        this.mainJob = mainJob;
    }

    @Override
    public int getNrOfDaysWithoutWorkPerWeek() {
        return 7;
    }
}
