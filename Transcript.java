import java.util.Scanner;

public class Transcript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		String []strArr = str.split(" ");
		
		if(strArr.length==3) {
			System.out.println(strArr[2]+" "+strArr[0]+" "+strArr[1]);
		}
		
		else if(strArr.length==2) {
			char c = strArr[1].charAt(strArr[1].length()-1);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				System.out.println(strArr[1]+" "+strArr[0]);
			}
			else {
				System.out.println(strArr[0]+" "+strArr[1]);
			}
		}
		else if(strArr.length==1) {
			System.out.println(strArr[0]);
		}
		else {
//			System.out.println("wrong input!! run again!!");
			System.exit(0);
		}
	}

}
