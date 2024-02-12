package Task_5;

import java.util.ArrayList;
import java.util.List;

public class populateStudents {
	
	
	
	//populating student details
	public List<StudentDatabase> studentDetails(){
		List<String> courses1 = new ArrayList<>();
        courses1.add("CS101");
        courses1.add("ENG201");
        
        List<String> courses2 = new ArrayList<>();
        courses2.add("MAT204");
        courses2.add("BIO301");
        
        List<String> courses3 = new ArrayList<>();
        courses3.add("HIS401");
        courses3.add("ENG201");

        List<String> courses4 = new ArrayList<>();
        courses4.add("CS101");
        courses4.add("BIO301");
        
        List<String> courses5 = new ArrayList<>();
        courses5.add("MAT204");
        courses5.add("HIS401");
		
		List<StudentDatabase> students=new ArrayList<>();
		
		students.add(new StudentDatabase("John Doe (ID: 12345)", "12345", "John Doe", courses1));
		students.add(new StudentDatabase("Jane Smith (ID: 54321)", "54321", "Jane Smith", courses2));
		students.add(new StudentDatabase("Alice Johnson (ID: 98765)", "98765", "Alice Johnson", courses3));
		students.add(new StudentDatabase("Bob Brown (ID: 67890)", "67890", "Bob Brown", courses4));
		students.add(new StudentDatabase("Emily Davis (ID: 13579)", "13579", "Emily Davis", courses5));
	
		
		return students;
	}
}

