package Questions;

import java.util.Arrays;

public class Sorting_Array {

	public static void main(String[] args) {
		int number[]= {21,9,10,6,8,17,11,88,20};
	    int counter;
		
	    //Ascending order
	    for(int i=0;i<number.length;i++)
		{
			for(int j=i+1;j<number.length;j++)
			{   
				//Descending order
				//if(number[i]<number[j]
				//Ascending order
				if(number[i]>number[j])
				{   
					counter=number[i];
					number[i]=number[j];
					number[j]=counter;
				}
			}
		}
	       System.out.println(Arrays.toString(number));
			
		//Descending order
	     
		
		
	
	
	}
	
}
