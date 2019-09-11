package training;

public class Data {
	
	public volatile int counter = 0;
	 public int getCounter()
	 {
		 return counter;
	 }
	 public void countIncrement() {
		 try {
			 Thread.sleep(10);
		 }catch(InterruptedException ie)
		 {
			 System.out.println(ie);
		 }
		 ++counter;
	 }

}
class myTask implements Runnable
{
	private Data data;
	public myTask(Data data)
	{
		this.data= data;
	}

	@Override
	public void run() {
		System.out.println("Value for Thread" + Thread.currentThread().getName()+ " Before Increment"+data.getCounter());
		data.countIncrement();
		System.out.println("Value for Thread" + Thread.currentThread().getName()+ " After Increment"+data.getCounter());
	}
	
}
