package Questions;

import java.util.Scanner;

public class Display_factors_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sr=new Scanner(System.in);
		System.out.println("****Please enter the number****");
		int number=sr.nextInt();
	
		for(int num=1;num<=number;num++) {
			
			if((number%num)==0) {
				System.out.println(num);
			}
			
		}
		
		
		
	}

}
