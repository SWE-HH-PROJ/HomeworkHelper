package readingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ReadingFiles {

    public static void main(String[] args) {

     String[]arr = new String[4];
    	//List<String>lists = new ArrayList();
        int i = 0;
        int j=0;
        List<String[]>listOfAssignements = new ArrayList();
        Date today = new Date();
        try {

          File myObj = new File("assignmentBoard.txt");  //Here you can give the absolute path for the test
            Scanner myReader = new Scanner(myObj);


//            while (myReader.hasNextLine() && i < 4) {
   
            while (myReader.hasNextLine()) {
            	if(i==4) {
            		i=0;
            		listOfAssignements.add(arr);
            		String[] arr2 = new String[4];
            		arr= arr2;	
            	}
            	
                String data = myReader.nextLine();
                arr[i++]= data;
            }
            
            //print the list of todays date and the list of the assignment
      for(String[] ar :listOfAssignements ) {
    	      //next line checks if it is assignment or Lab other wise it catagorize as not assignment
            if(ar[2].toLowerCase() .contains("Assignment".toLowerCase()) || !arr[2].toLowerCase().contains("lab")){
            	//next line prints todays date name month name, number and year. Many methods called in this line. 
          	//  System.out.print("Today " + getTodaysName() + ", "+getMonthName() + " "+ getDtaOfMonth() +", " + getThisYear() + "\n");
          	System.out.println("Add Date :- "+ ar[0]);
                System.out.println("Class :- "+ ar[1]);
                System.out.println("Assignment :- "+ ar[2]);
                System.out.println(ar[3]);
               System.out.println("\n");
            }else{
            	//prints not an assignment if no word as assignment or lab
          	  System.out.print("Today " + getTodaysName() + ", "+getMonthName() + " "+ getDtaOfMonth() +", " + getThisYear() + "\n");
                System.out.println("The file is not Assignment rather it is "+ arr[2] +"\n");
            }
      }
      
       //Group the assignments based on the class name;
      groupAssignmentBaseOnClassName(listOfAssignements);
      
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //return the name of today
    public static String getTodaysName() {
    	Date date=new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        String dayWeekText = new SimpleDateFormat("EEEE").format(date);
        return dayWeekText;
    }
    
  //return the name of month name
//    public static Month getMonthName() {
    public static Month getMonthName() {
    	  LocalDateTime current = LocalDateTime.now();
    	  Month month = current.getMonth();
         return month;
    }
    
    //get Date of month
    public static int getDtaOfMonth() {
  	  LocalDateTime current = LocalDateTime.now();
      int date= current.getDayOfMonth();
       return date;
  }
    
    //get todays Year
    public static int getThisYear() {
  	  LocalDateTime current = LocalDateTime.now();
      int year= current.getYear();
       return year;
  }
    
    //group the assignment based n the class name.
  public static void groupAssignmentBaseOnClassName(List<String[]>listOfAssigments){
	  //Course names put into set
	  Set<String>nameOfCourse = new HashSet();
       	for(String[] arr:listOfAssigments) {
       		if(!nameOfCourse.contains(arr[1])) {
       			nameOfCourse.add(arr[1]);
       		}
       	}
       	
       	System.out.println("\n\n =========================== \n Assignment Grouped by course name \n============================\n");
       	for(String cName: nameOfCourse) {
       		System.out.println(cName);
       		for(String[] arr: listOfAssigments) {
       			if(cName.equalsIgnoreCase(arr[1])) {
       			//System.out.println("\t"+arr[0]);
       			System.out.println("\t"+ arr[2]);
       			System.out.println("\t"+ arr[3]);
       			System.out.println();
       			}
       		}
       	}
  
    }
}
