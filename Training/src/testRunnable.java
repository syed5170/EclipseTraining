
 class threadrunnable extends Thread
 {
	public void run()
	{
		for(int i = 0; i<20;i++)
		{
			System.out.println("child thread");
		}
		System.out.println("Inside Child thread..."+ Thread.currentThread().getName());
		Thread.currentThread().setName("Java Thread");
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread());
	}
}		
	
class testRunnable
{
	public static void main(String[] args) 
	{
			
		threadrunnable tr = new threadrunnable();
		Thread t1 = new Thread(tr);
		t1.start();
		for(int i=0; i<20; i++)
		{
			System.out.println("main thread"); 
		}
		System.out.println(t1.getName());
		Thread.currentThread().setName("Ahsan");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(3);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread());
	}
}
