import java.util.Scanner;

public class Card_Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String card = in.nextLine();
		int length = card.length();
		String[] no = card.split("");
		int []no_int = new int[length];
		for(int i=0;i<no_int.length;i++) {
			no_int[i] = Integer.parseInt(no[i]);
		}
		int []multiply = new int [length];
		if(length%2!=0) {
			for(int i=no_int.length-1;i>=0;i--) {
				if(i%2!=0) {
					multiply[i]= no_int[i]*2;
				}
				else {
					multiply[i]=no_int[i];
				}
			}
		}
		else {
			for(int i=no_int.length-1;i>=0;i--) {
				if(i%2==0) {
					multiply[i]= no_int[i]*2;
				}
				else {
					multiply[i]=no_int[i];
				}
			}
		}
		
		
//		for(int i=0;i<length;i++) {
//			System.out.println(no_int[i]+" : "+multiply[i]);
//		}
		
		int []sum = new int[length];
		for(int i=0;i<length;i++) {
//			int temp = multiply[i];
			String t = Integer.toString(multiply[i]);
			if(t.length()==1) {
				continue;
			}
			else {
				String []temp = t.split("");
				int first = Integer.parseInt(temp[0]);
				int second = Integer.parseInt(temp[1]);
				multiply[i]=first+second;
			}
		}
		
//		for(int i=0;i<length;i++) {
//			System.out.println(multiply[i]);
//		}
		
		
		int count=0;
		for(int i=0;i<length;i++) {
			count= count+multiply[i];
		}
		
		if(count%10==0) {
			System.out.println("VALID");
		}
		else {
			System.out.println("INVALID "+count%10);
		}
	}

}
