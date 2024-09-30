package jobAppplicationTrackingSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JobApplicationList applicationList = new JobApplicationList();

        
        applicationList.addApplication(new JobApplication("John", "Software Engineer", new Date(), 5));
        applicationList.addApplication(new JobApplication("Jane", "Data Analyst", new Date(), 3));
        applicationList.addApplication(new JobApplication("Bob", "Product Manager", new Date(), 7));

        
        System.out.println("All applications:");
        for (JobApplication app : applicationList) {
            System.out.println(app);
        }

        
        List<JobApplication> sortedByDate = new ArrayList<>();
        applicationList.forEach(sortedByDate::add);
        Collections.sort(sortedByDate);

        System.out.println("\nApplications sorted by date:");
        sortedByDate.forEach(System.out::println);

        
        List<JobApplication> sortedByExperience = new ArrayList<>(sortedByDate);
        Collections.sort(sortedByExperience, new JobApplicationComparator());

        System.out.println("\nApplications sorted by experience:");
        sortedByExperience.forEach(System.out::println);

        
        try {
            JobApplication original = sortedByExperience.get(0);
            JobApplication cloned = (JobApplication) original.clone();
            System.out.println("\nOriginal: " + original);
            System.out.println("Cloned: " + cloned);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}