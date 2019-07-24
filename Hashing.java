import java.util.ArrayList;
import java.util.Scanner;

public class Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int size = Integer.parseInt(in.nextLine());
		String str = in.nextLine();
		
		String[] strArr = str.split(" ");
		
		ArrayList<String> al = new ArrayList<String>();
		
		
		
//		for(int i=0;i<strArr.length;i++) {
//			System.out.println(strArr[i]);
//		}
		
		for(int i=0;i<strArr.length;i++) {
			if(strArr[i].equals("-1")) {
				break;
			}
			al.add(strArr[i]);
		}
		
		
		int []arr =new int[al.size()]; 
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= Integer.parseInt(al.get(i));
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int[]ans = new int[size];
		
		
		
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
//		System.out.println(al);
	}

	private static void recursive(int[] arr, int[] ans, int size) {
		// TODO Auto-generated method stub
		
		recursive(arr,ans,size);

		for(int i=0;i<arr.length;i++) {
			int j = arr[i]%size;
			if(ans[j]==0) {
				ans[j]=arr[i];
			}
			
			else {
				int temp = arr[i]%10;
				arr[i] = arr[i]/10;
				recursive(arr, ans, size);
			}
		}
	}

}
