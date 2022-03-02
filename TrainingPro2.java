//From the given list of String, convert them into Uppercase and join them with comma.

import java.util.*;
import java.util.stream.*;

public class TrainingPro2 {

	public static void main(String[] args) {
	//1.Create the list of String.
		List<String> strList = new ArrayList<>();
		
		strList.add("Rohan");
		strList.add("Atul");
		strList.add("Amresh");
		strList.add("Sachin");
		strList.add("Ajay");
		strList.add("Anushka");
		strList.add("Ankita");
		
		//Print the list
		 System.out.println(strList);     
		 
		 //2. Convert Collection Object into Stream Object
		 
		 Stream<String> sm = strList.stream();
		 //3.Apply the map method of stream class
		  List<String> res = sm.map(str->str.toUpperCase().concat(",")).collect(Collectors.toList());
		  System.out.println(res);
	}

}
