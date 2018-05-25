package com.cts.testprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
public void displayListUsingEnhancefor(List list)
{
	for(Object obj:list)
	{System.out.println(obj);
	}
	}

	public void displayListUsingIterator(List list)
	{
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			
			System.out.println(it.next());
		}
		
	}
	
	public boolean getposition(List<String> list,String name)
	{
		for(String l:list)
		{
			if(l.equals(name))
				
				return true;
		}
		return false;
	}
	
	public boolean getposition1(List<Integer> list,int p)
	{
		for(Integer position:list )
		{
			if(position.equals(p))
				return true;
			
		}
		return false;
		
	}
	public int getnumberbyPosition(List<String> list,int get)
	{
		int i=0;
		for(String position:list)
		{
			i++;
			if(position.equals(get))
				return i;
			
		}
		return i;
		
	}
		
	
	
	public static void main(String[] args) {
		ArrayListTest integerList=new ArrayListTest();
		ArrayList<String> obj=new ArrayList<String>();
		ArrayList<Integer> obj1=new ArrayList<Integer>();
		obj.add("sara");
		obj.add("dinesh");
		obj.add("kumar");
		obj.add("revathi");
		obj.add("balaji");
		obj.add("praveen");
		obj.add("jingu");
		obj.add("mingu");
		obj1.add(8);
		obj1.add(10);
		obj1.add(199);
		obj1.add(46);
		
		
		
		
		Collections.sort(obj);
		integerList.displayListUsingEnhancefor(obj);
		//integerList.displayListUsingIterator(obj);
	
		
		System.out.println(integerList.getposition(obj, "sara"));
		System.out.println(integerList.getposition1(obj1, 3));
		System.out.println(integerList.getnumberbyPosition(obj, 2));
		
		
	}
	
}
