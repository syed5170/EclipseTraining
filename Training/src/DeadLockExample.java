
public class DeadLockExample {
	String obj1="Lock1";
	String obj2="Lock2";
	
	Thread t1 = (new Thread("Thread1") {
		public void run()
	{
		while(true)
		{
			synchronized (obj1)
			{
				synchronized (obj2)
				{
					System.out.println("Both the Syncronized objects "+obj1 + obj2);
				}
			}
		}
	}

});


	Thread t2 = (new Thread("Thread2") {
		public void run()
		{
			while(true)
			{
				synchronized (obj2)
				{
					synchronized (obj1)
					{
						System.out.println("Both the Syncronized objects "+obj2 + obj1);
					}
				}
			}
		}

	});
	public static void main(String args[])
	{
		DeadLockExample dt1 = new DeadLockExample();
		dt1.t1.start();
		dt1.t2.start();
	}
}
