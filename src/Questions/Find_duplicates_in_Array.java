package Questions;

import java.util.Collections;

public class Find_duplicates_in_Array {

	public static void main(String[] args) {
		
	int[] array= {1,2,1,4,1,2};
	int counter=1;
	for(int i=0;i<array.length-1;i++)
	{
		for(int j=i+1;j<array.length;j++)
		{
			if(array[i]==array[j]) {
				System.out.println("Duplicate number is--->"+array[i]);
			
			}
		   
			
		}
	}
	
		
		
}

}
