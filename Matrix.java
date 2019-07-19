import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String n = in.nextLine();
		String []no = n.split(" ");
		int rows = Integer.parseInt(no[0]);
		int cols = Integer.parseInt(no[1]);
		int [][]arr = new int [rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=Integer.parseInt(in.nextLine());
			}
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		int [][]out = new int [cols][rows];
		
		for(int j =0;j<cols;j++) {
			for(int i=rows-1;i>=0;i--) {
				int count=j;
				if(count<cols) {
					
					
					if(i>=0) {
						al.add(arr[i][count]);
					}
				}
			}
		}
		
//		System.out.println(al);
		String str = "";
		for(Integer i: al) {
			str = str+" "+i;
		}
		System.out.println(str.trim());
	}


}











//for(int j=0;j<rows;j++) {
//	al.add(arr[i][j]);
//	System.out.println(j+" "+i);
//}
//if(count<cols) {
//	al.add(arr[count][i]);
//}
//else {
//	continue;
//}