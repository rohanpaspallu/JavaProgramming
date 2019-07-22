import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> stringList = new ArrayList<>();
		
		int n = Integer.parseInt(sc.nextLine());
		String[] strarr = new String[n];
		
		for(int i=0; i<n; i++)
		{
			strarr[i] = sc.nextLine();
		}
		
		//loop for each line of string in the array (which is the input lines).
		for(int i=0; i<n; i++)
		{
			LinkedList<String> stack = new LinkedList<>();
			String nstring = ""; //this string is to concat every character in each line if it is a comment.
			String a = strarr[i];
			
			//this loop is to iterate every character in the string
			for(int j=0; j<a.length(); j++)
			{
//				System.out.print(a.charAt(j));
				if(stack.isEmpty())
				{
					//"\" is used as an escape sequence to read double quotes as a character.
					if(a.charAt(j) == '\"') 
					{
						stack.push("\"");
					}
					//"\" is used as an escape sequence to read single quotes as a character.
					else if(a.charAt(j) == '\'') 
					{
						stack.push("\'");
					}
					// if the character is "/" then check if the next character is "*", if true then push it stack and increment j since next character is already scanned to verify the type of comment.
					else if(a.charAt(j) == '/' && a.charAt(j+1) == '*') 
					{
						stack.push("/*");
						j++;
					}
					// if the character is "/" then check if the next character is "/", if true then push it stack and increment j since next character is already scanned to verify the type of comment.
					else if(a.charAt(j) == '/' && a.charAt(j+1) == '/') 
					{
						stack.push("//");
						j++;
					}
				}
				
				else if(!stack.isEmpty())
				{
					// if the current character is double quotes and stack is not empty(which means that this is closing pair of double quotes
					if(a.charAt(j) == '\"')
					{
						// before popping out the stack and ending the comment verify whether is the correct pair.
						if(stack.peek() == "\"")
						{
							stack.pop();
							nstring = nstring.concat(" "); // to add space after every type of comment ends.
						}
						else
						{
							nstring = nstring.concat(Character.toString(a.charAt(j)));
						}
					}
					// if the current character is single quotes and stack is not empty(which means that this is closing pair of single quotes
					else if(a.charAt(j) == '\'')
					{
						// before popping out the stack and ending the comment verify whether is the correct pair.
						if(stack.peek() == "\'")
						{
							stack.pop();
							nstring = nstring.concat(" "); // to add space after every type of comment ends.
						}
						else
						{
							nstring = nstring.concat(Character.toString(a.charAt(j)));
						}
					}
					else if(a.charAt(j) == '*' && a.charAt(j+1) == '/')
					{
						if(stack.peek() == "/*")
						{
							stack.pop();
							//increment j since next character is already scanned to verify the type of comment.
							j++;
							nstring = nstring.concat(" "); // to add space after every type of comment ends.
						}
						else
						{
							nstring = nstring.concat(Character.toString(a.charAt(j)));
						}
					}
					else
					{
						nstring = nstring.concat(Character.toString(a.charAt(j)));
					}
				}
//				System.out.println(nstring);
			}//end of for
			
			//after processing 1 string
			//add the concatenated string into the an ArrayList which can be used to print the output.
			stringList.add(nstring);
			
		}// end of for
		
		//after processing all the n lines of strings, print it.
		for(String s:stringList)
		{

			//use trim() function to eliminate a space at the end of each line which will be added after each comment ends(line no. 64, 78 and 92).
			System.out.println(s.trim()); 
		}
		
	}

}
