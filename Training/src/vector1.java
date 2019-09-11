import java.util.ArrayList;
import java.util.Vector;

public class vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 = new Vector();
		v1.add(3);
		v1.add(2);
		v1.add(1);
		v1.add(4);
		System.out.println(v1.size());
		v1.remove(1);
		System.out.println(v1.size());
		
		ArrayList a1 = new ArrayList();
		System.out.println(a1.size());
		a1.add(20);
		a1.add(20);
		a1.add(20);
		a1.add(20);
		System.out.println(a1.size());
	}

}
