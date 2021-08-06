package Questions;

public class Power_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int powernumber=3;
        int counter=1;
	    int number=2;
	    int num=2;
        while(counter!=(powernumber))
        {  
        	number=number*num;	
        	counter++;		
        }
        System.out.println(number);
		System.out.println(Math.pow(2, 30));
	}

}
