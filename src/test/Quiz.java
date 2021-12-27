package test;

// to do list
// implement the optional extras 

import java.util.*;
import java.util.Random;

public class Quiz {
	static String randomUsername(String name) { // function to create a random username
		Random rand = new Random();
		int usernameNum = rand.nextInt(999 - 100) + 100; // create a random number between 100 and 999
		String username = name + usernameNum; // store user's name and random number concat.
		System.out.print("Username: "); 
		return username; 
	}
	// question and answer method
	static int QandA(String[] questions, boolean[] answers, int totalScore) {
		Scanner scanner = new Scanner(System.in);
		for(int i = 0;i<5;i++) { // loop through the 5 questions
			System.out.print(questions[i]);
			boolean answerInput = false;
		    Boolean repeat = true;
		    while(repeat) { // repeat until valid input
			      try {
			        answerInput = scanner.nextBoolean();
			        repeat = false; // set repeat = false if there is a valid input
			      } catch(InputMismatchException e) { // catch the error message
			          System.out.println("Invalid input, please enter again.");
			          scanner.next();   // read the buffer after nextBoolean
			          repeat = true;
			      }
			}
		    if(answerInput == answers[i]) { // check if user answer is same as real answer
		    	totalScore += 2;
		    }
		    
			System.out.println("Do you want to quit the quiz? [Y to quit, any other key to continue]");
			scanner.nextLine(); // buffer to read the "Enter" after the previous input
			String isQuit = scanner.nextLine().toUpperCase(); // reads the Enter
			if(isQuit.equals("Y")) {
				break;
			}
		}
		System.out.println("You have finished the quiz!");
		System.out.print("Total Score: ");
		return totalScore;
	}
	static String gradingSystem(int totalScore) {
		// grading system
		if(totalScore <= 2) {
			System.out.println("Better luck next time!");
		} else if(totalScore <= 4) {	
			System.out.println("You got a grade of C");
		} else if(totalScore <= 6) {
			System.out.println("You got a grade of B");
		} else if(totalScore <= 8 && totalScore >= 10) {
			System.out.println("You got a grade of A");
		} else {
			System.out.println("You can do better next time! ");
		}
		return "";
	}

	public static void main(String[] args) {
		String[] easyQuestions = new String[] {"Pseudo-code uses exact programming language syntax to represent a module in the larger program. [true/false]", 
				"Digital camera is input device used to take photographs, [true/false]", "CPU stands for Central Processing Unit.[true/false]", 
				"The language that machines can understand is called machine language. [true/false]",
				"FAX stands for First Away Xerox. [true/false]"};
		String[] hardQuestions = new String[] {"The CPU is responsible for executing instructions for the computer. [true/false]", 
				"Symbolic languages use mnemonics to represent the various machine language instructions. [true/false]", 
				"A source file contains code written in a programming language that is to be sent to the compiler. [true/false]", 
				"Pseudo-code and flowcharts can be used to represent individual algorithms of a program. [true/false]", 
				"Except for the most simple program, one set of test data will not completely validate a program. [true/false]"};
		boolean[] easyAnswers = new boolean[] {false, true, true, true, false}; // easy questions answers
		boolean[] hardAnswers = new boolean[] {true, true, true, true, true}; // hard questions answers
		ArrayList<String> usernamesArr = new ArrayList<String>(); 
		ArrayList<Integer> scoresArr = new ArrayList<Integer>();
		while(true) {
			// data structure/arrays
			int totalScore = 0;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Hello, welcome to the CS quiz!");
			System.out.println("Please enter your name: ");
			String name = scanner.nextLine(); // input user's name
			name = name.replaceAll(" ", "_"); // fill in space with _
			String usernameOutput = randomUsername(name);
			System.out.println(usernameOutput); // print username
			usernamesArr.add(usernameOutput); // add username into array
			
			System.out.println("There will be 5 true or false questions. Please answer them correctly. ");
			System.out.println("Would you like easy or hard questions? [e/h]");
			String isDifficulty = scanner.next().toLowerCase(); 
			if(isDifficulty.equals("e")) {
				 int outputEasy= QandA(easyQuestions, easyAnswers, totalScore);
				 System.out.println(outputEasy); // print out totalScore
				 scoresArr.add(outputEasy); // add the score into the array
				 String gradeOutput = gradingSystem(totalScore);
				 System.out.println(gradeOutput); // print out user's grades
			} else {
				 int outputHard= QandA(hardQuestions, hardAnswers, totalScore);
				 System.out.println(outputHard);
				 scoresArr.add(outputHard);
				 String gradeOutput = gradingSystem(totalScore);
				 System.out.println(gradeOutput);
			}
			// ask the user if they want to continue with a different person
			System.out.println("Is anyone else going to play? [Y/N]");
			String isEnd = scanner.next().toUpperCase();
			if(isEnd.equals("N")) {
				break;
			}
		}
		System.out.println("----");
		System.out.println("OPERATOR'S INFORMATION");
		for(int i = 0;i<usernamesArr.size();i++) {
			System.out.println("Username: " + usernamesArr.get(i) + ", total score of user: " + scoresArr.get(i));
		}
	}

}
