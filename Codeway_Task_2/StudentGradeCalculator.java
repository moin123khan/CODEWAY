package Task_2;

import java.util.Scanner;

public class StudentGradeCalculator {

   
    //making private so others can't access as its a public class
    private static int totalSubjects;
    private static String studentName;
	
    //get the name of student
    public String setName() {
    	Scanner scan=new Scanner(System.in);
    	
    	//taking the name of the student
    	System.out.print("\n\nEnter the name of student: ");
    	studentName=scan.nextLine();
    	
    	return studentName;
    }
    
	//method for taking input from student such as total subjects and respective Marks. 
	public int[] setStudentSubjectMarks(){
	    
	    Scanner scan=new Scanner(System.in);
	    	    

	    //asking for total number of subject from student
	    System.out.print("Enter the total number of subjects: ");
	    totalSubjects=scan.nextInt();
	    System.out.println();
	    
	    //Collection to store all the all Subject Marks of student
	    int[] studentSubjectMarks=new int[totalSubjects] ;
	    
	    
	    //displaying the maximum Subject Marks
	    System.out.print("Maximum Marks for each subject is 100\n");
	    
	    //populating the subject Marks
	    for(int i=0; i<totalSubjects;i++){
	       System.out.println("Enter subject "+(i+1)+" marks: "); 
	       studentSubjectMarks[i]=scan.nextInt();
	    }
	    System.out.println("\n\n");
	    
	    //returning collection containing all the subject marks.
	    return studentSubjectMarks;
	}
	
	
	
	//method to display all the student information gathered through subject allSubjectMarks
	public void displayStudentDetails(StudentGradeCalculatorPOJO studentDetails){
	    

	    //displaying the total Marks
	    System.out.println("Student Name: "+studentDetails.getStudentName());
	    
		
	    //displaying the total Marks
	    System.out.println("Total Marks: "+studentDetails.getTotalSubjectMarks()+"/"+(totalSubjects*100));
	    
	    //displaying the average percentage student obtained
	    System.out.println("Average Percentage: "+studentDetails.getAveragePercent());
	   
	    //displaying the grade achieved by student
	    System.out.println("Student Grade: "+studentDetails.getStudentGrade());
	    
	}
	
	public void startCalculating() {

		Scanner sc=new Scanner(System.in);
		
		System.out.print("\nHow many student grade you want to calculate: ");
		int studentCount=sc.nextInt();
		
		System.out.println("\n\n---STUDENT GRADE CALCULATOR---");
				
		
		StudentGradeCalculatorPOJO studentDetails;
		
		for(int i=0;i<studentCount;i++) {
			//get the name of student
			String name=setName();
			
			//storing all the subject marks
			int[] SubjectMarksList=setStudentSubjectMarks();
		  	
		  	//passing and retrieving all the student details in a custom class
		  	studentDetails=new StudentGradeCalculatorPOJO(name,SubjectMarksList);
			
			//passing all the retrieved student details for displaying
		  	displayStudentDetails(studentDetails);
		
		
		}

	}
	
	public static void main(String[] args) {
		
		StudentGradeCalculator calculateGrade=new StudentGradeCalculator();
		calculateGrade.startCalculating();	    
	}
}





