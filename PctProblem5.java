import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

public class PctProblem5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numbers = Integer.parseInt(br.readLine().trim());
		HashMap<Integer, String> name= new HashMap<Integer, String>();
		HashMap<Integer, Double> marks = new HashMap<Integer, Double>();
		String []input = new String[numbers];
		for(int i=0;i<input.length;i++) {
			input[i]= br.readLine().trim();
		}
		
		for(String i:input) {
			String [] arr = i.split(" ");
			name.put(Integer.parseInt(arr[0]), arr[1]);
			marks.put(Integer.parseInt(arr[0]), Double.parseDouble(arr[2]));
		}
		
		
		
		System.out.println(name.entrySet());
		System.out.println(marks.entrySet());
		
		double max= marks.get(1);
		double min = marks.get(1);
		int maxIndex = 1;
		int minIndex = 1;
		for(Map.Entry<Integer, Double> k: marks.entrySet()) {
			if(k.getValue()>=max) {
				max = k.getValue();
				maxIndex = k.getKey();
			}
			if(k.getValue()<=min) {
				min = k.getValue();
				minIndex = k.getKey();
			}
		}
		
//		System.out.println("max value:"+ max);
//		System.out.println("min value:"+min); 
//		System.out.println("max index:"+ maxIndex);
//		System.out.println("min index:"+minIndex); 
		
		System.out.println(name.get(maxIndex)+" "+ maxIndex);
		System.out.println(name.get(minIndex)+" "+ minIndex);
	}

}