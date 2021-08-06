package Questions;

import java.util.ArrayList;

public class Reverse_a_string {

	public static void main(String[] args) {
		String name="CaptainIndia";
		
		ArrayList<Character> list=new ArrayList<Character>();
		for(int i=0;i<name.length();i++)
		{
			list.add(name.charAt(i));
		}
	

       for(int i=name.length()-1;i>=0;i--)
       {
    	   System.out.println(list.get(i));
       }
		
		
	}

}
