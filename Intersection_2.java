import java.util.Scanner;

public class Intersection_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] strArr = str.split("\\s+");
		int vertical = Integer.parseInt(strArr[0].trim());
		int horizontal = Integer.parseInt(strArr[1].trim());
		if (vertical + horizontal > 200) {
			System.exit(0);
		}
		String[] verArr = new String[vertical];
		String[] horArr = new String[horizontal];

		for (int i = 0; i < verArr.length; i++) {
			verArr[i] = in.nextLine();
		}

		for (int i = 0; i < horArr.length; i++) {
			horArr[i] = in.nextLine();
		}

		int count = 0;
		for (int i = 0; i < verArr.length; i++) {
			String temp = verArr[i];
			String[] t = temp.split(" ");
			int x = Integer.parseInt(t[0].trim());
			int y1 = Integer.parseInt(t[1].trim());
			int y2 = Integer.parseInt(t[2].trim());

			for (int j = 0; j < horArr.length; j++) {
				String temp2 = horArr[j];
				String[] t2 = temp2.split(" ");
				int y = Integer.parseInt(t2[0].trim());
				int x1 = Integer.parseInt(t2[1].trim());
				int x2 = Integer.parseInt(t2[2].trim());
				if ((x1 <= x && x <= x2) || (x2 <= x && x <= x1) && (y1 <= y && y <= y2) || (y2 <= y && y <= y1)) {
					count++;
				}
				// if( (y>=y1 && y<=y2 && x>=x1 && x<=x2) || (y>=y2 && y<=y1 && x>=x2 && x<=x1))
				// {
				// count++;
				// }
				// else {
				// continue;
				// }
			}
		}

		System.out.print(count);
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

