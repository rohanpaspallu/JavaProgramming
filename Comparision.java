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
		
		System.out.println(a2);
	}

}
