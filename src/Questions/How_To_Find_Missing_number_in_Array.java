package Questions;

import java.util.ArrayList;

public class How_To_Find_Missing_number_in_Array {

	public static void main(String[] args) {
	
		int[] array= {1,2,4,5,6,9,11};
		int temp=0;
		ArrayList<Integer>list=new ArrayList<Integer>();
		
		for(int i=0;i<=array.length-1;i++) {
			
			temp=array[i];
			if((temp+1)!=array[i+1])
					{
				         System.out.println((temp+1)+"<---is Missing");
					}
		}
		
		
		
		
		

	}

}
