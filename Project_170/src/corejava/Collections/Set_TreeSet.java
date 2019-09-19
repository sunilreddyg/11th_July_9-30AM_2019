package corejava.Collections;

import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet {

	public static void main(String[] args)
	{
		Set<String> set=new TreeSet<String>();
		set.add("IDE");
		set.add("RC");
		set.add("WD");
		set.add("Appium");
		set.add("Cucumber");
		set.add("Robot");
		set.add("WD");
		
		
		//Get Collection count
		int Obj_count=set.size();
		System.out.println(Obj_count);
		
		//Remove Object from Collection
		set.remove("Robot");
		
		//Verify object contains at collection'
		boolean flag=set.contains("WD");
		System.out.println("Object available status is==> "+flag);
		
		//Get Iterator of object
		String Itr_object=set.iterator().next();
		System.out.println("First iterator of object is => "+Itr_object);
		
		
		//Verify object empty status
		boolean flag1=set.isEmpty();
		System.out.println("Collection status => "+flag1);
		
		//Usng foreach loop read all collection of objects
		for (String each_object : set) 
		{
			System.out.println("=> "+each_object);
		}
		
		
		
		//Clear all objects
		set.clear();

	}

}
