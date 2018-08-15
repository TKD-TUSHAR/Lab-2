package lab_02;

import java.util.Scanner;

public class Program_05 {
	
	private static Scanner kb;
	
	public static void main (String[] args) {
		
		int avg_mark;
		
		kb= new Scanner(System.in);
		
		System.out.println("Enter the Average Mark: ");
		
		avg_mark= kb.nextInt();
		
		if((avg_mark>=80)&&(avg_mark<=100))
	
			System.out.println("Your Grade is A+");
		
		else if((avg_mark>=70)&&(avg_mark<=79))
			
			System.out.println("Your Grade is A");
		
		
		else if((avg_mark>=60)&&(avg_mark<=69))
			
			System.out.println("Your Grade is B+");
		
		else if((avg_mark>=50)&&(avg_mark<=59))
			
			System.out.println("Your Grade is B");
		
		else if((avg_mark>=40)&&(avg_mark<=49))
			
			System.out.println("Your Grade is C");
		
		else if((avg_mark<40)&&(avg_mark==0))
			
			System.out.println("Your Grade is F");
		
	}

}

