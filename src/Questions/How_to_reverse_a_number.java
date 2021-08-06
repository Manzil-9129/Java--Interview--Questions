package Questions;

import java.util.ArrayList;

public class How_to_reverse_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int number=16001;
		int num=number;
		int reversenumber=0;
		ArrayList<Integer>n=new ArrayList<Integer>();
		String number9="";
		while(number!=0) {
		reversenumber=number%10;
		//System.out.print(reversenumber);
	    number9=number9+String.valueOf(reversenumber);
		
		n.add(reversenumber);
		number=(number/10)-(reversenumber/10);
		}
       System.out.println(number9);
        
		
		
		
	}

}
