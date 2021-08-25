package Questions;

public class Multithreading_Example extends Thread {
 public static int amount=25;
  static int  counter=0;
	public static void main(String[] args) {
     Multithreading_Example thread=new Multithreading_Example();
	thread.start();
	while(thread.isAlive())
	{
	  System.out.println("Yeah coming");	
	}
	System.out.println(counter);
    counter++;
    System.out.println(counter);
	}

	public  void run()
	{
		counter++;
		
	}
	
	
}
