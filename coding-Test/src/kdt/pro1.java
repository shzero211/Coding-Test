package kdt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class pro1 {
	static int minval=Integer.MAX_VALUE;
	static int min=Integer.MAX_VALUE;
    public int solution(int[] arr) {
        List<Integer> re=new ArrayList<Integer>();
        
       for(int i=0;i<arr.length;i++) {
    	   re.add(arr[i]);
       }
       
       Collections.sort(re);
       
        for(int num:re) {
        	System.out.println(num);
        }
    	   allfind( (re.size()/2)-1,re.size()/2,arr);
      
        
       return min;
    }
    public static void allfind(int size1,int size2,int[] arr) {
    	
    	for(int i=arr[size1];i<=arr[size2];i++) {
    		int l=0;
        	int r=0;
    		for(int j=0;j<arr.length;j++) {
    			if(arr[j]<i) {
    				l++;
    			}else {
    				r++;
    			}
    		}
    		if(Math.abs(l-r)<minval&&l!=0&&r!=0) {
    			minval=Math.abs(l-r);
    			min=i;
          
    		}
    	}
    }
}
