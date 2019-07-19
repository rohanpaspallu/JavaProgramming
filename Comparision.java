import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		ArrayList<String> a1 = new ArrayList<String>(Arrays.asList(str1.split("")));
		ArrayList<String> a2 = new ArrayList<String>(Arrays.asList(str2.split("")));
		for(int i=0;i<a1.size();i++) {
			String temp = " ";
			if(a1.get(i).equals(" ")) {
				a1.remove(i);
			}
		}
		
		for(int i=0;i<a2.size();i++) {
			String temp = " ";
			if(a2.get(i).equals(" ")) {
				a2.remove(i);
			}
		}
		
		System.out.println(a1);
		System.out.println(a2);
		if(a1.size()==a2.size()) {
			for(int i=0;i<a1.size();i++) {
				String temp  =a1.get(i);
				if(a2.contains(temp)) {
					a2.remove(temp);
				}
				else {
					continue;
				}
			}
		}
		else {
			System.out.println("not a permutation");
		}
		
		if(a2.isEmpty()) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
