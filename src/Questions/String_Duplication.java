package Questions;

import java.util.ArrayList;

public class String_Duplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String reverse
		String name= "CaptainIndia";
		
		char[] n=name.toCharArray();
		int counter=0;
		
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]==n[j])
				{
					System.out.println(n[j]);
					counter++;
					break;
				}
			}
		}
		
		System.out.println(counter);
		
		
	}

}
