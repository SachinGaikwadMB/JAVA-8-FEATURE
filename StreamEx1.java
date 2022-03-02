// convert arraylist into the stream object

import java.util.*;
import java.util.stream.*;
public class StreamEx1 {

	public static void main(String[] args) {
		//
		List<Integer> ls = new ArrayList<Integer>();
		for(int idx = 1; idx <= 10; idx++) {
			ls.add(idx);
		}
		
		System.out.println("ArrayList Elements : " + ls);
		
		//convert arrayLst into Steam 
		    Stream<Integer> sm = ls.stream();
		    Integer[] arr = sm.filter(i->i%2==0).toArray(Integer[]::new);
		    for(int a : arr) {
		    	System.out.println(a);
		    }
		    
	}

}
