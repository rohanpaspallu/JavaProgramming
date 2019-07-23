import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Unique_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		str = str.toLowerCase();
		String []strArr = str.split(" ");
		
		
		ArrayList<String>dummy = new ArrayList<String>(Arrays.asList(strArr));
		System.out.println(dummy);
		dummy.removeAll(Arrays.asList("",null));
		System.out.println(dummy);
		
		
		Object[] strArr2 = dummy.toArray();
		String []strArr3 = new String[dummy.size()];
		
		
		for(int i=0;i<strArr3.length;i++) {
			strArr3[i] =(String) strArr2[i];
		}
		
		
		
		ArrayList<String>ll = new ArrayList();
		int count=0;
		for(int i=0;i<strArr3.length;i++) {
			if(ll.isEmpty()) {
				ll.add(strArr3[i]);
				count++;
			}
			else if (!ll.isEmpty()) {
				if(strArr3[i]=="  ") {
					continue;
				}
				else {
					String temp = strArr3[i];
					if(ll.contains(temp)) {
						continue;
					}
					else {
						ll.add(temp);
						count++;
					}
				}
				
			}
		}
		
		System.out.println(count);
		
	}

}


//Prithviraj D Chavan Output chavan PrithviraJ d Input   Barak Obama InputOutput Output