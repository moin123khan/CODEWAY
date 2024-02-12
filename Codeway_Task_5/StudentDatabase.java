package Task_5;

import java.util.List;

public class StudentDatabase{
	
	private String studentInformation;
	private String studentID;
	private String studentName;
	private List<String> studentRegisteredCourses;
	
	public StudentDatabase() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentDatabase(String studentInformation, String studentID, String studentName,
			List<String> studentRegisteredCourses) {
		super();
		this.studentInformation = studentInformation;
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentRegisteredCourses = studentRegisteredCourses;
	}
	
	public String getStudentInformation() {
		return studentInformation;
	}
	public void setStudentInformation(String studentInformation) {
		this.studentInformation = studentInformation;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<String> getStudentRegisteredCourses() {
		return studentRegisteredCourses;
	}
	public void setStudentRegisteredCourses(List<String> studentRegisteredCourses) {
		this.studentRegisteredCourses = studentRegisteredCourses;
	}
	@Override
	public String toString() {
		return "StudentDatabase [studentInformation=" + studentInformation + ", studentID=" + studentID
				+ ", studentName=" + studentName + ", studentRegisteredCourses=" + studentRegisteredCourses + "]";
	}
		
}