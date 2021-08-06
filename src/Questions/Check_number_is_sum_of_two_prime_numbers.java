package Questions;

public class Check_number_is_sum_of_two_prime_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=24;
		
		}

	
	public static boolean primenumberchecking(int number1) {
		boolean gate=true;
		for(int i=2;i<number1;i++)
		{
			if((number1%i)==0)
			{
			gate=false;
			break;
			}
		}
		return gate;
		
		
	}
	
	
	
	
	
	
	
	
	
}
