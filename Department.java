

package javafinalproject;

import java.util.*;

public class Department {
    
    private ArrayList<Course>CourseType;
    
    public Department(){
        CourseType = new ArrayList<Course>();
    }
    public void addCourse(Course courses){
        CourseType.add(courses);
    }
    public void ShowCourse(){
        for(Course Show:CourseType)
            System.out.println(Show);
    }
}
