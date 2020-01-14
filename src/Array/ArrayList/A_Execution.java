package Array.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.ListIterator;

public class A_Execution {
	
	

	List<String> animals = new ArrayList<>();
	List<Integer> first = new ArrayList<>();
	

	
	// Add
	 public void Adding_to_a_List_General()
	  {
	     animals.add("Lion");
	     animals.add("Tiger");
	     animals.add("Dog");
	     animals.add("Cat");
	     animals.add("Elephant");
	     System.out.println("Animals Name are As Follows"+animals);
		  
	  }
	 
	 //Add at Particular 2
	 public void Adding_to_a_List_Particular_Location()
	 {
		 animals.add(2, "Zebra");
		 animals.add(1,"x");
		 animals.add(4,"y");
		  System.out.println("List Iteration after specific input "+animals);		 
	 }
	 
	 // Create Using another Collection
	 public void Create_ArrayList_Using_Another_Collection()
	 {
		 
	    List<Integer> firstfiveprime = new ArrayList<>();
	    firstfiveprime.add(1);
	    firstfiveprime.add(2);
	    firstfiveprime.add(3);
	    firstfiveprime.add(4);
	    firstfiveprime.add(5);
	    
	    
		List<Integer> firsttenprime = new ArrayList<>(firstfiveprime);
		firsttenprime.add(6);
		firsttenprime.add(7);
		firsttenprime.add(8);
		firsttenprime.add(9);
		firsttenprime.add(10);
		firsttenprime.add(11);
		firsttenprime.add(12);
		firsttenprime.add(13);
		firsttenprime.add(14);
		firsttenprime.add(15);
		
		List<Integer> nexttenprime = new ArrayList<>();
		nexttenprime.addAll(firsttenprime);

	    System.out.println("All numbers attached"+nexttenprime);
	   
	 }
	 
	// Access Element in ArrayList
	 
	 
	 public void Access_ArrayList_Using_Func()
	 {
		 // to check if the arrayList is empty or not
		   
		  if(animals.isEmpty())
		  {
			  System.out.println("List is Empty");
		  }
		  else
		  {
			 System.out.println("List is not Empty");
		  }
		 
	    // To find size of the arrayList
		   System.out.println("ArrayList Size is "+animals.size());
		 
		// To get data
		   String a = animals.get(0);
		   String b = animals.get(1);
		   String c = animals.get(4);
		   
		   System.out.println("Data acquired"+a+" "+b+" "+" "+c);
		   
	    // To set data
		     animals.set(3, "Arrange");
		     animals.set(4,"now");
		     animals.set(1, "this");
		  
		     System.out.println("Data after setting"+animals);
		   
	 }
	 
	 // Remove Element from ArrayList
	 
	    public void Remove_ArrayList_Ele_Using_Func()
	    {
	    	animals.remove(5);
	    	System.out.println("After Removal "+animals);
	    	
	    	boolean isRemove = animals.remove("Arrange");
	    	System.out.println("After Removal"+isRemove);
	    	
	    	List<String> general = new ArrayList<>();
	    	general.add("Lion");
	    	general.add("this");
	    	general.add("Dog");
	    	
	    	animals.removeAll(general);
	    	System.out.println("After RemovalAll "+animals);
	    
	    	
	    	// Using Remove If 
	    animals.removeIf(new Predicate<String>() 
	    {
            @Override
	    	public boolean test(String s)
	    	{
	    		return s.startsWith("A");
	    	}
	    	});
	    
	    System.out.println("After removal the animals is as follows"+animals);
	    
	    // to remove all the elements from ArrayList
	    animals.clear();
	    System.out.println("After Clear():"+animals);
	    }
	    	
	    public void Iterate_Over_ArrayList_Using_ForEach()
	    {
	    	
	    	first.add(1);
	    	first.add(2);
	    	first.add(3);
	    	first.add(4);
	    	first.add(5);
	    	first.add(6);
	    	
	    	first.forEach(extract ->{
	    		System.out.println("Value in first String Using For Each "+extract);
	    	});
	    }
	    
	    public void Iterate_Over_ArrayList_Using_Iterator()
	    {
	    	Iterator<Integer> tvShowIterator = first.iterator();
	    
	    	while(tvShowIterator.hasNext())
	    	{
	    		Integer Store = tvShowIterator.next();
	    		System.out.println("Value in First Using Iterator"+Store);
	    	}
	    	  	
	    }
	    	
	    public void Iterate_Over_ArrayList_Using_ForEachRemaining()
	    {
	    	Iterator<Integer> myIterator = first.iterator();
	    	myIterator.forEachRemaining(my -> {
	    		System.out.println("Elements traverse using ForEachRemaining"+my);
	    	});	    	
	    		
	    }
	    public void Iterate_Over_ArrayList_Using_ListIterator()
	    {
	    	ListIterator<Integer> one = first.listIterator(first.size());
	    	while(one.hasPrevious())
	    	{
	    	Integer fun = one.previous();
	    	System.out.println(fun);
	    		
	    	}
	    	   	
	    	
	    }
	 
	    public void Iterate_Over_ArrayList_Using_ForEachLoop()
	    {
	    	for(Integer show : first)
	    	{
	    		System.out.println(first);
	    	}
	    	
	    }
	 
	    public void Iterate_Over_ArrayList_Using_ForLoop_WithIndex()
	    {
	    	for(int i=0;i<first.size();i++)
	    	{
	    		System.out.println(first.get(i));
	    	}
	    	
	    }
	 
	    public void Search_Element_In_Array_List()
	    {
	    	first.add(12);
	    	first.add(13);
	    	first.add(15);
	    	first.add(40);
	    	first.add(20);
	    	first.add(54);
	    	first.add(90);
	    	first.add(12);
	    	
	    	
	    	System.out.println("Find out the Names of Array Element"+first.contains(15));
	    	System.out.println("Finder"+first.indexOf(54));
	    	System.out.println("Not Existing One Index"+first.indexOf(1232));
	    	
	    	System.out.println("Last Time Existed Finder"+first.lastIndexOf(12));
	    	System.out.println("Not Existing One Index"+first.lastIndexOf(3233));
	    	
	   
	    }
	 
	    
	    
	 
	
	
}
