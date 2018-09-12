package controller;

import java.util.Scanner;

public class DumbController
{

	public void start()
	{
		moreInput();
		
//		System.out.println("hola mundo");
//		System.out.println("a line");
//		System.out.println(" same line line");
//		
	
		questions();
		
	}

	private void questions()
	{
		System.out.print("what is your name?");
		Scanner inputScanner = new Scanner(System.in);
		
		String answer = inputScanner.next();
//		System.out.println(answer);
		
		boolean trueOrFalse;
		
	
		
		System.out.println( answer + " do you know any languages other than english?");
		trueOrFalse = inputScanner.nextBoolean();
		
		if ( trueOrFalse ) {
		    System.out.println("write a full sentence in a language that is not english");
		} else {
		    System.out.println("learn one, it is useful");
		}
		answer = inputScanner.next();
		
				
		inputScanner.close();
	}
	
	private void moreInput() 
	{
		Scanner anotherScanner;
		
		anotherScanner = new Scanner(System.in);
		
		System.out.println("what is the meaning of life?");
		int secondAnswer = anotherScanner.nextInt();
		System.out.println("you typed: " + secondAnswer);
		
		anotherScanner.nextLine();//used to consume enter key 
		
		//double holds real numbers AKA with decimal point
		double magicNumber;
		
		System.out.println("type cool decimal number");
		magicNumber = anotherScanner.nextDouble();
		
		System.out.println(magicNumber);
		
//		anotherScanner.close();
	}
//this is a formal parameter, and uses try catch to check if the input is valid
	public boolean validInt(String example)
	{
		boolean isValid = false;
		
		try 
		{
			Integer.parseInt(example);
			isValid = true;
		}
		catch(NumberFormatException error) 
		{
			System.out.println("Type in a valid int value human!");		
		}
		
		return isValid;
	}
	
	public boolean validDouble(String example)
	{
		boolean isValid = false;
		
		try 
		{
			Double.parseDouble(example);
			isValid = true;
		}
		catch(NumberFormatException error) 
		{
			System.out.println("Only floating point values are allowed for input");
		}
		
		
		return isValid;
	}
}