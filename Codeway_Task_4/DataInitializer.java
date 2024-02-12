package Task_4;

import java.util.HashMap;
import java.util.Map;

public class DataInitializer {
	    
	    //method to populated the data of questions and answers
	    public static DataContainer getData(){
	        
	        //map contains all the questions with there options
	        Map<String,String> ques=new HashMap<>();
	        ques.put("Q1","In Java, size of char is? \nA)2byte \nB)4byte \nC)1byte \nD)8byte");
	        ques.put("Q2","Java is _____ language? \nA)Stereo-typed \nB)Proto-typed \nC)Weekly-typed \nD)strongly-typed");
	        ques.put("Q3","Which language is formed to bring classes in C ? \nA)Java \nB)Cpp \nC)Golang \nD)rust");
	        ques.put("Q4","What does JDK stand for? \nA)Java Development Kit \nB)Java Developer Kit \nC)Java Development Knowledge \nD)Java Developed Knowledge");
	        ques.put("Q5","'new' keyword is used to create? \nA)Instance \nB)Variable \nC)Classes \nD)Method");
	        ques.put("Q6","Which of the following is not a primitive data type in Java? \nA)int \nB)float \nC)string \nD)char");
	        ques.put("Q7","Which keyword is used to create a subclass in Java? \nA)Subclass \nB)Child \nC)Extends \nD)Inherits");
	        ques.put("Q8","What is the default value of a variable of type int in Java? \nA)0 \nB)1 \nC)Null \nD)Undefined");
	        ques.put("Q9","Which keyword is used to define a constant in Java? \nA)const \nB)final \nC)static \nD)constant");
	        ques.put("Q10","What does JVM stand for? \nA)Java Virtual Memory \nB)Java Virtual Machine \nC)Java Virtual Method \nD)Java Very Mighty");
	        
	        
	        //map contains all the question numbers with answers
	        Map<String,String> ans=new HashMap<>();
	        ans.put("Q1","a");
	        ans.put("Q2","d");
	        ans.put("Q3","b");
	        ans.put("Q4","a");
	        ans.put("Q5","a");
	        ans.put("Q6","c");
	        ans.put("Q7","c");
	        ans.put("Q8","a");
	        ans.put("Q9","b");
	        ans.put("Q10","b");
	        
	        //returning a custom class DataContainer with parameters as question and answers
	        return new DataContainer(ques,ans);
	    }
	    
	    
	    public static void main(String[] args){
	        
	    }
	}
