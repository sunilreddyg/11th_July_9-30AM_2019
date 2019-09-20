package corejava.Collections;

import java.util.Hashtable;
import java.util.Set;

public class HasMap_Interface {

	public static void main(String[] args) 
	{
		
		/*
		 *  Hash accept objects to store using key and value
		 *  It only accept pair values to store..
		 *  	=> Hashset is a sorted list of set.
		 */
		
		Hashtable<Integer, String> hash=new Hashtable<Integer,String>();
		hash.put(1, "Arjun");
		hash.put(2, "Raju");
		hash.put(3, "shyam");
		hash.put(4, "sanjay");
		
		
		
		//Using keyname get keyvalue
		String kvalue=hash.get(2);
		System.out.println("keyvalue is => "+kvalue);
		
		
		//Get All keyset names
		Set<Integer> set=hash.keySet();
		//Iterate for number of objects
		for (Integer eachkey : set) 
		{
			String value=hash.get(eachkey);
			System.out.println("=> "+value);
		}
		
		

	}

}
