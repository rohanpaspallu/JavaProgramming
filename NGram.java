import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NGram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String []str = new String[n];
		for(int i=0;i<str.length;i++) {
			str[i]=in.nextLine();
		}
		
		for(int i=0;i<str.length;i++) {
			String temp = str[i];
			String dummy="";
			for(int j=0;j<temp.length();j++) {
				if(temp.charAt(j)==' '||temp.charAt(j)=='.'||temp.charAt(j)==',') {
					continue;
				}
				else {
					dummy= dummy+temp.charAt(j);
				}
			}
			str[i]=dummy;
		}
		
//		for(int i=0;i<str.length;i++) {
//			System.out.println(str[i]);
//		}
		
		
		TreeMap<String, Integer> unigram = new TreeMap<String, Integer>();
		TreeMap<String, Integer> bigram = new TreeMap<String, Integer>();
		TreeMap<String, Integer> trigram = new TreeMap<String, Integer>();
		
//		int count=1;
		int count=0;
		for(int i=0;i<str.length;i++) {
			String temp = str[i];
			for(int j=0;j<temp.length();j++) {
				String dummy=Character.toString(temp.charAt(j));
				if(unigram.containsKey(dummy)) {
//					int c=unigram.get(dummy);
					unigram.put(dummy, unigram.get(dummy)+1);
				}
				else {
					unigram.put(dummy, 1);
				}
			}
		}
		
//		int count2=0;
		for(int i=0;i<str.length;i++) {
			
			String temp = str[i];
			for(int j=0;j<temp.length()-1;j++) {
				String dummy=Character.toString(temp.charAt(j))+Character.toString(temp.charAt(j+1));
				if(bigram.containsKey(dummy)) {
//					int c=bigram.get(dummy);
//					c=c++;
					bigram.put(dummy, bigram.get(dummy)+1);
				}
				else {
					bigram.put(dummy, 1);
				}
			}
		}
//		int count3=1;
		for(int i=0;i<str.length;i++) {
			
			String temp = str[i];
			for(int j=0;j<temp.length()-2;j++) {
				String dummy=Character.toString(temp.charAt(j))+Character.toString(temp.charAt(j+1))+Character.toString(temp.charAt(j+2));
				if(trigram.containsKey(dummy)) {
//					int c=trigram.get(dummy);
					trigram.put(dummy, trigram.get(dummy)+1);
				}
				else {
					trigram.put(dummy, 1);
				}
			}
		}
		
		
		
//		System.out.println(unigram);
//		System.out.println(bigram);
//		System.out.println(trigram);
		int max1=0;
		String uni = "";
		for(Map.Entry<String, Integer> tm: unigram.entrySet()) {
			if(tm.getValue()>max1) {
				max1= tm.getValue();
				uni= tm.getKey();
			}
		}
		
		int max2=0;
		String bi = "";
		for(Map.Entry<String, Integer> tm: bigram.entrySet()) {
			if(tm.getValue()>max2) {
				max2= tm.getValue();
				bi= tm.getKey();
			}
		}
		
		int max3=0;
		String tri = "";
		for(Map.Entry<String, Integer> tm: trigram.entrySet()) {
			if(tm.getValue()>max3) {
				max3= tm.getValue();
				tri= tm.getKey();
			}
		}
		
//		System.out.println(uni);
//		System.out.println(bi);
//		System.out.println(tri);
		
		int choice = Integer.parseInt(in.nextLine());
		if(choice==1) {
			System.out.println(uni);
		}
		else if (choice==2) {
			System.out.println(bi);
		}
		else if (choice==3) {
			System.out.println(tri);
		}
		else {
			System.out.println("wrong input");
			System.exit(0);
		}
	}

}
