package Task_4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Quiz_Application_With_Timer {
	

    public void questions(Map<String,String> ques,Map<String,String> ans){
        
    	QuizTimer q=new QuizTimer();
    	
        //Scanner class to take input from user
        Scanner sc= new Scanner(System.in);
        
        //variable taken to store the user score.
        int userScore=0;
        
        //List taken to store the summary of Correct/Incorrect answers
        List<String> Result=new ArrayList<>();
        
        //variable taken to print question number.
        int showQno=1;
        
        //Displaying questions and storing user answers with correct answers.
        for(String que : ques.keySet()){
            
            //presenting one question at a time with multiple choice options. 
            System.out.println("Q"+(showQno)+" "+ques.get(que));
            
            //taking input from user
            String userInput=q.inputWithTimer();
            
            if(userInput.equals("timer_end")){
            	continue;
            }
            
            //comparing user answer with stored answer.
            if(userInput.toLowerCase().equals(ans.get(que))){
                
                //tracking user score based on correct answers.
                userScore++; 
                //storing answers
                Result.add("Q"+(showQno)+", correct ans: "+ans.get(que)+", your ans: "+userInput);
            }else{
                //storing answers
                Result.add("Q"+(showQno)+", correct ans: "+ans.get(que)+", your ans: "+userInput);
            }
            showQno++;
            System.out.println();
        }
        
        
        //Printing the summary of All Correct/Incorrect answers
        System.out.println("\n\nResult-----------");
        for(String key: Result){
            System.out.println(key);
        }
        
        
        //Showing the score calculation based on user correct answers
        if(userScore==10){
            System.out.println("Woahhh you scored full!!!\nTotal Score: "+ userScore+"/10");
        }else{
            System.out.println("Total Score: "+ userScore+"/10");
        }
        sc.close();
    }
    

    
    
    public static void main(String[] args) {
        
    	Quiz_Application_With_Timer quiz=new Quiz_Application_With_Timer();
        
        //Initializing the map from DataInitializer 
        DataContainer data=DataInitializer.getData();
        Map<String,String> ques=data.getQues();
        Map<String,String> ans=data.getAns();
    
        //starting quiz
        quiz.questions(ques,ans);
    }
}


	