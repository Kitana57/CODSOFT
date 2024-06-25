package com.codesoft.task;

import java.util.Scanner;

import javax.tools.Tool;

public class GuessNumber {

	public static void main(String[] args) {
		//
		Scanner scanner=new Scanner(System.in);
		int randomNum;
		
		
		int guess=0, noOfRounds=0, noOfWin=0;
		String answer="";
		
		
		do {
			noOfRounds++;
			randomNum=(int) Math.floor(Math.random()*100)+1;
			System.out.println("Welcome to number game!");
			//System.out.println("the random generated number is: "+randomNum);
			
			int i=10;
			while( i>0) {
				System.out.println("enter your guess");
				guess=scanner.nextInt();
				if(guess>=1 && guess<=100) {
					if(guess == randomNum) {
						System.out.println("Guess is correct");
						noOfWin++;
						break;
					}
					else if(guess<randomNum ) {
						System.out.println("Too low");
					}
					else if (guess>randomNum) {
						System.out.println("Too high");
					}
					
				}
				else {
					System.out.println("Out of range...Try again!");
				}
				i--;
			}
			if(i==0 && guess!=randomNum) {
				System.out.println("attemps over!");
			}
			
			System.out.println("want to play again");
			answer= scanner.next();
			
		}while( answer.equalsIgnoreCase("yes"));
		
		System.out.println("Come Back soon for another interesting round");
		//System.out.println(noOfRounds+"  and" +noOfWin);
		if(noOfRounds==noOfWin) {
			System.out.println("Excellent!! you won, you scored: "+((double) noOfWin/noOfRounds)*100);
		}
		else if (noOfRounds>noOfWin) {
			System.out.println("You can do better!!...you scored: "+String.format("%.2f",((double) noOfWin/noOfRounds)*100));
		} else if(noOfWin==0){
			System.out.println("loser.... "+((double) noOfWin/noOfRounds)*100);
		}
		
	}

}
/*Generate a random number within a specified range, such as 1 to 100.*

2. Prompt the user to enter their guess for the generated number.*

3. Compare the user's guess with the generated number and provide feedback on whether the guess
is correct, too high, or too low.*

4. Repeat steps 2 and 3 until the user guesses the correct number.*

You can incorporate additional details as follows:

5. Limit the number of attempts the user has to guess the number.
6. Add the option for multiple rounds, allowing the user to play again.
7. Display the user's score, which can be based on the number of attempts taken or rounds won.*/