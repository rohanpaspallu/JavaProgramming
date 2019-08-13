import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine().trim();
		String str2 = in.nextLine().trim();
		String []arr1 = str1.split("\\s+");
		String []arr2 = str2.split("\\s+");
		int size1 = 0;
		if(arr1[0].length()>arr1[1].length()) {
			int size = arr1[0].length()-arr1[1].length();
			for(int i=0;i< size;i++) {
				arr1[1] = "0"+arr1[1];
			}
//			System.out.println(arr1[1]);
			
			size1 = arr1[0].length();
		}
		else if(arr1[0].length()<arr1[1].length()){
			
			int size = arr1[1].length()-arr1[0].length();
			for(int i=0;i< size;i++) {
				arr1[0] = "0"+arr1[0];
			}
			size1 = arr1[1].length();
		}
		else if(arr1[0].length()==arr1[1].length()){
			size1 = arr1[0].length();
		}
		
		int size2 = 0;
		
		if(arr2[0].length()>arr2[1].length()) {
			int size = arr2[0].length()-arr2[1].length();
			for(int i=0;i< size;i++) {
				arr2[1] = "0"+arr2[1];
			}
//			System.out.println(arr1[1]);
			
			size2 = arr2[0].length();
		}
		else if(arr2[0].length()<arr2[1].length()){
			
			int size = arr2[1].length()-arr2[0].length();
			for(int i=0;i< size;i++) {
				arr2[0] = "0"+arr2[0];
			}
			size2 = arr2[1].length();
		}
		else if(arr2[0].length()==arr2[1].length()){
			size2 = arr2[0].length();
		}
		
		
		
		
		
//		System.out.println(arr1[1]);
		int [][] num1 = new int[2][size1];
		int [][] num2 = new int[2][size2];
//		ArrayList<Integer>al1 = new ArrayList<>();
//		int size=0;
		for(int i=0;i<arr1.length;i++) {
			String temp = arr1[i].trim();
			long dummy = Integer.parseInt(temp);
			if(dummy<0 || dummy>1000000000) {
				System.exit(0);
			}
			for(int j=0;j<temp.length();j++) {
				String d = Character.toString(temp.charAt(j)).trim();
				num1[i][j]= Integer.parseInt(d);
//				al1.add(Integer.parseInt(d));
			}
		}
		
		
		for(int i=0;i<arr2.length;i++) {
			String temp = arr2[i].trim();
			long dummy = Integer.parseInt(temp);
			if(dummy<0 || dummy>1000000000) {
				System.exit(0);
			}
			for(int j=0;j<temp.length();j++) {
				String d = Character.toString(temp.charAt(j)).trim();
				num2[i][j]= Integer.parseInt(d);
//				al1.add(Integer.parseInt(d));
			}
		}
		
		
		
//		for(int i=0;i<num1.length;i++) {
//			for(int j=0;j<size1;j++) {
//				System.out.print(num1[i][j]);
//			}
//			System.out.println();
//		}
//		
//		for(int i=0;i<num2.length;i++) {
//			for(int j=0;j<size2;j++) {
//				System.out.print(num2[i][j]);
//			}
//			System.out.println();
//		}
		
		
		
		int count1 = 0;
		for(int i=size1-1;i>=0;i--) {
			int temp = num1[0][i]+ num1[1][i];
			if(i!=0) {
				if(temp >=10) {
					num1[0][i-1] = num1[0][i-1] +1;
					count1++;
				}
			}
			else {
				if(temp >=10) {
					count1++;
				}
			}
			
		}
		
		
		int count2 = 0;
		for(int i=size2-1;i>=0;i--) {
			int temp = num2[0][i]+ num2[1][i];
			if(i!=0) {
				if(temp >=10) {
					num2[0][i-1] = num2[0][i-1] +1;
					count2++;
				}
			}
			else {
				if(temp >=10) {
					count2++;
				}
			}
			
		}
		
//		System.out.println(count1+" "+count2);
		
		if(count1==count2) {
			System.out.print("YES "+count1);
		}
		else if(count1> count2) {
			System.out.println("NO "+count1);
		}
		else {
			System.out.println("NO "+count2);
		}
		
		
	}

}
