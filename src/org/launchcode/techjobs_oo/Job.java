package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // Constructors

    public Job () {
        id = nextId;
        nextId ++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    //Override default methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        //This is for the bonus test but it's not working
//        if (this.equals(new Job())){
//            return "OOPS! This job does not seem to exist.";
//        }
        if (name == "") {
            name = "Data not available";
        }
        if (employer.getValue() == "") {
            employer.setValue("Data not available");
        }
        if (location.getValue() == "") {
            location.setValue("Data not available");
        }
        if (positionType.getValue() == "") {
            positionType.setValue("Data not available");
        }
        if (coreCompetency.getValue() == "") {
            coreCompetency.setValue("Data not available");
        }

        return " " +"\n" + "ID: " + id + "\n" + "Name: " + name + "\n" + "Employer: " + employer.getValue() +"\n" + "Location: " +
                location.getValue() + "\n" + "Position Type: " + positionType.getValue() + "\n" + "Core Competency: " + coreCompetency.getValue()
                + " ";
    }

    // getters and setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
