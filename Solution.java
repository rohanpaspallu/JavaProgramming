import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

	public Solution() {
	}
	

     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine().toLowerCase();
        char arr[] = str.toCharArray();
        ArrayList<String> al = new ArrayList<String>();
        for(int i=1;i<arr.length;i++) {
        	al.add(str.substring(0,i));
        	al.add(str.substring(i,str.length()));
        }
        int count=0;
        //System.out.println(al);
        
        
        String arr1[] =al.toArray(new String[al.size()]);
        for(int i=0;i<arr.length;i++) {
        	//System.out.println(arr[i]);
        }
        
        
        
        for(int i=0;i<arr1.length-1;i=i+2) {
        	String str1= arr1[i];
        	String str2= arr1[i+1];
        	int count1=0;
        	int count2=0;


            
//            System.out.println(count1+" "+count2);
            
            
        	count1 = (int) arr1[i].chars().distinct().count();
        	count2 = (int) arr1[i+1].chars().distinct().count();
//        	System.out.println(count1 +" "+ count2);
        	if(count1==count2) {
        		count++;
        	}
        	else {
        		continue;
        	}
        	
        	
        }
        
        
        
        System.out.println(count);

     }
}
