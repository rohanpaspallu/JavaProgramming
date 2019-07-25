import java.util.Scanner;
import java.util.TreeMap;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine().trim();
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		tm.put(1, 00);
		tm.put(2, 01);
		tm.put(3, 10);
		tm.put(4, 11);
		tm.put(5, 100);
		tm.put(6, 101);
		tm.put(7, 110);
		tm.put(8, 111);
		tm.put(9, 1000);
//		tm.put(9, 1001);
		
		String ans = "";
		String[]strArr = str.split("");
		for(int i=0;i<strArr.length;i++) {
			int temp = Integer.parseInt(strArr[i]);
			int ret = tm.get(temp);
			ans = ans+ret;
		}
		
		System.out.println(ans);
	}

}
