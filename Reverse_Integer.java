import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public int reverse(int x) {
		String str = Integer.toString(x);
//		System.out.println(str);
		String str1, str2;
		long fin=0;
		if(str.charAt(0)=='-') {
			String[] arr = str.split("-");
			str1 = arr[0];
			str2 = arr[1];
			String reverse="";
			String rev[] =  new String[str2.length()];
			for(int i=str2.length()-1;i>=0;i--) {
				reverse = reverse+str2.charAt(i);
			}
			
			str = "-"+reverse;
			fin = Long.parseLong(str);
			
			if(fin < -2147483648) {
				fin=0;
			}
			int ans = (int)fin;
			
			return ans;
			
		}
		
		else {
			String reverse="";
			String rev[] =  new String[str.length()];
			for(int i=str.length()-1;i>=0;i--) {
				reverse = reverse+str.charAt(i);
			}
			fin = Long.parseLong(reverse);
			
			if(fin >2147483647) {
				fin=0;
			}
			
			int ans = (int)fin;
			return ans;
			
		}
        
    }
	
	 public static void main(String []args){
		 int max = 2147483647;
		 int min = -2147483648;
		 int num = 1534236469;
		 if(num<=max && num>=min) {
			 Solution s = new Solution();
			 System.out.println(s.reverse(num));
		 }
	 }
}
