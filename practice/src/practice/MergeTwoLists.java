package practice;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoLists {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<String>();
		list1.add("Vivek");
		list1.add("Pranav");
		list1.add("Aniket");
		
		List<String> list2=new ArrayList<String>();
		list2.add("Vedant");
		list2.add("Avaneesh");
		
		List<String> merged=new ArrayList<String>();
		merged.addAll(list1);
		merged.addAll(list2);
		
		System.out.println("List1: "+list1);
		System.out.println("List2: " +list2);
		System.out.println("Merged List: "+merged);
		 

	}

}
