package training;

class Cancellation extends Thread
{
	public void run()
	{
		System.out.println("I am Cancellation Thread...");
	}
}

class Reservation extends Thread
{
	public void run()
	{
		System.out.println("I am Reservation Thread...");
	}
}

public class ThreadFGroupExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Reservation res = new Reservation();
		Cancellation can = new Cancellation();
		ThreadGroup tg1 = new ThreadGroup("First Group");
		Thread t1 = new Thread(tg1,res,"First Thread");
		Thread t2 = new Thread(tg1,res,"Second Thread");
		ThreadGroup tg2 = new ThreadGroup("Second Group");
		Thread t3 = new Thread(tg2,can,"Third Thread");
		Thread t4 = new Thread(tg2,can,"Fourth Thread");
		
		System.out.println("Parent of tg1 = "+tg1.getParent());
		tg1.setMaxPriority(4);
		System.out.println("Thread group is t1 = " + t1.getThreadGroup());
		System.out.println("Thread group is t3 = " + t3.getThreadGroup());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println("No of thread active in tg1 = "+ tg1.activeCount());
	}

}
