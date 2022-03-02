//Program to sort the list of string 

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TrainingPro5 {public static void main(String[] args) {
	//1.Create the list of string
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
	 
	 // Convert Collection object into Stream object
	 Stream<String> sm = strList.stream();
	 List<String> updList = sm.sorted().map(str-> str.toUpperCase()).collect(Collectors.toList());
	 System.out.println(updList);
}

}
