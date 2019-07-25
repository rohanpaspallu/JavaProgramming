import java.util.Scanner;

public class Intersection_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String []strArr = str.split(" ");
		int vertical = Integer.parseInt(strArr[0].trim());
		int horizontal = Integer.parseInt(strArr[1].trim());
		if(vertical+horizontal>200) {
			System.exit(0);
		}
		String []verArr = new String[vertical];
		String []horArr = new String[horizontal];
		
		for(int i=0;i<verArr.length;i++) {
			verArr[i]=in.nextLine();
		}
		
		for(int i=0;i<horArr.length;i++) {
			horArr[i]=in.nextLine();
		}
		
		
		int count=0;
		for(int i=0;i<verArr.length;i++) {
			String temp = verArr[i];
			String[] t = temp.split(" ");
			int x = Integer.parseInt(t[0]);
			int y1 = Integer.parseInt(t[1]);
			int y2 = Integer.parseInt(t[2]);
			
			for(int j=0;j<horArr.length;j++) {
				String temp2 = horArr[j];
				String []t2 = temp2.split(" ");
				int y = Integer.parseInt(t2[0]);
				int x1 = Integer.parseInt(t2[1]);
				int x2 = Integer.parseInt(t2[2]);
				
				if(y>=y1 && y<=y2 && x>=x1 && x<=x2) {
					count++;
				}
				else {
					continue;
				}
			}
		}
		
		System.out.println(count);
	}

}



//1 1
//50 20 60
//30 40 80

//2 2
//25 25 80
//75 25 80
//25 25 80
//75 25 80
