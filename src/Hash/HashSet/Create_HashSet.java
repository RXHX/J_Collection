package Hash.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Create_HashSet {

	Set<String> day_of_week = new HashSet<>();
	
	public void Hash_Set_Creation()
	{
		
	day_of_week.add("MONDAY");
	day_of_week.add("TUESDAY");
	day_of_week.add("WEDNESDAY");
	day_of_week.add("THURSDAY");
	day_of_week.add("FRIDAY");
	day_of_week.add("SATURDAY");
	day_of_week.add("SUNDAY");
	
		System.out.println("Elements added to the Sets"+day_of_week);
		

	 }
	
	
	
    public void Create_Hash_Set_by_Another_Collection()
    {
    	// First Array List
    	List<Integer> num_div_by_3 = new ArrayList<>();
    	num_div_by_3.add(3);
    	num_div_by_3.add(6);
    	num_div_by_3.add(9);
    	num_div_by_3.add(12);
    	num_div_by_3.add(15);
    	num_div_by_3.add(18);
    	num_div_by_3.add(21);
    	num_div_by_3.add(24);
    	num_div_by_3.add(27);
    	num_div_by_3.add(30);
    	
    	
    	// Second Array List
    	List<Integer> num_div_by_5 = new ArrayList<>();
    	num_div_by_5.add(5);
    	num_div_by_5.add(10);
    	num_div_by_5.add(15);
    	num_div_by_5.add(20);
    	num_div_by_5.add(25);
    	num_div_by_5.add(30);    	
    	num_div_by_5.add(35);
    	num_div_by_5.add(40);
    	num_div_by_5.add(45);
    	num_div_by_5.add(50);
    	
    	Set<Integer> Num_Div_by_All = new HashSet<>(num_div_by_3);
    	Num_Div_by_All.addAll(num_div_by_5);
    	System.out.println("Set Containing both 3 and 5 Divisible Number"+Num_Div_by_All);
  
    }
	
	public void Hash_Set_Simple_Operation()
	{
		// A new Set check whether it contains element or not
		
		Set<String> newer = new HashSet<>();
		System.out.println(newer.isEmpty());
		
		// Add Elements to Set
		newer.add("A");
		newer.add("B");
		newer.add("C");
		newer.add("D");
		newer.add("E");
		newer.add("F");
		
		// Check Set Size
		System.out.println("Set Size is as follows"+newer.size());
		
		// Check Whether it contain an Element or not
		String checker = "A";
		if(newer.contains(checker))
		{
			System.out.println("Element Exist in Set Which is"+checker);
	
		}
		else {
			System.out.println("Element which is "+checker+"does not contain in Set");
		}
		

	}
	
	public void Element_removal_hashSet()
	{
		Set<Integer> remover = new HashSet<>();
		remover.add(1);
		remover.add(2);
		remover.add(3);
		remover.add(4);
		remover.add(5);
		remover.add(6);
		
		// Simple Removal
		boolean isRemoved = remover.remove(1);
		
	    System.out.println("To check if removed a element  "+isRemoved);
	    System.out.println("Elements Are removal "+remover);
	    
	    // Remove all element present in another Collection
	    
	    List<Integer> l = new ArrayList<>();
	    l.add(2);
	    l.add(4);
	    l.add(6);
	    remover.removeAll(l);
	    System.out.println("Elements After Removal Are as Follows"+remover);
	    
	    
	    // remove Element matching predicate
	    remover.removeIf(num -> num % 2 == 0);
	    remover.clear();
	    System.out.println("After all cleared"+remover);

	}
	
	public void Elemet_Iterate_in_HashSet()
	{
		// Iterate using Java 8 Lambda Feature
		day_of_week.forEach(incrementor -> {
			System.out.println("Operator is incremented"+incrementor);
		});
		
		// Iterate using Iterator 
		
		Iterator<String> starter = day_of_week.iterator();
		while(starter.hasNext())
		{
			String Storer = starter.next();
			System.out.println(" Element is  "+Storer);
		}
		
		// Iterate Using Iterator and java 8 Lambda feature
            
		
		Iterator<String> quest = day_of_week.iterator();
		quest.forEachRemaining(solve -> {
			System.out.println("Elements to be printed  "+solve);
		});
		
		// Iterate using For Loop
          
		for(String temp : day_of_week)
		{
			System.out.println("Elements are "+temp);
		}
		
		
		
		
		
	}
	
	
	
	  
}
