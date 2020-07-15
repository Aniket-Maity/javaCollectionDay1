package list;
import java.util.*;
public class PrintStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("aniket");
		arr.add("aniket");
		arr.add("aniket");
		arr.add("aniket");
		printAll(arr);
	}
	public static void printAll(ArrayList arr) {
		Iterator i = arr.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
