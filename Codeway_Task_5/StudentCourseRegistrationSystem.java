package Task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentCourseRegistrationSystem {
	
	
	//method to check the available courses
	public List<String> getAvailableCourses(List<CourseDatabase> allCourses){
		
		//storing the course code of available courses
		List<String> availableCourses=new ArrayList<>();
		
		//variable to track the tag name
		int i=0;
		
		//check all the course with capacity
		for(CourseDatabase course: allCourses) {
			
			//if the capacity is present than adding to our list
			if(course.getCourseCapacity() > 0) {
				availableCourses.add(course.getCourseCode());
				System.out.println("Tag: "+(i+1)+"\nCourse Code: " + course.getCourseCode()+"\nCourse Title: " + course.getCourseTitle()+"\nCourse Schedule: " + course.getCourseSchedule()+"\nCourse Description: "+course.getCourseDescription()+"\nCourse Capacity: "+course.getCourseCapacity());
				i++;
			}
		}
		return availableCourses;
	}
	
	
	
	
	
	//course registration 
	public void courseRegister(List<CourseDatabase> allCourses, List<StudentDatabase> allStudents, List<String> studentNames) {
		
	    Scanner scan=new Scanner(System.in);
		
	    //variable to check student want to exit
	    int exit=0;
		
	    
	    do {
			
	    	
			
	    	//taking name of the student to perform actions
			System.out.print("Enter the student name: ");
			String name=scan.nextLine();
			
			if(studentNames.contains(name)) {

				
				//prompting student with adding removing of courses
				System.out.println("Adding courses--->1\nDrop Courses--->2\nYour Registered Courses--->3 ");
				int opt=scan.nextInt();
				
				
				//switch case to choose
				switch(opt) {
		
				
				//case 1 if student wants to add course
				case 1:
					
			    	//list to hold all the available courses
					List<String> availableCourses= getAvailableCourses(allCourses);
					System.out.println("Enter the course tag to add.");
					
					//taking tag to match with course code
					int tag=scan.nextInt();
					scan.nextLine();
					
					//check the database
					for(StudentDatabase student: allStudents) {
						
						//checking if the user is already registered or not
						if(name.equalsIgnoreCase(student.getStudentName()) && student.getStudentRegisteredCourses().contains(availableCourses.get(tag-1))) {
							
							System.out.println("You have already registered!!!");
						
						}
						
						//checking if the user is not registered than adding the course
						else if(name.equalsIgnoreCase(student.getStudentName()) && !student.getStudentRegisteredCourses().contains(availableCourses.get(tag-1))){
							
							//checking if the course capacity is already filled
							if(allCourses.get(tag-1).getCourseCapacity()==0) {
								System.out.println("Course Batch full");
							
							//checking if the course capacity not already filled than adding
							}else {
								student.getStudentRegisteredCourses().add(availableCourses.get(tag-1));
								
								System.out.println("Course Added!!");
								
								//as the course is added so now reducing the capacity of particular course
								for(CourseDatabase course: allCourses){
									if(course.getCourseCode().equalsIgnoreCase(availableCourses.get(tag-1))) {
										course.reduceCourseCapacity(1);
										System.out.println("Updated course capacity: "+ course.getCourseCapacity());
									}							
								}	
							}							
						}
					}				
					break;
					
					
			    //case 2 if student wants to remove course
				case 2:
					
					//list to hold all the courses code
					List<String> coursecode=new ArrayList<>();
					
					//variable to match with code
					int i=0;
					
					//displaying all the courses code
					for(CourseDatabase titles: allCourses) {
						System.out.println("Tag "+(i+1)+": "+titles.getCourseCode());
						coursecode.add(titles.getCourseCode());
						i++;
					}
					
					//prompting to enter the course tag to drop
					System.out.println("Enter the course tag to drop.");
					int droptag=scan.nextInt();
					scan.nextLine();
					
					//scanning the student database
					for(StudentDatabase student: allStudents) {
						
						//checking the particular course is already registered or not
						if(name.equalsIgnoreCase(student.getStudentName()) && student.getStudentRegisteredCourses().contains(coursecode.get(droptag-1))) {
							
							//if the course was registered than dropping
							student.getStudentRegisteredCourses().remove(coursecode.get(droptag-1));
							
							//as the course is dropped now increasing the capacity of the course
							for(CourseDatabase course: allCourses){
								if(course.getCourseCode().equalsIgnoreCase(coursecode.get(droptag-1))) {
									course.addCourseCapacity(1);
									System.out.println("Updated course capacity: "+ course.getCourseCapacity());
								}
							}
						
						}
						
						//if the course to be dropped wasn't registered
						else if(name.equalsIgnoreCase(student.getStudentName()) && !student.getStudentRegisteredCourses().contains(coursecode.get(droptag-1))){
							
							System.out.println("You haven't registered for this course");
												
						}
					}
					break;
				
					
				//case 3 to display the student registered courses	
				case 3:
					
					//scanning student database
					for(StudentDatabase student: allStudents) {
					
						//if data found for particular user name
						if(name.equalsIgnoreCase(student.getStudentName()) ) {
							System.out.println("Student name: "+student.getStudentName());
							System.out.println("---Registered courses---");
							for(String code: student.getStudentRegisteredCourses())
							System.out.println(code);
						}
					}
					break;
					
				//if the user mistakenly giver wrong input.	
				default: System.out.println("Wrong Input!!!");

				}
				
				
				
			}else {
				System.out.println("Please enter the correct name.");
			}
			
			
			//asking student if they want to do more changes or not.
			System.out.println("Want to do more changes\nYes--->1\nNo--->0");
			exit=scan.nextInt();
			scan.nextLine();
		
			scan.close();
	    
	    }while(exit != 0);
	}
	
	
	public static void main(String[] args) {
		StudentCourseRegistrationSystem reg=new StudentCourseRegistrationSystem();
		
//		populating allCourses list with course details
		populateCourses courseDetails=new populateCourses();
		List<CourseDatabase> allCourses=courseDetails.courseDetails();
		
//		populating allStudents list with student details
		populateStudents studentdetails= new populateStudents();
		List<StudentDatabase> allStudents=studentdetails.studentDetails();
		
//		populating the list with student names
		List<String> studentNames=new ArrayList<String>();
		for(StudentDatabase name: allStudents) {
			studentNames.add(name.getStudentName());
		}
		
//		starting course registration
		reg.courseRegister(allCourses,allStudents,studentNames);
		
		
	}
}
