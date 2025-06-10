package com;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public class MapOperation {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Maths", 90);
		map.put("Physics", 92);
		map.put("Social", 98);
		map.put("Telugu", 99);
		map.put("telugu", 90);
		map.put("Telugu", 98);
		map.put(null, null);
		map.put(null, 96);                       // if we give multiple null keys - values will be override
		map.put("English", null);                // HashMap can have multiple null values
		map.put("social", null);     
		
	    System.out.println(map);                   //  No order
	    System.out.println(map.get("Telugu"));
	    
	    System.out.println(map.containsKey("NS"));
	    
	    System.out.println(map.containsValue(98));
	    
	    System.out.println(map.remove("telugu"));
	    
	    System.out.println(map.keySet());
	    
	    Set<String> keySet = map.keySet();
	    System.out.println(keySet);
	    
	    System.out.println(map.values());
	    
	    Collection<Integer> values = map.values();
	    System.out.println(values);
	    
	    System.out.println("_____________________________________");
	    
	    for(Map.Entry<String , Integer > entry : map.entrySet()) {
//	    	System.out.println(entry.getKey());
//	    	System.out.println(entry.getClass());
//	    	System.out.println(entry.getValue());
	    	System.out.println(entry.getKey()+ " : "+entry.getValue());
	    }
	    System.out.println("________________________________________");
	     
	    for(String key :map.keySet()){
	    	System.out.println(key + ":"+map.get(key));
	    }
	    
		System.out.println("________________________________________");
		
		TreeMap<String ,Integer> treemap = new TreeMap<>();
		treemap.put("Maths", 90);
		treemap.put("Physics", 92);
		treemap.put("Physics", 98);
		treemap.put("Telugu", null);                   // TreeMap  --> Key (null) - null pointer exception we will get
		treemap.put("Ns", null);                       // multiple null values be taken
		
		System.out.println(treemap);                    // maintain ascending order
		
		System.out.println("________________________________________");
		
		LinkedHashMap<String ,Integer> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.put("Maths", 90);
		linkedHashMap.put("Physics", 92);
		linkedHashMap.put("Physics", 98);
		linkedHashMap.put("Telugu", null);                   
		linkedHashMap.put("Ns", null);                                  
		linkedHashMap.put(null, null);
		linkedHashMap.put(null, 30);                    // LinkedHashMap--> if we give multiple null keys - values will be override
		                                                  // multiple null values be taken 
		System.out.println(linkedHashMap);                // maintain insertion order
		
		Driver d1 = new Driver(1,"ram",34.9);
		Driver d2 = new Driver(2,"vyas", 56.0);
		Driver d3 = new Driver(2,"vyas", 56.0);

		
		HashMap<Integer, Driver> driver = new HashMap<Integer, Driver>();
		driver.put(d1.id ,d1);
		driver.put(d2.id, d2);
		driver.put(d2.id, d3);
		
		for(Map.Entry<Integer, Driver> drivers : driver.entrySet()) {
		System.out.println(drivers);
		}	
	}
}


class Driver{
	int id;
	String name;
	double distanceTravelled;
	
	public Driver() {
		
	}
	public Driver(int id, String name, double distanceTravelled) {
		super();
		this.id = id;
		this.name = name;
		this.distanceTravelled = distanceTravelled;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDistanceTravelled() {
		return distanceTravelled;
	}
	public void setDistanceTravelled(double distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}
	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", distanceTravelled=" + distanceTravelled + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(distanceTravelled, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Driver other = (Driver) obj;
		return Double.doubleToLongBits(distanceTravelled) == Double.doubleToLongBits(other.distanceTravelled)
				&& id == other.id && Objects.equals(name, other.name);
	}
	
	
}
