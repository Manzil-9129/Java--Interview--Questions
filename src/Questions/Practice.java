package Questions;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//prime number
	/*	int number=23;
		int counter=0;
		for(int i=2;i<number-1;i++) {
			
			if((number%i)==0)
			{
				counter++;
			}
			
		}
		if(counter==0)
		{
			System.out.println("The number is prime");
		}
		else {
			System.out.println("The number is not prime");
		}*/
		
		//Logic for N factorial
		
	/*	int number=10;
		int counter=1;
		
		for(int i=1;i<=number;i++) {
			
			counter=counter*i;
			
			
			}
		System.out.println(counter);*/
		
		
		
		//reverse a String
	/*	String name="Indian Man";
		ArrayList<Character> list=new ArrayList<Character>();
		
		 for(int i=0;i<name.length();i++)		
      {  
    	 list.add(name.charAt(i));
    	 
      }
		System.out.println(list.size());
	 for(int i=list.size()-1;i>=0;i--) {
		 System.out.println("Reverse String-->"+list.get(i));
	 }
		*/
	
		
		//Largest number in an array
		
		/*int[] array= {0,11,3,6,10000,54};
		int largest=array[0];
		
		for(int number:array)
		{
			if(number>largest)
			{
				largest=number;
			}
		}
		System.out.println(largest);
		*/
		
		
		
		//How many matching nodes are there
	/*	String[] array= {"Ruchi","Disha","Ruchi","Paul","Nikul","Ruchi"};
		int counter=0;
		for(int i=0;i<array.length;i++)
		{
				if(array[i]=="Ruchi")
				{
                   counter++;		
				}
		}
		System.out.println(counter);*/
		
		
		/*int number=5446;
		int reverse=0;
		ArrayList<Integer> array=new ArrayList<Integer>();
	
		
		while(number!=0)
		{
			reverse=number%10;
	        array.add(reverse);		
			number=(number/10)-(reverse/10);
			
		}
		
		System.out.println(array);
		
		
		*/
		
		int number;
		
		
		
		
		
	}

}
