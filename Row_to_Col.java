import java.util.Scanner;

public class Row_to_Col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int [][]arr= {{10,20,30},{40,50,60}};
		int rows=0;
		int cols=0;
		rows = arr.length;
		cols = arr[0].length;
		for(int i=0;i<cols;i++) {
			int temp=i;
			for(int j=0;j<rows;j++) {
				if(j!=rows-1) {
					System.out.print(arr[j][temp]+" ");
				}
				else {
					System.out.print(arr[j][temp]);
				}
			}
			System.out.println();
		}
		

	}
}
