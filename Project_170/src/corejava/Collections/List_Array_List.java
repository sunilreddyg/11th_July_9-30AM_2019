package corejava.Collections;


import java.util.ArrayList;
import java.util.List;

public class List_Array_List 
{

	public static void main(String[] args) 
	{
		
		List<String> list=new ArrayList<String>();
		list.add("IDE");
		list.add("RC");
		list.add("WD");
		list.add("Appium");
		list.add("Cucumber");
		list.add("Robot");
		list.add("WD");
		
		
		//Get Collection count
		int Obj_count=list.size();
		System.out.println(Obj_count);
		
		
		/*Because list is inorder collection of object, So that
		  We can any object form list using index number*/
		String toolname=list.get(2);
		System.out.println("2nd index value is => "+toolname);
		
		
		//Remove Object from Collection
		list.remove("Robot");
		
		//Verify object contains at collection'
		boolean flag=list.contains("WD");
		System.out.println("Object available status is==> "+flag);
		
		//Get Iterator of object
		String Itr_object=list.iterator().next();
		System.out.println("First iterator of object is => "+Itr_object);
		
		
		//Verify object empty status
		boolean flag1=list.isEmpty();
		System.out.println("Collection status => "+flag1);
		
		//Usng foreach loop read all collection of objects
		for (String each_object : list) 
		{
			System.out.println("=> "+each_object);
		}
		
		
		//using for loop iterate for collection of objects
		for (int i = 0; i < list.size(); i++) 
		{
			 //Using get method retrieve any single object from collection
			 String obj=list.get(i);
			 System.out.println("#=> "+obj);
		}
		
		
		
		//Clear all objects
		list.clear();

	}

}
