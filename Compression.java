import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		StringBuilder sb = new StringBuilder();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		int count=0;
		for(int i=1;i<str.length()-1;i++) {
			if(str.charAt(i)=='\"'||str.charAt(i)==',') {
				continue;
			}
			if(hm.containsKey(str.charAt(i))) {
				int temp = hm.get(str.charAt(i));
				temp = temp+1;
				hm.put(str.charAt(i), temp);
			}
			else {
				hm.put(str.charAt(i), 1);
			}
		}
		ArrayList<String>al = new ArrayList<String>();
		sb.append("[");
		for(Map.Entry<Character, Integer> x: hm.entrySet()) {
			String c = Character.toString(x.getKey());
			String val = Integer.toString(x.getValue());
			sb.append("\""+c+"\""+","+"\""+val+"\""+",");
			al.add("\""+c+"\"");
			al.add("\""+val+"\"");
//			System.out.print("\""+c+"\""+","+"\""+val+"\""+",");
		}
		
//		sb.replace(sb.length(), sb.length(), "");
//		sb.append("]");
		String str2 = sb.toString();
		String str3 = str2.substring(0, str2.length()-1);
		StringBuilder sb2 = new StringBuilder(str3);
		sb2.append("]");
		System.out.println(sb2);
//		System.out.print(al);
	}

}
