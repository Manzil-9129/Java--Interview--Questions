package Questions;

import java.util.Arrays;

public class Largest_n_Smallest_n_Array {

	public static void main(String[] args) {
    int number[]= {10,5,9,3,12,11,7,6};
	
     int L=number[0];
     int s=number[0];
		for(int i=1;i<number.length;i++)
		{
			
				if(number[i]>L)
				{
					L=number[i];
				}
				else if(number[i]<s)
				{
					s=number[i];
				}
				
			
			
		}
		System.out.println(Arrays.toString(number));
		System.out.println(L);
		System.out.println(s);
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	/*
	// Finding the smallest number
	for(int i= 0; i<number.length-1; i++) {
		
		if(number[i]< number[i+1]) {
			
			number[i+1] = number[i];
		}
		
		
	}
		System.out.println("smallest is: " + number[number.length- 1]);
		
		System.out.println(Arrays.toString(number));
		// Finding the largest number
		
		for(int i= 0; i<number.length-1; i++) {
			
			if(number[i] > number[i+1]) {
				
				number[i+1] = number[i];
			}
			
			
		}
			System.out.println("Largest is: " + number[number.length- 1]);
			
		*/
	
		
		
	}

}
