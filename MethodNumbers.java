/**
 * Logan Davison
 */
import java.util.Scanner;
public class MethodNumbers 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please Enter Number 1: ");
		int num1 = keyboard.nextInt();
		System.out.print("Please Enter Number 2: ");
		int num2 = keyboard.nextInt();
		System.out.print("Please Enter Number 3: ");
		int num3 = keyboard.nextInt();
		System.out.println("The smallest number is " + smallest(num1, num2, num3));
		
	}
	
	public static int smallest(int number1, int number2, int number3)
	{
		if(number1 < number2 && number1 < number3)
		{
			return number1;
		}
		else if(number2 < number1 && number2 < number3)
		{
			return number2;
		}
		else
		{
			return number3;
		}
		
	}
	

}
