package selfStudy;

import java.util.Scanner;
import java.util.Stack;

class Node{
	char data;
	Node left, right;
	Node (char info){
		data = info;
		left = right = null;
	}
}



public class BFS {

	Node root;
	
	BFS(){
		root = null;
	}
	
	void printLevel() {
		int h = height(root);
		int i;
		for(i = 0;i<=h;i++) {
			printGivenLevel(root,i);
		}
	}
	

	int height(Node root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return 0;
		}
		else {
			int left_height = height(root.left);
			int right_height  = height(root.right);
			
			if(left_height > right_height)
				return (left_height + 1);
			else
				return (right_height + 1);
		}
	}
	
	
	void printGivenLevel(Node root, int level) {
		// TODO Auto-generated method stub
	
		if(root == null)
			return;
		
		if(level == 1)
			System.out.println(root.data + " ");
		
		else if (level > 1) {
			printGivenLevel(root.left, level - 1);
			printGivenLevel(root.right, level - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stack = new Stack<String>();
		Scanner in  = new Scanner(System.in);
		System.out.println("enter the string");
		String str = in.nextLine();
		System.out.println("convert the string to char");
		String delimeters = "()";
		String strArr[] = str.split("");
		for(int i = 0;i< strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		
		for(int i = 0;i< strArr.length;i++) {
			int height = 0;
			if(strArr[i] == "(") {
				stack.push(strArr[i]);
				height= height+1;
			}
			else if(strArr[i]==")") {
				
			}
		}
		
//		for(int i = 0;i< strArr.length;i++) {
//			System.out.println(stack.peek());
//		}
		
		System.out.println(stack.peek());
		
	}

}
