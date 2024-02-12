package Task_1;

import java.util.Scanner;


public class NumberGame {
    
    //displaying all the game rules
    public void gameRules(){
        System.out.println("Welcome to Number Guessing Game.");	
		System.out.println("Enter the number between 1 to 100.");
		System.out.println("NOTE: You have to guess 3 numbers.");
		System.out.println("NOTE: For each number you will get 5 chances to guess the correct number!!!\n");		
    }
  
    
    public void myGame(){
        
		Scanner sc = new Scanner(System.in);
		
        //each game initial score is 0
		int eachGameScore=0;
		
		//total games score
		int totalScore=0;
		
		//total rounds played
		int totalRounds=0;
		
		//variable to check if the user wants to play again or not
        int playAgain=0;

        //displaying all game rules
        gameRules();
        

		do{
		    
		    //giving user 5 different numbers to guess
		    for(int i=0;i<3;i++){
		    	
		    	//counting user score for 3 rounds
		    	eachGameScore+=playGame();	
		    }
		    
		    //storing the total score
		    totalScore+=eachGameScore;
		    
		    //storing the total rounds played.
		    totalRounds+=3;
		    
		    //displaying user score
		    System.out.println("Your score: "+eachGameScore+"/3 \n");
            
            //providing option for multiple rounds
		    System.out.println("Wish to play again??\nEnter\n1-->play again\n0-->Close");
			playAgain=sc.nextInt();	
			
			//if user wants to exit
			if(playAgain==0){
				System.out.println("Thankyou for playing!!!");
				System.out.println("Final Score: "+totalScore+"/"+totalRounds);
			}
		}while(playAgain!=0); //checking user wants multiple rounds or not.
    }
    
    public int playGame(){
		
		Scanner sc = new Scanner(System.in); 
		int userInput,score=0;
		
		//Generating a random number between 1 to 100.
		int systemNumber=(int)(Math.round((Math.random()*100)+1));
		
        //providing limited  attempts to guess the number
		for(int i=0;i<5;i++){
			
			//displaying the remaining attempts to user    
	        System.out.print((5-i) + " chances left!!!"+"\nEnter the number: ");
			    
			//prompting the user to enter the guessed number
			userInput=sc.nextInt();
			
			//checking the user guess with generated number and providing feedback
			if(systemNumber==userInput){
			    
				//Displaying the number of attempts taken to guess the correct score
			    System.out.println("Boooom, you guessed it correct in "+(i+1)+ " attempt.\n");
			    System.out.println("Number was "+systemNumber+"\n");
			    System.out.println("---------------------------------------\n");
			    //counting score for correct guess
			    score++; 
			    return score;

			}else if(Math.abs(userInput-systemNumber)>0 && Math.abs(userInput-systemNumber)<=5){   			    
			    //providing feedback to user
				System.out.println("You're almost there,the difference is less than <5\n");

			}else if(Math.abs(userInput-systemNumber)>5 && Math.abs(userInput-systemNumber)<=10){    			   
				//providing feedback to user
				System.out.println("You're too close,the difference is >5 and <10\n");

			}else if(Math.abs(userInput-systemNumber)>10 && Math.abs(userInput-systemNumber)<=20){
				//providing feedback to user    
				System.out.println("You're close the difference is >10 and <20\n");

			}else if(Math.abs(userInput-systemNumber)>20 && Math.abs(userInput-systemNumber)<=30){
				//providing feedback to user    
				System.out.println("You're close the difference is >20 and <30\n");

			}else if(Math.abs(userInput-systemNumber)>30 && Math.abs(userInput-systemNumber)<=50){
				//providing feedback to user 
				System.out.println("Difference is >30 and <50\n");

			}else if(Math.abs(userInput-systemNumber)>50 && Math.abs(userInput-systemNumber)<=70){
				//providing feedback to user    
				System.out.println("You're far the difference is more than 50\n");

			}else{
				//providing feedback to user    
				System.out.println("You're too far\n");
			} 
		}
		
		//displaying the generated number when user failed to guess
		System.out.println("Number was "+systemNumber+"\nbetter luck next time.\n");
		System.out.println("---------------------------------------\n");	
		
		//returning the user score
		return score;
	}
	
	public static void main(String[] args) {
		NumberGame mygame= new NumberGame();
		mygame.myGame();
	}
}