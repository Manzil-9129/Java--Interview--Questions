package Questions;

import java.util.ArrayList;



public class Check_Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//This will take the root number
		int number=9474;
		int number2=number;
		int finalnumber=number;
		int counter=1;
		int addnumber=0;
		int count=0;
		int reversenumber=0;
		
		ArrayList<Integer>list=new ArrayList<Integer>();

		
		
//This will count the number of digits in integer and give something(eg 2 power something)		
while(number>0) {
			number=number/10;
			count=count+1;
			}
		
//This will give each digit and will do (eg 2 power 4)	and add it to ArrayList   
  while(number2>0) {
			reversenumber=number2%10;
		    number2=(number2/10)-(reversenumber/10);
          
		    int pnumber=reversenumber;
		    
     while(counter!=count)
			{
				pnumber=pnumber*reversenumber;
				
				counter++;
			}
			counter=1;
			
			list.add(pnumber);
			
		
		}

//Get the elements from ArrayList and add them.
 for(int lnumber:list)
	  {
		 
			 addnumber=addnumber+lnumber;
	 }
	

 //Checks with the original number 
if(addnumber==finalnumber) {
		System.out.println("The number is Armstrong number");
	}
	else {
		System.out.println("The number is not Armstrong");
	}
	
	
	
	}

	
	}
