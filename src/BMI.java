/**
 * Takes a weight in kilograms and a height in centimeters to
 * calculate the Body Mass Index and print it.
 */
import java.util.Scanner;

public class BMI 

{
	public static void main(String[] args)
	{		
		Scanner input;
		input = new Scanner(System.in);
		
		int h;
		int w;
		double bmi;
		
		System.out.println("Enter your weight in kilograms.");
		w = input.nextInt();
		
		System.out.println("Enter your height in centimeters.");
		h = input.nextInt();
		
//		bmi =  w / (Math.pow(h, 2) / Math.pow(100, 2));
		bmi = (double) w / (h/100*h/100); 
		
		System.out.println("Your BMI is " + bmi);
	}
}

/*
 
Enter your weight in kilograms.

79

Enter your height in centimeters.

188

Your BMI is 22.351742870076958
 
*/
