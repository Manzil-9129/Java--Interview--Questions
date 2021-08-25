package Questions;

import java.util.ArrayList;


public class practice11 {

	public static void main(String[] args)
	{
     int number=12;
     int counter=0;
	for(int i=2;i<=number;i++)
	{
		
		for(int j=2;j<=i-1;j++)
		{
			if((i%j)==0) {
			 counter++;
			}
		}
	if(counter++==0) {
		System.out.println(i);
	}
	else
	{
		counter=0;
	}
		
	}
	  
	}
	
	
	
	
	
	
	
	
}
