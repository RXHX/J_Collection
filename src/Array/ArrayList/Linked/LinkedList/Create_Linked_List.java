package Array.ArrayList.Linked.LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Create_Linked_List {

	LinkedList<String> user = new LinkedList<>();
	
	public void Create_Link_List()
	{
		// Add Element to the List
		
		user.add("One");
		user.add("Two");
		user.add("Three");
		user.add("Four");
		user.add("Five");
		
		// Print the Link List
		System.out.println("Print Elements in Link List"+user);
		
		// Add an Element at Specified location
		user.add(3,"Seventeenth");
		System.out.println("After adding Elements we have"+user);
		
		// Add Element at Beginning and Last
		user.addFirst("Zero");
		System.out.println("After adding Element at first we have"+user);
		user.addLast("Tenth");
		System.out.println("After adding at Last"+user);
		
		// Adding element of array List to Linked List
		List<String> adder = new ArrayList<>();
		adder.add("First");
		adder.add("Second");
		adder.add("Third");
	    user.addAll(adder);
	    System.out.println("Elements after adding all"+user);

	}
	
	public void Linked_List_Element_Retrieval()
	{
	      // Using Global Linked List
		
		String getFirst = user.getFirst();
		String getLast = user.getLast();
		String getAny = user.get(3);
		System.out.println("Element at First Position"+getFirst);
		System.out.println("Element at Last Position"+getLast);
		System.out.println("Element at Any Position"+getAny);
	}

	 public void Remove_Linked_List_Element()
	 {
		 // New Linked List Created
		  LinkedList<String> Program_Lang = new LinkedList<>();
		  Program_Lang.add("C++");
		  Program_Lang.add("C#");
		  Program_Lang.add("Swift");
		  Program_Lang.add("React");
		  Program_Lang.add("Angular");
		  Program_Lang.add("Golang");
		  
		  System.out.println("Element List "+Program_Lang);
		  
		  // Remove First Element
		  Program_Lang.removeFirst();
		  System.out.println("List Afetr Element Removed in Link List"+Program_Lang);
		  
		  // Remove Last Element
		  Program_Lang.removeLast();
		  System.out.println("List After Element Removed in Link List"+Program_Lang);
		  
		  // Remove Occurence of Specified Element
		  boolean isRemove = Program_Lang.remove("C#");
		  if(isRemove)
		  {
		System.out.println("Elements removed "+Program_Lang);	  
		  }
		  
		  // Remove Remove all Element Satisfying the Given Predicate
		   Program_Lang.removeIf(next -> next.startsWith("C"));
		   System.out.println("Removed Element are"+Program_Lang);

		 // Clear Linked List
		   Program_Lang.clear();
		 System.out.println("List is Cleared"+Program_Lang);
		 
	 }
	 public void Search_Linked_list()
	 {
		 
		 // Check if Link List Contain an Element
		    boolean isTrue = user.contains("One");
		 System.out.println("Element contained carry's element"+isTrue);
		 
		 
		 // Find index of
		 
		 System.out.println("ELement Index of Two"+user.indexOf("Two"));
        System.out.println("Element Index of Three"+"Three");
		 
		 
		 
		 
		 // Find index of Last Occurrence
		 System.out.println("occurence of Last ELement of Four"+user.lastIndexOf("Four"));
		 System.out.println("occurence of Last ELement of Five"+user.lastIndexOf("Five"));
		 
		 
		 
	 }
	 
	 public void List_Iterate()
	 {
		 
		 
		 // Using For Each
		 user.forEach(next -> System.out.println("Element are"+next));
		 
		 // Using Iterator
		 Iterator<String> iterate = user.iterator();
		 while(iterate.hasNext())
		 {
			 String did = iterate.next();
			 System.out.println("Element here are as follows"+did);
		 }
		 
		 // Using ForEachRemaining
        iterate = user.iterator();
        iterate.forEachRemaining(print -> {System.out.println("Element to be printed"+print);});
        
        // Iterate Over Linked List Using Descending Iterator
         
        Iterator<String> descend_Iterator = user.descendingIterator();
        while(descend_Iterator.hasNext())
        {
        	String storer = descend_Iterator.next();
        	System.out.println("Element to be there"+storer);
        }
        
        // Iterate using List Iterator
        ListIterator<String> cursor = user.listIterator(user.size());
        while(cursor.hasPrevious())
         {
           String pursue = cursor.previous();
           System.out.println("Element To be pursued are "+pursue);
        }
        
        // Iterate over For-Each Using Link List
        for(String k : user)
        {
        	System.out.println("Element is as follows"+k);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		 
		 
		 
		 
		 
	 }
	 
	 
	 
	

}
