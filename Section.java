

package javafinalproject;

import java.util.*;

public class Section {
    
    private String ID, Dates, Schedule, Profesor;
    private ArrayList<Student>TypeSection;
    
 public Section(){
     TypeSection = new ArrayList<Student>();
 }
 public void addStudent(Student student){
     TypeSection.add(student);
 }
 public void ShowStudent(){
     for (Student Show : TypeSection)
         System.out.println(Show);
 }
 public void setID(String ID){
     this.ID = ID;
 }
 public String getID(){
     return ID;
 }
 public void setDates(String Dates){
     this.Dates = Dates;
 }
 public String getDates(){
     return Dates;
 }
 public void setSchedule(String Schedule){
     this.Schedule = Schedule;
 }
 public String getSchedule(){
     return Schedule;
 }
 public void setProfesor(String Profesor){
     this.Profesor = Profesor;
 }
 public String getProfesor(){
     return Profesor;
 }
    
}
