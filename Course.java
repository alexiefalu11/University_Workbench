

package javafinalproject;

import java.util.*;
import java.io.*;

public class Course {
    
    public String Name, Sections, Schedule, Dates, ClassRoom, Profesor;
    private ArrayList<Section> sections;

    public Course(){
        sections = new ArrayList<Section>();
    }
    public Course(String Name, String Sections, String Dates, String Schedule, String ClassRoom, String Profesor){
        
        this.Name = Name;
        this.Sections = Sections;
        this.Schedule = Schedule;
        this.Dates = Dates;
        this.ClassRoom = ClassRoom;
        this.Profesor = Profesor;
               
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    public void setSchedule(String Schedule){
        this.Schedule = Schedule;
    }
    public String getSchedule(){
        return Schedule;
    }
    public void setClassRoom(String ClassRoom){
        this.ClassRoom = ClassRoom;
    }
    public String getClassRoom(){
        return ClassRoom;
    }
    public void setProfesor( String Profesor){
        this.Profesor = Profesor;
    }
    public String getProfesor(){
        return Profesor;
    }
    public void addSection(Section NewSection){
        sections.add(NewSection);
    }
    public void ShowSections(){
        for (Section Show : sections)
            System.out.println(Show);
    }
    
    public String toString(){
        
         String Show =" ";
      Show += "Course Name: " + this.Name + "\nCourseSection: " + this.Sections + "\nCourse Time: " + this.Schedule + 
              "\nCourse Dates: " + this.Dates + "\nCourse ClassRoom: " + this.ClassRoom  + "\nCourse Professor: " + this.Profesor + "\n";
      return Show;
    }
}

