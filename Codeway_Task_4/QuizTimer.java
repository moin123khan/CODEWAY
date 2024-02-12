package Task_4;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizTimer {
    public String userInput = "";

    public String inputWithTimer() {
        Scanner scan = new Scanner(System.in);
        Timer timer = new Timer();

        System.out.println("Enter your input (you have 10 seconds):");

        // Start a timer task to cancel the scanner input after 10 seconds
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Time's up!!!\nEnter 'x' to continue.");
                userInput = "timer-end";
                scan.close();
            }
        }, 10000); // 10 seconds

        // Wait for user input
        userInput = scan.nextLine();

        // Cancel the timer task if input is received before 10 seconds
        timer.cancel();

        // Check if timer ended and return the appropriate value
        if (userInput.equals("timer-end")) {
            return userInput;
        } else {
            return userInput;
        }
    }

    public static void main(String[] args) {
//        QuizTimer timer = new QuizTimer();
        
    }
}
