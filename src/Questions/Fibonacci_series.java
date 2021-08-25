package Questions;


public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int startn=0;
		int number2=1;
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(startn);
		   int sum=startn+number2;
		   number2=startn;
		   startn=sum;
			
			
		}
		System.out.println(startn);
		
		
	}

}
