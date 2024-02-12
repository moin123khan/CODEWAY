package Task_5;

import java.util.ArrayList;
import java.util.List;

public class populateCourses {
	
	
	//populating course details
	public List<CourseDatabase> courseDetails() {
		List<CourseDatabase> courseDetails=new ArrayList<>();
		courseDetails.add(new CourseDatabase("CS101", "CS101", "Introduction to Computer Science",
		        "This course provides an introduction to the fundamentals of computer science, including programming concepts, algorithms, and problem-solving techniques.",
		        10, "Mondays and Wednesdays, 9:00 AM - 10:30 AM"));
		courseDetails.add(new CourseDatabase("ENG201", "ENG201", "English Literature: Romantic Era",
		        "Explore the poetry and prose of the Romantic period, focusing on major poets such as William Wordsworth, Samuel Taylor Coleridge, and Mary Shelley.",
		        10, "Tuesdays and Thursdays, 11:00 AM - 12:30 PM"));
		courseDetails.add(new CourseDatabase("MAT204", "MAT204", "Advanced Calculus",
		        "A rigorous study of calculus, covering topics such as limits, derivatives, integrals, and applications to physics and engineering.",
		        10, "Mondays and Wednesdays, 1:00 PM - 2:30 PM"));
		courseDetails.add(new CourseDatabase("BIO301", "BIO301", "Cellular Biology",
		        "An in-depth examination of cellular structures, functions, and processes, including cell division, metabolism, and cellular communication.",
		        10, "Tuesdays and Thursdays, 9:00 AM - 10:30 AM"));
		courseDetails.add(new CourseDatabase("HIS401", "HIS401", "World History: 20th Century",
		        "Survey the major events, movements, and figures of the 20th century, including world wars, decolonization, and the rise of globalization.",
		        0, "Mondays and Wednesdays, 3:00 PM - 4:30 PM"));
	
		return courseDetails;
	}
	
	public static void main(String[] args) {
		
	}
}
