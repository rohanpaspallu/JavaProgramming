import java.util.LinkedList;
import java.util.Scanner;

public class Parenthesis_Matching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int no = Integer.parseInt(in.nextLine());
		String [] strArr = new String[no];
		for(int i=0;i<strArr.length;i++) {
			strArr[i]= in.nextLine();
		}
		
		LinkedList<Character> ll = new LinkedList<Character>();
		
		for(int i=0;i<strArr.length;i++) {
			String temp = strArr[i];
			for(int j=0;j<temp.length();j++) {
				if(temp.charAt(j)=='('||temp.charAt(j)==')'||temp.charAt(j)=='['||temp.charAt(j)==']'||temp.charAt(j)=='{'||temp.charAt(j)=='}') {
					if(temp.charAt(j)=='('||temp.charAt(j)=='['||temp.charAt(j)=='{') {
						ll.push(temp.charAt(j));
					}
					else if(temp.charAt(j)==')') {
						if(ll.peek()=='(') {
							ll.pop();
						}
						else {
							ll.push(temp.charAt(j));
						}
					}
					
					else if(temp.charAt(j)==']') {
						if(ll.peek()=='[') {
							ll.pop();
						}
						else {
							ll.push(temp.charAt(j));
						}
					}
					
					else if(temp.charAt(j)=='}') {
						if(ll.peek()=='{') {
							ll.pop();
						}
						else {
							ll.push(temp.charAt(j));
						}
					}
				}
			}
			//System.out.println(ll);
			if(ll.isEmpty()) {
				System.out.println("TRUE");
			}
			else {
				System.out.println("FALSE");
			}
			
			ll.clear();
		}
		
		
	}

}

//4
//(the[is]{valid})
//(the[is]{valid))
//{the(is[valid])}
//{this](is}{valid)