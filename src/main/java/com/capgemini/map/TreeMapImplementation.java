package com.capgemini.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TreeMapImplementation 
{
static TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
	
	public void putElements(Integer key, String value)
	{
		tm.put(key, value);
	}
	
	public void getAllElements()
	{
		for(Map.Entry m:tm.entrySet())
		{  
		   System.out.println(m.getKey()+" "+m.getValue()); 
		}
	}
	
	public Set<Integer> getAllElementsKey()
	{
		return tm.keySet();
	}
	
	public void getAllElementsValues()
	{
		System.out.println("Values are: ");
		for(Integer key : tm.keySet() )
		{
			System.out.println(tm.get(key).toString());
		}
	}
	
	public void deleteAllElements()
	{
		tm.clear();
		System.out.println(tm.size());
	}
	
	public void getSize()
	{
		System.out.println(tm.size());
	}
	
	public TreeMap<Integer,String> sortMapByValue()
	{
		List<Map.Entry<Integer,String> > list = new LinkedList<Map.Entry<Integer,String> >(tm.entrySet()); 
        
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer,String> >() 
        { 
            public int compare(Map.Entry<Integer,String> o1,  
                               Map.Entry<Integer,String> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
        TreeMap<Integer,String> temp = new TreeMap<Integer,String>(); 
        for (Map.Entry<Integer,String> aa : list) 
        { 
            temp.put(aa.getKey(), aa.getValue()); 
        }
        return temp;
	}
	
	public static void main(String[] args) 
	{
		
		TreeMapImplementation tree = new TreeMapImplementation();
		
		tree.putElements(100,"Amit");  
		tree.putElements(101,"Vijay");  
		tree.putElements(102,"Rahul");  
		
		tree.getAllElements();
		
		/*System.out.println(tree.getAllElementsKey());
		
		tree.deleteAllElements();
		tree.getAllElements();
		
		tree.putElements(100,"Amit");  
		tree.putElements(101,"Vijay");  
		tree.putElements(102,"Rahul");  
		
		tree.getAllElements();
		
		tree.getSize();
		
		tree.getAllElementsValues();*/
		
		tm = tree.sortMapByValue();
		tree.getAllElements();
	}
}
