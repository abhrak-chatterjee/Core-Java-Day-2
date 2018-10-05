package com.capgemini.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapImplementation 
{	
	static HashMap<Integer,String> hm=new HashMap<Integer,String>();
	
	public void putElements(Integer key, String value)
	{
		hm.put(key, value);
	}
	
	public void getAllElements()
	{
		for(Map.Entry m:hm.entrySet())
		{  
		   System.out.println(m.getKey()+" "+m.getValue()); 
		}
	}
	
	public Set<Integer> getAllElementsKey()
	{
		return hm.keySet();
	}
	
	public void getAllElementsValues()
	{
		System.out.println("Values are: ");
		for(Integer key : hm.keySet() )
		{
			System.out.println(hm.get(key).toString());
		}
	}
	
	public void deleteAllElements()
	{
		hm.clear();
		System.out.println(hm.size());
	}
	
	public void getSize()
	{
		System.out.println(hm.size());
	}
	
	public HashMap<Integer,String> sortMapByValue()
	{
		List<Map.Entry<Integer,String> > list = new LinkedList<Map.Entry<Integer,String> >(hm.entrySet()); 
        
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer,String> >() 
        { 
            public int compare(Map.Entry<Integer,String> o1,  
                               Map.Entry<Integer,String> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
        HashMap<Integer,String> temp = new LinkedHashMap<Integer,String>(); 
        for (Map.Entry<Integer,String> aa : list) 
        { 
            temp.put(aa.getKey(), aa.getValue()); 
        }
        return temp;
	}
	
	public static void main(String[] args) 
	{
		
		HashMapImplementation hash = new HashMapImplementation();
		
		hash.putElements(100,"Amit");  
		hash.putElements(101,"Vijay");  
		hash.putElements(102,"Rahul");  
		
		hash.getAllElements();
		
		/*System.out.println(hash.getAllElementsKey());
		
		hash.deleteAllElements();
		hash.getAllElements();
		
		hash.putElements(100,"Amit");  
		hash.putElements(101,"Vijay");  
		hash.putElements(102,"Rahul");  
		
		hash.getAllElements();
		
		hash.getSize();
		
		hash.getAllElementsValues();*/
		
		hm = hash.sortMapByValue();
		hash.getAllElements();
	}
}
