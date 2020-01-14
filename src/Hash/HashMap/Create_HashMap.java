package Hash.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Create_HashMap {

	// Globally Declared map
	Map<String,Integer> mapper = new HashMap<>();
	Map<String,String> reach = new HashMap<>();
	Map<String,Double> employeeSal = new HashMap<>();
	

	public void Create_hashMap()
	{
	     
		// To add element in Hash Map 
		
		mapper.put("A",1);
		mapper.put("B",2);
		mapper.put("C",121);
		mapper.put("D",23);
		mapper.put("E",13);
		mapper.put("F",25);
		mapper.put("G",152);
		mapper.put("H",232);
		
		
		// Add Element if Not Present
		
		mapper.putIfAbsent("D",2);
		System.out.println("Element inside the Hashmap are "+mapper);		
	}
	
	public void Access_hash_Map_Elem()
	{
		
		// Check the Map 
		if(mapper.isEmpty())
		{
			System.out.println(" Empty");
		}
		else
		{
		   System.out.println("Is Not Empty");
		}
		
		// Put data on the map
		
		
		mapper.put("ram",10);
		mapper.put("Shyam,", 18);
		mapper.put("Raja",109);
		mapper.put("Chandu",120);
		
		String namer = "ram";
		
		//  checking with key	
		if(mapper.containsKey(namer))
		{
			System.out.println("Contains name "+mapper.get(namer));
		}
		else {
			System.out.println("Doesn't Contain Name ");
		}
			
		// Checking with value
		
		if(mapper.containsValue(10))
		{
			
			System.out.println("Contains value");
		}
		else {
			System.out.println("Does not Contains value");
		}
		
		// modify the value
		
		
		mapper.put(namer, 109);
		System.out.println("Value of the mapper is as follows"+mapper);
		
		
	}
	
	
	public void Remove_hash_Map_Elem()
	{
        //first add element
		
		reach.put("One","1");
		reach.put("Two","2");
		reach.put("Three",null);
		reach.put("Four","4");
		reach.put("Five", "5");
		
	   System.out.println("Elements there in Reach");
       String huss = "One";
       reach.remove(huss);
       
       boolean istrue = reach.remove("Two","2");
       System.out.println("Value of a boolean expression is"+istrue);
       		
		if(reach.remove("Three") == null)
		{
			System.out.println("Value is null true");
		}
		else {
			System.out.println("Valus is null is not true");
		}
		
		
		
	}
	public void Entry_Key_Set_value()
	{
		
		mapper.put("Alpha", 01);
		mapper.put("Beta", 011);
		mapper.put("Gamma", 0111);
		mapper.put("Ray",01111);
		mapper.put("Ash", 01111);
		
		// use of entry set in HashMap
		Set<Map.Entry<String, Integer>> useme = mapper.entrySet();
		System.out.println("Data entered in using Entry"+useme);
		
	   // use of key value
		Set<String> Str = mapper.keySet();
		System.out.println("Key in the hashmap are as follows"+Str);
		
		
		// use of HashMap's Value
		Collection<Integer> vl = mapper.values();
		System.out.println("Values are as follows"+vl);
		

		
	}
	public void Iterate_using_For_Each()
	{
	   employeeSal.put("First", 1.0);
	   employeeSal.put("Second", 2.0);
	   employeeSal.put("Third", 3.0);
	   employeeSal.put("Fourth", 4.0);
	   employeeSal.put("Fifth", 5.0);
	   employeeSal.put("Sixth", 6.0);
	   employeeSal.put("Seventh", 7.0);
	   employeeSal.put("Eigth", 8.0);
	   employeeSal.put("Nineth", 9.0);
	   employeeSal.put("Tenth", 10.0);
    
	   
	   employeeSal.forEach((empl,sala)-> System.out.println("Persons name is"+empl+"and class is "+sala));
	 
		
	}
	public void Iterate_using_Hash_Set_EntrySet()
	{
		Set<Map.Entry<String, Double>> react = employeeSal.entrySet();
		Iterator<Map.Entry<String,Double>> todo = react.iterator();
		while(todo.hasNext())
		{
		Map.Entry<String,Double> q = todo.next();
		System.out.println("Key is "+q.getKey());
		System.out.println("Value is"+q.getValue());	
		}
	}
	
   public void Iterate_Using_lambda_Eigth()
   {
	   
	   
	   employeeSal.entrySet().forEach((emple) ->{
		   System.out.println(emple.getKey() +"  "+emple.getValue() );
	   });
	   
   }
	public void Iterate_Over_key_Set()
	{
		
		employeeSal.keySet().forEach((akw) ->{
System.out.println("Value of elements as follows"+akw+"   "+employeeSal.get(akw));
		});
		
		
		
	}
	
	
}
