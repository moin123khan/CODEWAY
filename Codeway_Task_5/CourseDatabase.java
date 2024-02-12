package Task_5;


public class CourseDatabase {

	private String courseInformation;
	private String courseCode;
	private String courseTitle;
	private String courseDescription;
	private int courseCapacity;
	private String courseSchedule;
	
	public CourseDatabase() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CourseDatabase(String courseInformation, String courseCode, String courseTitle, String courseDescription,
			int coursecapacity, String courseSchedule) {
		super();
		this.courseInformation = courseInformation;
		this.courseCode = courseCode;
		this.courseTitle = courseTitle;
		this.courseDescription = courseDescription;
		courseCapacity = coursecapacity;
		this.courseSchedule = courseSchedule;
	}

	public String getCourseInformation() {
		return courseInformation;
	}

	public void setCourseInformation(String courseInformation) {
		this.courseInformation = courseInformation;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public int getCourseCapacity() {
		return courseCapacity;
	}

	public void reduceCourseCapacity(int coursecapacity) {
		this.courseCapacity -= coursecapacity;
	}
	public void addCourseCapacity(int coursecapacity) {
		this.courseCapacity += coursecapacity;
	}
	
	public String getCourseSchedule() {
		return courseSchedule;
	}

	public void setCourseSchedule(String courseSchedule) {
		this.courseSchedule = courseSchedule;
	}

	

	@Override
	public String toString() {
		return "StudentDatabase [courseInformation=" + courseInformation + ", courseCode=" + courseCode
				+ ", courseTitle=" + courseTitle + ", courseDescription=" + courseDescription + ", courseCapacity="
				+ courseCapacity + ", courseSchedule=" + courseSchedule + "]";
	}
}

