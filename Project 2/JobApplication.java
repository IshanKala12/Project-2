package jobAppplicationTrackingSystem;

import java.util.Date;

public class JobApplication implements Comparable<JobApplication>, Cloneable {
    private String applicantName;
    private String position;
    private Date applicationDate;
    private int experienceYears;

    public JobApplication(String applicantName, String position, Date applicationDate, int experienceYears) {
        this.applicantName = applicantName;
        this.position = position;
        this.applicationDate = applicationDate;
        this.experienceYears = experienceYears;
    }

    
    public String getApplicantName() { return applicantName; }
    public String getPosition() { return position; }
    public Date getApplicationDate() { return applicationDate; }
    public int getExperienceYears() { return experienceYears; }

    @Override
    public int compareTo(JobApplication other) {
        return this.applicationDate.compareTo(other.applicationDate);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "JobApplication{" +
                "applicantName='" + applicantName + '\'' +
                ", position='" + position + '\'' +
                ", applicationDate=" + applicationDate +
                ", experienceYears=" + experienceYears +
                '}';
    }
}