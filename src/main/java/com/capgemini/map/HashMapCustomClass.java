package com.capgemini.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapCustomClass 
{
	static HashMap<MyInteger,String> hm = new HashMap<MyInteger,String>();
	
	public void putElements(MyInteger key, String value)
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
	
	public Set<MyInteger> getAllElementsKey()
	{
		return hm.keySet();
	}
	
	public void getAllElementsValues()
	{
		System.out.println("Values are: ");
		for(MyInteger key : hm.keySet() )
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
	
	public HashMap<MyInteger,String> sortMapByValue()
	{
		List<Map.Entry<MyInteger,String> > list = new LinkedList<Map.Entry<MyInteger,String>>(hm.entrySet()); 
        
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<MyInteger,String> >() 
        { 
            public int compare(Map.Entry<MyInteger,String> o1,  
                               Map.Entry<MyInteger,String> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
        HashMap<MyInteger,String> temp = new LinkedHashMap<MyInteger,String>(); 
        for (Map.Entry<MyInteger,String> aa : list) 
        { 
            temp.put(aa.getKey(), aa.getValue()); 
        }
        return temp;
	}
	
	public HashMap<MyInteger,String> sortMapByKey()
	{
		List<Map.Entry<MyInteger,String> > list = new LinkedList<Map.Entry<MyInteger,String>>(hm.entrySet()); 
        
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<MyInteger,String> >() 
        { 
            public int compare(Map.Entry<MyInteger,String> o1,  
                               Map.Entry<MyInteger,String> o2) 
            { 
                return (o1.getKey().getNumber()) - (o2.getKey().getNumber()); 
            } 
        }); 
        HashMap<MyInteger,String> temp = new LinkedHashMap<MyInteger,String>(); 
        for (Map.Entry<MyInteger,String> aa : list) 
        { 
            temp.put(aa.getKey(), aa.getValue()); 
        }
        return temp;
	}
	
	public static void main(String[] args) 
	{
		
		HashMapCustomClass hash = new HashMapCustomClass();
		
		hash.putElements(new MyInteger(100),"Amit");  
		hash.putElements(new MyInteger(101),"Vijay");  
		hash.putElements(new MyInteger(102),"Rahul");  
		
		hash.getAllElements();
		
		/*System.out.println(hash.getAllElementsKey());
		
		hash.deleteAllElements();
		hash.getAllElements();
		
		hash.putElements(100,"Amit");  
		hash.putElements(101,"Vijay");  
		hash.putElements(102,"Rahul");  
		
		hash.getAllElements();
		
		hash.getSize();
		
		hash.getAllElementsValues();
		
		hm = hash.sortMapByValue();
		hash.getAllElements();*/
		
		hm = hash.sortMapByKey();
		hash.getAllElements();
	}
}
