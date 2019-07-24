import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String no = in.nextLine();
		String []split = no.split(" ");
		int vertical = Integer.parseInt(split[0]);
		int horizontal = Integer.parseInt(split[1]);
		if(vertical+horizontal>200) {
			System.out.println("values exceeding");
			System.exit(0);
		}
		String []ver_val = new String[vertical];
		String []hor_val = new String[horizontal];
		
		for(int i=0;i<ver_val.length;i++) {
			ver_val[i]= in.nextLine();
		}
		
		for(int i=0;i<hor_val.length;i++) {
			hor_val[i]= in.nextLine();
		}
		
		ArrayList<String> ver_al= new ArrayList<String>();
		ArrayList<String> hor_al= new ArrayList<String>();
		for(int i=0;i<ver_val.length;i++) {
			String[] temp = ver_val[i].split(" ");
			int first = Integer.parseInt(temp[0]);
			int second = Integer.parseInt(temp[1]);
			int third = Integer.parseInt(temp[2]);
			ver_al.add(first+" "+second);
			ver_al.add(first+" "+third);
		}
		
		for(int i=0;i<hor_val.length;i++) {
			String[] temp = hor_val[i].split(" ");
			int first = Integer.parseInt(temp[0]);
			int second = Integer.parseInt(temp[1]);
			int third = Integer.parseInt(temp[2]);
			hor_al.add(second+" "+first);
			hor_al.add(third+" "+first);
		}
		
//		int count=0;
		
		System.out.println(ver_al);
		System.out.println(hor_al);
		int max_x = 0;
		int min_x = 100;
		int max_y = 0;
		int min_y = 100;
		for(int i=0;i<ver_al.size();i++) {
			String str = ver_al.get(i);
			String[] t = str.split(" ");
			//System.out.println(t[0]+" "+t[1]);
			if(Integer.parseInt(t[0])>max_x) {
				max_x = Integer.parseInt(t[0]);
			}
			if(Integer.parseInt(t[0])<min_x) {
				min_x = Integer.parseInt(t[0]);
			}
			if(Integer.parseInt(t[1])>max_y) {
				max_y = Integer.parseInt(t[1]);
			}
			if(Integer.parseInt(t[1])<min_y) {
				min_y = Integer.parseInt(t[1]);
			}
		}
		
		
		for(int i=0;i<hor_al.size();i++) {
			String str = hor_al.get(i);
			String[] t = str.split(" ");
			//System.out.println(t[0]+" "+t[1]);
			if(Integer.parseInt(t[0])>max_x) {
				max_x = Integer.parseInt(t[0]);
			}
			if(Integer.parseInt(t[1])>max_y) {
				max_y = Integer.parseInt(t[1]);
			}
			
			if(Integer.parseInt(t[0])<min_x) {
				min_x = Integer.parseInt(t[0]);
			}
			if(Integer.parseInt(t[1])<min_y) {
				min_y = Integer.parseInt(t[1]);
			}
		}
		System.out.println(max_x+" "+min_x);
		System.out.println(max_y+" "+min_y);
		int count=0;
		
		count = recursive_ver(ver_al,hor_al,min_x,max_x,min_y,max_y,count);
		
		
		
//		for(int i=0;i<hor_al.size();i=i+2) {
//			String str1 = hor_al.get(i);
//			String str2 = hor_al.get(i+1);
//			String[] t1 = str1.split(" ");
//			String[] t2 = str2.split(" ");
//			if((Integer.parseInt(t1[0])>=min_x && Integer.parseInt(t1[0])<=max_x) && (Integer.parseInt(t1[1])>=min_y && Integer.parseInt(t1[1])<=max_y)&& (Integer.parseInt(t2[0])>=min_x && Integer.parseInt(t2[0])<=max_x)) {
//				count++;
//			}
//		}
		
		System.out.println(count);
		
	}

	private static int recursive_ver(ArrayList<String> ver_al, ArrayList<String> hor_al, int min_x, int max_x,
			int min_y, int max_y, int count) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<ver_al.size();i=i+2) {
			String str1 = ver_al.get(i);
			String str2 = ver_al.get(i+1);
			String[] t1 = str1.split(" ");
			String[] t2 = str2.split(" ");
			if((Integer.parseInt(t1[0])>=min_x && Integer.parseInt(t1[0])<=max_x) && (Integer.parseInt(t1[1])>=min_y && Integer.parseInt(t1[1])<=max_y)&& (Integer.parseInt(t2[1])>=min_y && Integer.parseInt(t2[1])<=max_y)) {
				
				for(int j=0;i<hor_al.size();j=j+2) {
					String str1_h = hor_al.get(i);
					String str2_h = hor_al.get(i+1);
					String[] t1_h = str1_h.split(" ");
					String[] t2_h = str2_h.split(" ");
					if((Integer.parseInt(t1_h[0])>=min_x && Integer.parseInt(t1_h[0])<=max_x) && (Integer.parseInt(t1_h[1])>=min_y && Integer.parseInt(t1_h[1])<=max_y)&& (Integer.parseInt(t2_h[0])>=min_x && Integer.parseInt(t2_h[0])<=max_x)) {
						count++;
//						System.out.println(count);
					}
				}
			}
		}
		
		
		return count;
	}

}
//1 1
//50 20 60
//30 40 80
