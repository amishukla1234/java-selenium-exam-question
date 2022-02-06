import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JavaSeleniumQ1 {

	
		
		/*
		 *  Generate 500 random numbers and print the nth smallest number in
		 * a programming language of your choice. (Ask user for the Nth smallest number)
		 */
		
		
	 public static void main(String[] args) {
		 
		 int [] randomNumbers = new int [500];
		 // using forloop to get random numbers
		 
		 for (int i=0; i<randomNumbers.length; i++) {
			 randomNumbers[i] = (int)( Math.random()*1000);
			 System.out.println(randomNumbers[i]);
			 			 
		 }
		 int smallest = randomNumbers[0];
		 int largest = randomNumbers[0];
		
		 for (int j=1; j<randomNumbers.length; j++ ) {
			 if( randomNumbers[j]>largest) {
				 largest=randomNumbers[j];
			 } 
				 else if ( randomNumbers[j]<smallest) {
					 smallest=randomNumbers[j]; 
				
			 }
			 
		
		 }
		 System.out.println("Given random numbers are: " + Arrays.toString(randomNumbers));
		 System.out.println("Nth smallest number is : " + smallest);
		 
	 }
}