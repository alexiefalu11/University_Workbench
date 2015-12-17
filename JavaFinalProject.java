

package javafinalproject;

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class JavaFinalProject {

    
    public static void main(String[] args)throws FileNotFoundException {
     
       Scanner input = new Scanner(System.in);
       Scanner ComputerEngi = new Scanner(new File("Computer.txt"));
       Scanner AerospaceEngi = new Scanner(new File("Aerospace.txt"));
       Scanner ElectricEngi = new Scanner(new File("Electric.txt"));
       PrintWriter NewStudent = new PrintWriter(new File("Student.txt"));
       
       Student ThisStudent = null;
       Section ThisSection = null;
       
       int choice , DepChoice, Mychoice, Regi;
       do{
       choice = Menu();
       
       if (choice == 1)
       {   
           System.out.println("=======================================================================");
           System.out.println("\t\t\t-STUDENT SECTION\n");
           System.out.println("\t\t*Please enter the following information*\n");
           System.out.print("Enter your first name -> ");
           String Name = input.next();
           System.out.print("\nEnter your Student Number -> ");
           String SN = input.next();
           System.out.print("\nEnter your ID -> ");
           String ID = input.next();
           System.out.print("\nEnter your Year Entered -> ");
           String YE = input.next();
           
              NewStudent.print("Name: ");
              NewStudent.println(Name);
              NewStudent.print("Student Number: ");
              NewStudent.println(SN);
              NewStudent.print("ID: ");
              NewStudent.println(ID);
              NewStudent.print("Year Entered: ");
              NewStudent.println(YE);
             
              ThisStudent = new Student(Name,SN,ID,YE);
              ThisSection = new Section();
              ThisSection.addStudent(ThisStudent);
              
           do{       
              DepChoice = Menu2();
              
              if(DepChoice == 1)
              {
                  while(ComputerEngi.hasNext())
                  {
                      String info = ComputerEngi.nextLine();
                      System.out.println(info);
                  }
                  
                  System.out.print("Select course -> ");   
                  int CourseCho = input.nextInt();
                  
                  while(CourseCho<0 || CourseCho>3)
                  {
                     JOptionPane.showMessageDialog(null,"Select a valid option","Invalid option",JOptionPane.INFORMATION_MESSAGE);
                     System.out.print("Select course again -> ");   
                     CourseCho = input.nextInt();
                  }
                  if(CourseCho == 1)
                  {  String CourseName = "CPEN 300 Software Engineering";
                      NewStudent.print("Course Name: ");
                      NewStudent.println(CourseName);
                     
                      int SecCho = SoftSec();
                      
                      if(SecCho == 1){
                          String section = "<1361>";
                          String days = "MW";
                          String time = "08:30am-12:29pm";
                          String classroom = "EDI 250";
                          String professor = "Yahya M. Masalmah";
                          
                          NewStudent.print("Section: ");
                          NewStudent.println(section);
                          NewStudent.print("Days: ");
                          NewStudent.println(days);
                          NewStudent.print("Time: ");
                          NewStudent.println(time);
                          NewStudent.print("Class Room: ");
                          NewStudent.println(classroom);
                          NewStudent.print("Professor: ");
                          NewStudent.println(professor);
                          
                         Course ThisSec = new Course(CourseName,section,days,time,classroom,professor);
                          Department SecDepart = new Department();
                          SecDepart.addCourse(ThisSec);
                                                    
                          System.out.println(ThisStudent.StudentInfo());
                          SecDepart.ShowCourse();
                          }
                      else if(SecCho==2){
                          String section = "<1256>";
                          String days = "TR";
                          String time = "05:00am-06:29pm";
                          String classroom = "EDI 247";
                          String professor = "Yahya M. Masalmah";
                          
                          NewStudent.print("Section: ");
                          NewStudent.println(section);
                          NewStudent.print("Days: ");
                          NewStudent.println(days);
                          NewStudent.print("Time: ");
                          NewStudent.println(time);
                          NewStudent.print("Class Room: ");
                          NewStudent.println(classroom);
                          NewStudent.print("Professor: ");
                          NewStudent.println(professor);
                          
                          Course ThisSec = new Course(CourseName,section,days,time,classroom,professor);
                          Department SecDepart = new Department();
                          SecDepart.addCourse(ThisSec);
                                                    
                          ThisStudent.StudentInfo();
                          SecDepart.ShowCourse();
                          }
                      else
                          System.exit(1);
                        
                     }
                  else if(CourseCho ==2){
                      String CourseName = "ELEN 301 Electrical Networks I";
                      NewStudent.print("Course Name: ");
                      NewStudent.println(CourseName);
                     
                      int SecCho = ElecNSec();
                      
                      if(SecCho == 1){
                          String section = "<2026>";
                          String days = "TR";
                          String time = "01:00pm-03:00pm";
                          String classroom = "EDI 247";
                          String professor = "Rafael Gaudier";
                          
                          NewStudent.print("Section: ");
                          NewStudent.println(section);
                          NewStudent.print("Days: ");
                          NewStudent.println(days);
                          NewStudent.print("Time: ");
                          NewStudent.println(time);
                          NewStudent.print("Class Room: ");
                          NewStudent.println(classroom);
                          NewStudent.print("Professor: ");
                          NewStudent.println(professor);
                          
                          Course ThisSec = new Course(CourseName,section,days,time,classroom,professor);
                          Department SecDepart = new Department();
                          SecDepart.addCourse(ThisSec);
                                                    
                          ThisStudent.StudentInfo();
                          SecDepart.ShowCourse();
                          }
                      else if(SecCho==2){
                          String section = "<2015>";
                          String days = "MW";
                          String time = "05:00am-06:29pm";
                          String classroom = "EDI 144";
                          String professor = "Joehan Carrasquillo";
                          
                          NewStudent.print("Section: ");
                          NewStudent.println(section);
                          NewStudent.print("Days: ");
                          NewStudent.println(days);
                          NewStudent.print("Time: ");
                          NewStudent.println(time);
                          NewStudent.print("Class Room: ");
                          NewStudent.println(classroom);
                          NewStudent.print("Professor: ");
                          NewStudent.println(professor);
                          
                          Course ThisSec = new Course(CourseName,section,days,time,classroom,professor);
                          Department SecDepart = new Department();
                          SecDepart.addCourse(ThisSec);
                                                    
                          ThisStudent.StudentInfo();
                          SecDepart.ShowCourse();
                          }
                      else
                          System.exit(1);
                     }
                  }
                  else if(DepChoice==2){
                      while(ElectricEngi.hasNext())
                  {
                      String info = ElectricEngi.nextLine();
                      System.out.println(info);
                  }
                  
                  System.out.print("Select course -> ");   
                  int CourseCho2 = input.nextInt();
                  
                  while(CourseCho2<0 || CourseCho2>3)
                  {
                     JOptionPane.showMessageDialog(null,"Select a valid option","Invalid option",JOptionPane.INFORMATION_MESSAGE);
                     System.out.print("\nSelect course again -> ");   
                     CourseCho2 = input.nextInt();
                  }
                  if(CourseCho2 ==1){
                      String CourseName = "ELEN 301 Electrical Networks I";
                      NewStudent.print("Course Name: ");
                      NewStudent.println(CourseName);
                     
                      int SecCho = ElecNSec();
                      
                      if(SecCho == 1){
                          String section = "<2026>";
                          String days = "TR";
                          String time = "01:00pm-03:00pm";
                          String classroom = "EDI 247";
                          String professor = "Rafael Gaudier";
                          
                          NewStudent.print("Section: ");
                          NewStudent.println(section);
                          NewStudent.print("Days: ");
                          NewStudent.println(days);
                          NewStudent.print("Time: ");
                          NewStudent.println(time);
                          NewStudent.print("Class Room: ");
                          NewStudent.println(classroom);
                          NewStudent.print("Professor: ");
                          NewStudent.println(professor);
                          
                          Course ThisSec = new Course(CourseName,section,days,time,classroom,professor);
                          Department SecDepart = new Department();
                          SecDepart.addCourse(ThisSec);
                                                    
                          ThisStudent.StudentInfo();
                          SecDepart.ShowCourse();
                          }
                      else if(SecCho==2){
                          String section = "<2015>";
                          String days = "MW";
                          String time = "05:00am-06:29pm";
                          String classroom = "EDI 144";
                          String professor = "Joehan Carrasquillo";
                          
                          NewStudent.print("Section: ");
                          NewStudent.println(section);
                          NewStudent.print("Days: ");
                          NewStudent.println(days);
                          NewStudent.print("Time: ");
                          NewStudent.println(time);
                          NewStudent.print("Class Room: ");
                          NewStudent.println(classroom);
                          NewStudent.print("Professor: ");
                          NewStudent.println(professor);
                          
                          Course ThisSec = new Course(CourseName,section,days,time,classroom,professor);
                          Department SecDepart = new Department();
                          SecDepart.addCourse(ThisSec);
                                                    
                          System.out.println(ThisStudent.StudentInfo());
                          SecDepart.ShowCourse();
                          }
                      }
                      if(CourseCho2 ==2){
                      String CourseName = "ELEN 330 Electronics I";
                      NewStudent.print("Course Name: ");
                      NewStudent.println(CourseName);
                     
                      int SecCho = ElectroSec();
                      
                      if(SecCho == 1){
                          String section = "<3000>";
                          String days = "TR";
                          String time = "09:00pm-011:00pm";
                          String classroom = "EDI 200";
                          String professor = "Stephen Hawkings";
                          
                          NewStudent.print("Section: ");
                          NewStudent.println(section);
                          NewStudent.print("Days: ");
                          NewStudent.println(days);
                          NewStudent.print("Time: ");
                          NewStudent.println(time);
                          NewStudent.print("Class Room: ");
                          NewStudent.println(classroom);
                          NewStudent.print("Professor: ");
                          NewStudent.println(professor);
                          
                          Course ThisSec = new Course(CourseName,section,days,time,classroom,professor);
                          Department SecDepart = new Department();
                          SecDepart.addCourse(ThisSec);
                                                    
                          System.out.println(ThisStudent.StudentInfo());
                          SecDepart.ShowCourse();
                          }
                      else if(SecCho==2){
                          String section = "<3020>";
                          String days = "MW";
                          String time = "01:00pm-02:29pm";
                          String classroom = "EDI 250";
                          String professor = "Albert Ainstein";
                          
                          NewStudent.print("Section: ");
                          NewStudent.println(section);
                          NewStudent.print("Days: ");
                          NewStudent.println(days);
                          NewStudent.print("Time: ");
                          NewStudent.println(time);
                          NewStudent.print("Class Room: ");
                          NewStudent.println(classroom);
                          NewStudent.print("Professor: ");
                          NewStudent.println(professor);
                          
                          Course ThisSec = new Course(CourseName,section,days,time,classroom,professor);
                          Department SecDepart = new Department();
                          SecDepart.addCourse(ThisSec);
                                                    
                          System.out.println(ThisStudent.StudentInfo());
                          SecDepart.ShowCourse();
                          }
                       else
                          System.exit(1);
                      }
                  }
                      else if(DepChoice == 3){
                  
                  while(AerospaceEngi.hasNext())
                  {
                      String info = AerospaceEngi.nextLine();
                      System.out.println(info);
                  }
                  
                  System.out.print("\nSelect course -> ");   
                  int CourseCho3 = input.nextInt();
                  
                  while(CourseCho3<0 || CourseCho3>3)
                  {
                     JOptionPane.showMessageDialog(null,"Select a valid option","Invalid option",JOptionPane.INFORMATION_MESSAGE);
                     System.out.println("Select course again -> ");   
                     CourseCho3 = input.nextInt();
                  }
                  if(CourseCho3 == 1)
                  {  String CourseName = "ENGI 277 Statics and Dynamics";
                      NewStudent.print("Course Name: ");
                      NewStudent.println(CourseName);
                     
                      int SecCho = StaticSec();
                      
                      if(SecCho == 1){
                          String section = "<1010>";
                          String days = "MW";
                          String time = "11:30am-01:29pm";
                          String classroom = "EDI 203";
                          String professor = "Mari Cristi";
                          
                          NewStudent.print("Section: ");
                          NewStudent.println(section);
                          NewStudent.print("Days: ");
                          NewStudent.println(days);
                          NewStudent.print("Time: ");
                          NewStudent.println(time);
                          NewStudent.print("Class Room: ");
                          NewStudent.println(classroom);
                          NewStudent.print("Professor: ");
                          NewStudent.println(professor);
                          
                          Course ThisSec = new Course(CourseName,section,days,time,classroom,professor);
                          Department SecDepart = new Department();
                          SecDepart.addCourse(ThisSec);
                                                    
                          System.out.println(ThisStudent.StudentInfo());
                          SecDepart.ShowCourse();
                          }
                      else if(SecCho==2){
                          String section = "<2020>";
                          String days = "TR";
                          String time = "02:00am-04:00pm";
                          String classroom = "EDI 203";
                          String professor = "Mari Cristi";
                          
                          NewStudent.print("Section: ");
                          NewStudent.println(section);
                          NewStudent.print("Days: ");
                          NewStudent.println(days);
                          NewStudent.print("Time: ");
                          NewStudent.println(time);
                          NewStudent.print("Class Room: ");
                          NewStudent.println(classroom);
                          NewStudent.print("Professor: ");
                          NewStudent.println(professor);
                          
                          Course ThisSec = new Course(CourseName,section,days,time,classroom,professor);
                          Department SecDepart = new Department();
                          SecDepart.addCourse(ThisSec);
                                                    
                          System.out.println(ThisStudent.StudentInfo());
                          SecDepart.ShowCourse();
                          }
                      else
                          System.exit(1);                       
                    }
                   if(CourseCho3 == 2)
                   {  String CourseName = "ENGI 310 Mechanics ";
                      NewStudent.print("Course Name: ");
                      NewStudent.println(CourseName);
                     
                      int SecCho = MechSec();
                      
                      if(SecCho == 1){
                          String section = "<4000>";
                          String days = "MW";
                          String time = "08:30am-09:29pm";
                          String classroom = "EDI 205";
                          String professor = "Gil Stone";
                          
                          NewStudent.print("Section: ");
                          NewStudent.println(section);
                          NewStudent.print("Days: ");
                          NewStudent.println(days);
                          NewStudent.print("Time: ");
                          NewStudent.println(time);
                          NewStudent.print("Class Room: ");
                          NewStudent.println(classroom);
                          NewStudent.print("Professor: ");
                          NewStudent.println(professor);
                          
                          Course ThisSec = new Course(CourseName,section,days,time,classroom,professor);
                          Department SecDepart = new Department();
                          SecDepart.addCourse(ThisSec);
                                                    
                         System.out.println(ThisStudent.StudentInfo());
                          SecDepart.ShowCourse();
                          }
                      else if(SecCho==2){
                          String section = "<4020>";
                          String days = "TR";
                          String time = "02:00am-04:00pm";
                          String classroom = "EDI 203";
                          String professor = "Jose Duconge";
                          
                          NewStudent.print("Section: ");
                          NewStudent.println(section);
                          NewStudent.print("Days: ");
                          NewStudent.println(days);
                          NewStudent.print("Time: ");
                          NewStudent.println(time);
                          NewStudent.print("Class Room: ");
                          NewStudent.println(classroom);
                          NewStudent.print("Professor: ");
                          NewStudent.println(professor);
                          
                          Course ThisSec = new Course(CourseName,section,days,time,classroom,professor);
                          Department SecDepart = new Department();
                          SecDepart.addCourse(ThisSec);
                                                    
                         System.out.println(ThisStudent.StudentInfo());
                         SecDepart.ShowCourse();
                          }
                      else
                          System.exit(1);
                     } 
              }   System.out.println("Want to change something in the Registration?");
             System.out.println("\t(1)Yes or (2)No --> ");
             Regi = input.nextInt();
              while(Regi<0 || Regi >2){
                 System.out.print("\t(1)Yes or (2)No --> ");
                 Mychoice = input.nextInt();
                            }
            }while(Regi==0);
       }
                      else if(choice==2)
                      {
                          System.out.println("================================================================");
                          System.out.println("\t\t\t-Professor Section-\n\n");
                          System.out.print("\t1.View Student List\t\t2.Add Grades\n\t\t3.Exit\n\n\tMy choice -> ");
                         int choice2 = input.nextInt();
                     Scanner Student2 = new Scanner(new File("Student.txt"));
                         while(choice<0 || choice>3)
        {  JOptionPane.showMessageDialog(null,"Select a valid option","Invalid option",JOptionPane.INFORMATION_MESSAGE);
           System.out.print("\t\t-REGISTRATION SYSTEM-\n\n\t1.I am a student\t2.I am a professor\n\t\t\t3.Exit\n\n");
           System.out.print("\tI am -> ");
           choice = input.nextInt(); 
        }
                         if(choice2==1){
                         System.out.println("===================================================================");
                          while(Student2.hasNextLine()){
                             String list = Student2.nextLine();
                             System.out.println(list);
                          }
                         }
                         else if(choice2==2){
                          
                             
                           System.out.print("Enter grade -> ");
                           String grade = input.next();
                            ThisStudent.setGrade(grade);
                           System.out.println(ThisStudent.StudentInfo());
                         }
                          
                          
                      }
          
         
             System.out.print("\n(1)Start again\t(2)Exit\nMy choice -->");
              Mychoice = input.nextInt();
       
             while(Mychoice<0 || Mychoice>2){
                 System.out.print("My choice --> ");
                 Mychoice = input.nextInt();
             }
       NewStudent.close();      
     }while(Mychoice==1);
      
                  
       
  }
                  
    public static int Menu(){
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.print("\t\t-REGISTRATION SYSTEM-\n\n\t1.I am a student\t2.I am a professor\n\t\t\t3.Exit\n\n");
        System.out.print("\tI am -> ");
        choice = input.nextInt();
       
        while(choice<0 || choice>3)
        {  JOptionPane.showMessageDialog(null,"Select a valid option","Invalid option",JOptionPane.INFORMATION_MESSAGE);
           System.out.print("\t\t-REGISTRATION SYSTEM-\n\n\t1.I am a student\t2.I am a professor\n\t\t\t3.Exit\n\n");
           System.out.print("\tI am -> ");
           choice = input.nextInt(); 
        }
        return choice;
        
    }
    public static int Menu2(){
        
        int choice;
        Scanner input = new Scanner(System.in);
        
        System.out.println("============================================================================");
        System.out.println("\t\t\t-ENGINEERING DEPARTMENTS-\n\n");
        System.out.println("\t1. Computer Engineering\t\t2. Electric Engineering\n");
        System.out.println("\t3. Aerospace Engineering\t\t4. Exit\n");
        System.out.print("I choose -> ");
        choice = input.nextInt();
        
        while(choice<0 || choice>4)
        {
          JOptionPane.showMessageDialog(null,"Select a valid option","Invalid option",JOptionPane.INFORMATION_MESSAGE);
           System.out.println("\n\t\t\t-ENGINEERING DEPARTMENTS-\n\n");
           System.out.println("\t1. Computer Engineering\t\t2. Electric Engineering\n");
           System.out.println("\t3. Aerospace Engineering\t\t4. Exit\n");
           System.out.print("I choose -> ");
           choice = input.nextInt();
        }
        return choice;
    }
    public static int SoftSec()throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        Scanner compsec = new Scanner(new File("ComputerSection.txt"));
        int choice;
        
        while(compsec.hasNext()){
        String CompSec = compsec.nextLine();
        System.out.println(CompSec);
        }
        System.out.print("I choose -> ");
        choice = input.nextInt();
        
        while(choice<0 || choice>3){
          JOptionPane.showMessageDialog(null,"Select a valid option","Invalid option",JOptionPane.INFORMATION_MESSAGE);
          System.out.print("\nI choose -> ");
          choice = input.nextInt();
        }
        return choice;
        
    }
    public static int ElecNSec()throws FileNotFoundException{
         Scanner input = new Scanner(System.in);
        Scanner elecnsec = new Scanner(new File("ElectricNSection.txt"));
        int choice;
        
        while(elecnsec.hasNext()){
        String ElecNSec = elecnsec.nextLine();
        System.out.println(ElecNSec);
        }
        System.out.print("I choose -> ");
        choice = input.nextInt();
        
        while(choice<0 || choice>3){
          JOptionPane.showMessageDialog(null,"Select a valid option","Invalid option",JOptionPane.INFORMATION_MESSAGE);
          System.out.print("\nI choose -> ");
          choice = input.nextInt();
        }
        return choice;
    }
    public static int ElectroSec()throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        Scanner elecnsec = new Scanner(new File("ElectronicSection.txt"));
        int choice;
        
        while(elecnsec.hasNext()){
        String ElecNSec = elecnsec.nextLine();
        System.out.println(ElecNSec);
        }
        System.out.print("I choose -> ");
        choice = input.nextInt();
        
        while(choice<0 || choice>3){
          JOptionPane.showMessageDialog(null,"Select a valid option","Invalid option",JOptionPane.INFORMATION_MESSAGE);
          System.out.print("\nI choose -> ");
          choice = input.nextInt();
        }
        return choice;
    }
    public static int StaticSec()throws FileNotFoundException{
         Scanner input = new Scanner(System.in);
        Scanner elecnsec = new Scanner(new File("StaticDSection.txt"));
        int choice;
        
        while(elecnsec.hasNext()){
        String ElecNSec = elecnsec.nextLine();
        System.out.println(ElecNSec);
        }
        System.out.print("I choose -> ");
        choice = input.nextInt();
        
        while(choice<0 || choice>3){
          JOptionPane.showMessageDialog(null,"Select a valid option","Invalid option",JOptionPane.INFORMATION_MESSAGE);
          System.out.print("I choose -> ");
          choice = input.nextInt();
        }
        return choice;
    }
    public static int MechSec()throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        Scanner elecnsec = new Scanner(new File("MechanicSection.txt"));
        int choice;
        
        while(elecnsec.hasNext()){
        String ElecNSec = elecnsec.nextLine();
        System.out.println(ElecNSec);
        }
        System.out.print("I choose -> ");
        choice = input.nextInt();
        
        while(choice<0 || choice>3){
          JOptionPane.showMessageDialog(null,"Select a valid option","Invalid option",JOptionPane.INFORMATION_MESSAGE);
          System.out.print("I choose -> ");
          choice = input.nextInt();
        }
        return choice;
    }}
    
    
        


