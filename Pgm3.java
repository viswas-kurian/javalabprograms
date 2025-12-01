import java.util.*;
import java.io.*;

class Pgm3 {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		int secretNumber = 20;
		int guess;
		int attempts = 0;

		do{
			System.out.println("Enter your guess: ");
			guess = s.nextInt();
			attempts++;

			if(guess<secretNumber){
				System.out.println("Too low! try again.");
			}
			else if(guess>secretNumber){
				System.out.println("Too High! try again.");
			}

		}while(guess!=secretNumber);
		
		System.out.println("Congratulations you guessed the number!!");
		System.out.println("Total attempts: "+attempts);
	
	}
}
