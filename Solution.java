import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer>al = new ArrayList<Integer>();
        for(int i=0;i<nums.length-1;i++){  
//            if(nums[i]<=target){
                    for(int j=1;j<nums.length;j++){
                
//                    	if(nums[j]<=target){
//                    		System.out.println(nums[i]+ " "+ nums[j]);
                    	
                    	
	                        if(nums[i]+nums[j]==target && i!=j){
//	                        	if(al.contains(i)&&al.contains(j)) {
//	                        		continue;
//	                        	}
//	                        	else if(al.contains(i)&& !al.contains(j)) {
//	                        		al.add(j);
//	                        	}
//	                        	else if(!al.contains(i)&& al.contains(j)) {
//	                        		al.add(i);
//	                        	}
//	                        	else {
//	                        		al.add(i);
//	                        		al.add(j);
//	                        	}
	                            
	                        	
	                        	if(al.contains(i)) {
	                        		continue;
	                        	}
	                        	else {
	                        		al.add(i);
	                        	}
	                        	
	                        	if(al.contains(j)) {
	                        		continue;
	                        	}
	                        	else {
	                        		al.add(j);
	                        	}
	                            
	                        }
	                        else {
	                        	continue;
	                        }
//                    	}
//                    	else {
//                    		continue;
//                    	}
                    }   
//            }
//            else {
//            	continue;
//            }
        }
        int[] x = new int[al.size()];
        for(int i=0;i<x.length;i++) {
        	x[i]= al.get(i);
        }   
        return x;
    }
	    public static void main(String []args){
	        int [] nums = {-1, -2, -3, -4, -5};
	        int target = -8;
	        
	        Solution s = new Solution();
	        int []sum = s.twoSum(nums, target);
	        
	        
	        List<Integer> l = new ArrayList<>(sum.length);

			for (int i : sum) {
				l.add(Integer.valueOf(i));
			}
	        
			System.out.println(l);
	    }
	}
