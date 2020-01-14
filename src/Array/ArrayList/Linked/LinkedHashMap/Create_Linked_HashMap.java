package Array.ArrayList.Linked.LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Create_Linked_HashMap {

	LinkedHashMap<Integer, String> executer = new LinkedHashMap<>();
	
	
	public void Create_Linked_Hash_Map()
	{
		executer.put(1001, "Funny");
		executer.put(1002, "Exciting");
		executer.put(1003, "Working");
		executer.put(1004, "Not Working");
		executer.put(1005, "Act");
		executer.put(1006, "Stop");
		executer.put(1007, "Fuy");
		
		
		
		executer.putIfAbsent(1009,"Excellent");
		System.out.println("Number in the Linked Hash Map"+executer);

	}
	
	
	public void Access_Entry()
	{
		
    LinkedHashMap<Integer, String> newExecuter = new LinkedHashMap<>();	
     newExecuter.put(101,"Rapid");
     newExecuter.put(102,"Strong");
     newExecuter.put(103,"Smart");
     newExecuter.put(104,"Strong");
     newExecuter.put(105,"Slow");
     newExecuter.put(106,"Instant");
     newExecuter.put(108,"Rapidgo");
     newExecuter.put(101,"Rapidhoen");
    System.out.println("Element inside Linked List"+newExecuter);
    
   // Check for the Key
    
    
    Integer id = 101;
       if(newExecuter.containsKey(id))
       {
    	   System.out.println("Element of key id"+id+"Exists and its value is as follows "+newExecuter.get(id));
    	  
       }
       else {
    	  System.out.println("Elements do not Exist"); 
       }
    
       // Check for value
       String val = "Smart";
       if(newExecuter.containsValue(val))
       {
    	   System.out.println("Element of value"+val+"Exists");
    	   
       }
       else {
    	  System.out.println("Elements do not Exist"); 
       }
    
       // change value associated with existing key
       
       Integer id1 = 104;
       newExecuter.put(id1, "Do It");
       System.out.println("Elements after modification"+newExecuter);

	}
	
	
	// Remove Element from the LinkedHashMap
	
	public void Remove_Linked_Hash_Map_Element()
	{
		
		
		
		executer.put(201, "A");
		executer.put(202, "B");
		executer.put(203, "C");
		executer.put(204, "D");
		executer.put(205, "E");
		executer.put(206, "F");
		executer.put(207, "G");
		
		System.out.println("Elements in the Executer"+executer);
		
		// Remove a key from Linkedhashmap
		String code = executer.remove(201);
		System.out.println("Element Removed "+code+"after removal every Thing"+executer);
		boolean isRemoved = executer.remove(202, "B");
		System.out.println("Elemnet status "+isRemoved);
		
		
		
	}
	
	
	public void iterate_Linked_HashMap()
	{
		
		// using for Each
		
		executer.forEach(
				( Id ,role ) ->{
					System.out.println("Elements id is "+Id+"and the role is as follows"+role);
				});
		
		// java 8 lambda feature
		executer.entrySet().forEach((entry) ->
		{
			System.out.println("Elements are like this "+entry.getKey()+"and the value is as follows"+entry.getValue());
		});
		
		
		// Iterating over entry set using Iterator
		
		Iterator<Map.Entry<Integer, String>> users = executer.entrySet().iterator();
		while(users.hasNext())
		{
			Map.Entry<Integer, String> storer = users.next();
			System.out.println("Entry are"+storer.getKey()+"Value is there "+storer.getValue());

		}
		
		// Iterate using For Each Remaining
		
		
		users = executer.entrySet().iterator();
		users.forEachRemaining((entry)->{
			System.out.println("ELements and keys are as follows"+entry.getKey()+entry.getValue());
		});
				
		
		
		
	}
	
	
	
	
	
	
	
	
}
