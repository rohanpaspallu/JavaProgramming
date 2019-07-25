import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String [] strArr = str.split("");
//		int []arr = new int[strArr.length];
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<strArr.length;i++) {
			int temp = Integer.parseInt(strArr[i].trim());
			al.add(temp);
		}
		
		Collections.sort(al);
		System.out.println(al);
		ArrayList<Integer>al2 = new ArrayList<Integer>();
		for(int i=al.size()-1;i>=0;i--) {
			al2.add(al.get(i));
		}
		
		System.out.println(al2);
		
		String min ="";
		for(int i=0;i<al.size();i++) {
			min = min+Integer.toString(al.get(i));
		}
		
		
		String max ="";
		for(int i=0;i<al2.size();i++) {
			max = max+Integer.toString(al2.get(i));
		}
		
		System.out.println(min);
		System.out.println(max);
		
		int less = Integer.parseInt(min);
		int more = Integer.parseInt(max);
		int ans = more-less;
		System.out.println(ans);
	}

}