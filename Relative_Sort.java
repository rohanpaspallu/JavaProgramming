import java.util.ArrayList;

public class Relative_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {2,3,1,3,2,4,6,7,9,2,19};
		int arr2[] = {2,1,4,3,9,6};
		ArrayList<Integer>al = new ArrayList<Integer>();
		for(int i=0;i<arr2.length;i++) {
			int temp = arr2[i];
			
			for(int j=0;j<arr1.length;j++) {
				if(arr1[j]==temp) {
					al.add(arr1[j]);
				}
				else {
					continue;
				}
			}
		}
		
		for(int i=0;i<arr2.length;i++) {
			int temp = arr2[i];
			for(int j=0;j<arr1.length;j++) {
				if(!al.contains(arr1[j])) {
					al.add(arr1[j]);
				}
				else {
					continue;
				}
			}
		}
		
		System.out.println(al);
	}

}
