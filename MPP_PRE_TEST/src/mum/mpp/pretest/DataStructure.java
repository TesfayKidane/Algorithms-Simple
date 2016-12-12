package mum.mpp.pretest;


import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class DataStructure {

	public static void main(String[] args)
	{	
		List<String> l = new ArrayList<String>();
		l.add("Tesfay");
		l.add("Sirak");
		l.add("Esayas");
		
		Iterator<String> i = l.iterator();
		
		while(i.hasNext())
		{
			String name = i.next();
		    System.out.println(name);
		};
		
		for(String str : l)
		{
			System.out.println("--" + str);
		}
	}
}
