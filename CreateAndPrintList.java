package list;
import java.util.*;
public class CreateAndPrintList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> monthList= new ArrayList<String>();
		String mt = "";
		for(int i=0;i<12;i++) {
			mt = sc.nextLine();
			monthList.add(mt);
		}
		Iterator i = monthList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
