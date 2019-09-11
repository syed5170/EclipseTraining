import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	
	public static void main(String args[])
	{
		Queue<String> waitingQueue = new LinkedList<>();
		
		waitingQueue.add("Ahsan");
		waitingQueue.add("Dimple Garg");
		waitingQueue.add("Shikhar");
		waitingQueue.add("Sumit");
		waitingQueue.add("Sanchit");
		
		System.out.println("Waiting Queue : " + waitingQueue);
		
		String name = waitingQueue.remove();
		System.out.println("Remove from Waiting Queue : "+ name + " | New Waiting Queue: "+ waitingQueue);
		name = waitingQueue.poll();
		System.out.println("Removed from Waiting Queue : "+ name + "|New Waiting Queue : "+ waitingQueue);
		
		
		
	}

}
