package Questions;

public class Number_of_digits_in_integer {

	public static void main(String[] args) {
		
	int number= 658004;
    int count=0;
    
    while(number!=0) {
    	number=number/10;
    	count++;
   
    }
 	System.out.println(count);
	}
	
	
}
