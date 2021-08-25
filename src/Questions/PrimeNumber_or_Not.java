package Questions;

import java.util.ArrayList;
import java.util.Scanner;



public class PrimeNumber_or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
   /*int number=3;
	int counter=0;
	for(int num=2;num<=number-1;num++) {
		if((number%num)==0)
		{
         counter++;
         
		 }
	} 		
		if(counter++==0) {
	System.out.println("Then the number is Prime");
	}
		else {
			System.out.println("Number is not prime");
		}
	*/
		
	//Print prim numbers between 2 and 25
		
  int number1=3;
   int number2=25;
   int counter=0;
 
   ArrayList<Integer> pnumbers=new ArrayList<Integer>();

   for(int i=2;i<=25;i++) {
	   
	   for(int j=2;j<=i-1;j++) {
		   if((i%j)==0) {
		   counter++;
		   }
		   
	   }
		   if(counter==0) {
			   System.out.println(i);
		   }
		   else
		   {
			   counter=0;
		   }
	   
   } 
	   
	   
	   
   
		
		
}
}