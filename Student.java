

package javafinalproject;


public class Student {
    
    String Name, StudentNumber, StudentID, YearEntered, Grade;
 //Creting constructor of Student   
    public Student(String Name, String StudentNumber, String StudentID, String YearEntered){
        this.Name = Name;
        this.StudentNumber = StudentNumber;
        this.StudentID = StudentID;
        this.YearEntered = YearEntered;
        
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    public void setStudentNumber(String StudentNumber){
        this.StudentNumber = StudentNumber;
    }
    public String getStudentNumber(){
        return StudentNumber;
    }
    public void setYearEntered(String YearEntered){
        this.YearEntered = YearEntered;
    }
    public String getYearEntered(){
        return YearEntered;
    }
    public void setGrade(String Grade){
        this.Grade = Grade;
    }
    public String getGrade(){
        return Grade;
    }
    public String StudentInfo(){
        String Info = " ";
        
        Info +=   "Name: " + this.Name + "\n" + "Student Number: " + this.StudentNumber +
                "\n" + "ID: " + this.StudentID + "\n" + "Year Entered: " + this.YearEntered + "\n" +  
                 "Grade: " + this.Grade + "\n";
        return Info;
    }
}
