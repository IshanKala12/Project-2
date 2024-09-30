package jobAppplicationTrackingSystem;

import java.util.Comparator;

public class JobApplicationComparator implements Comparator<JobApplication> {
    
    public int compare(JobApplication app1, JobApplication app2) {
        return Integer.compare(app2.getExperienceYears(), app1.getExperienceYears());
    }
}
