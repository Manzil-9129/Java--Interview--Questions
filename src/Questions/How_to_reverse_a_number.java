package Questions;

import java.util.ArrayList;

public class How_to_reverse_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int number=11;
		//int num=number;
		int reversenumber=0;
		
		ArrayList<Integer>n=new ArrayList<Integer>();
		ArrayList<Integer>n2=new ArrayList<Integer>();
		ArrayList<Integer>n3=new ArrayList<Integer>();
		while(number!=0) {
		reversenumber=number%10;
		//System.out.print(reversenumber);
	   // number9=number9+String.valueOf(reversenumber);
		n.add(reversenumber);
		number=number/10;
		}
       
       //System.out.println(n);
		int nn=0;
		for(int n1:n) {
			
			nn=nn+n1;
		}
		
		//System.out.println(nn);
		if(nn<10) {
       int r=0;
		while(nn!=0)
		{
			r=nn%10;
			n2.add(r);
			nn=nn/10;
		}
		
		int f=0;
		for(int q:n2)
		{
			f=f+q;
		}
		
	//	System.out.println(f);
		
		
		int e=0;
		while(f!=0)
		{
			e=f%10;
			n3.add(e);
			f=f/10;
			
		}
		
		int t=0;
		for(int y:n3)
		{
			t=t+y;
		}
		System.out.println(t);
		}
		else {
			System.out.println(nn);
		}
		}

}
