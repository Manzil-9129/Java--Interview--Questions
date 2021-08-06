/**
 * 
 */
package Questions;

import java.util.Scanner;

/**
 * @author SHIV
 *
 */
public class Number_P_N {

	public static void main(String[] args) {
		
		Scanner sr=new Scanner(System.in);
		System.out.println("Please enter the number");
		int number=sr.nextInt();
		while(number!=0) {
		System.out.println("Please enter the number");
		
		if(number>=0)
		{
			System.out.println("The number is positive");
			break;
		}
		else
		{
			System.out.println("The number is negative");
			break;
		}
		}
	}

}
