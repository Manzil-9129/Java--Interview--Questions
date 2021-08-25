package Questions;

public class Super_digit {

	public static void main(String[] args) {
	int[] number= {1,2,3,6,5,1};
	int sum=0;
	int s;
	for(int num=0;num<number.length;num++) {
		
		sum=0;
		
		for(int n=0;n<number.length;n++) {
		
		
			sum=sum+number[n];
		
		
			}

		
	 s=sum-number[num];
		
	
		
		if((s/2)==number[num])
		{
			System.out.println(number[num]);
		
		}
		
		
	
	}
    
	
		
	
	

	}

}
