package Task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//custom class for getting student details
public class StudentGradeCalculatorPOJO{

	//making variable private
	private  List<Integer> allSubjectMarks;
	private  int studentMarks=0;
	private  double averagePercent=0;
	private  String studentName=null;
	
	//default constructor
	public StudentGradeCalculatorPOJO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//constructor using fields
	public StudentGradeCalculatorPOJO(String name,int... SubjectMarks){
	    this.studentName=name;
	    this.allSubjectMarks=new ArrayList<>();
	    for(int s: SubjectMarks) {
			allSubjectMarks.add(s);
		};
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	//giving total subject allSubjectMarks
	public int getTotalSubjectMarks(){
	    for(int mark: this.allSubjectMarks){
	    	this.studentMarks+=mark;
	    }
	    return this.studentMarks;
	}
	
	//getting average percent
	public double getAveragePercent(){
	    
		//taking marks scored by student
		int marksScored=this.studentMarks;
		
	    //taking the size of list 
	    int totalMark=(this.allSubjectMarks.size())*100;
	    
	    //taking percent from marks
	    this.averagePercent=(((double)marksScored/totalMark)*100);
	    
	    //rounding off the percent 
	    this.averagePercent = Math.round(this.averagePercent * 100.0) / 100.0;
	
	    return this.averagePercent;
	}
	
	//getting student grade based on the average percent
	public String getStudentGrade(){
	    int avgPercent=(int)this.averagePercent;
	    
	    String setGrade;
	    
	    if(avgPercent >91){
	        setGrade="A+";
	    }else if(avgPercent >81 && avgPercent <=90){
	        setGrade="A";
	    }else if(avgPercent >71 && avgPercent <=80){
	        setGrade="B";
	    }else if(avgPercent >61 && avgPercent <=70){
	        setGrade="C";
	    }else if(avgPercent >51 && avgPercent <=60){
	        setGrade="D";
	    }else if(avgPercent >41 && avgPercent <=50){
	        setGrade="E";
	    }else{
	        setGrade="Fail";
	    }
	    return setGrade;
	    
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(allSubjectMarks, averagePercent, studentMarks, studentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentGradeCalculatorPOJO other = (StudentGradeCalculatorPOJO) obj;
		return Objects.equals(allSubjectMarks, other.allSubjectMarks)
				&& Double.doubleToLongBits(averagePercent) == Double.doubleToLongBits(other.averagePercent)
				&& studentMarks == other.studentMarks && Objects.equals(studentName, other.studentName);
	}
}