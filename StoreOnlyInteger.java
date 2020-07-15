package list;
import java.util.*;
public class StoreOnlyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Number> arr = new ArrayList<Number>();
		arr.add(11);
		arr.add(11.121);
		arr.add(0.11);
		arr.add(11.1);
		printAll(arr);
	}
	public static void printAll(ArrayList<Number> arr) {
		Iterator<Number> i = arr.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
