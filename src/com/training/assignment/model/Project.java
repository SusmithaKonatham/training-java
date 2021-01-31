package com.training.assignment.model;

public class Project 
{
	private String projectName;
    private String projectTechnology;
    private int uniqueIdentifier;
    private String projectDuration;

    public Project(String projectName, String projectTechnology, int uniqueIdentifier, String projectDuration) {
        this.projectName = projectName;
        this.projectTechnology = projectTechnology;
        this.uniqueIdentifier = uniqueIdentifier;
        this.projectDuration = projectDuration;
    }

    public void displayInformation() {
        System.out.println(this.projectName + ", " + this.projectTechnology + ", " + this.projectDuration
                + ", " + this.uniqueIdentifier);
    }

    public int getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public void update(String projectName, String projectTechnology, String projectDuration) {
        this.projectName = projectName;
        this.projectTechnology = projectTechnology;
        this.projectDuration = projectDuration;
    }
	
}
