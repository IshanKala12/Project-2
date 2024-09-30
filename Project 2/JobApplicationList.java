package jobAppplicationTrackingSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JobApplicationList implements Iterable<JobApplication> {
    private List<JobApplication> applications;

    public JobApplicationList() {
        this.applications = new ArrayList<>();
    }

    public void addApplication(JobApplication application) {
        applications.add(application);
    }

    
    public Iterator<JobApplication> iterator() {
        return applications.iterator();
    }
}