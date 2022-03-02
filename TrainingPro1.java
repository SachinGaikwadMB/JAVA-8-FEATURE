//From the the given list of string, count the number of string that start with a

import java.util.*;
import java.util.stream.*;
public class TrainingPro1 {

	public static void main(String[] args) {
		//1. Create a list of string
		List<String> strList = new ArrayList<String>();
		strList.add("Rohan");
		strList.add("Atul");
		strList.add("Amresh");
		strList.add("Sachin");
		strList.add("Ajay");
		strList.add("Anushka");
		strList.add("Ankita");
		
		System.out.println(strList);
		
		//2.Converting List object into Steam objects
		Stream<String> sm = strList.stream();
		
		//3. apply the filter method of stream class
		long total = sm.filter(str ->str.startsWith("A")).count();
		System.out.println("Total String in list strat with a : " + total);
	}

}
