import java.util.Comparator;
import java.util.TreeSet;

public class TreeCompare implements Comparator {
	
		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub

			Integer i1 = (Integer)o1;
			Integer i2 = (Integer)o2;
			if(i1<i2)
				return +1;
			else if(i1>i2)
				return -1;
			else
				return 0 ;
			}
	
	
	public static void main(String args[])
	{
		TreeSet t1 = new TreeSet(new TreeCompare());
		t1.add(5);
		t1.add(3);
		t1.add(2);
		t1.add(10);
		t1.add(4);
		t1.add(15);
		System.out.println(t1);
	}



}
