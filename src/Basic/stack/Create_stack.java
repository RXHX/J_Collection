package Basic.stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Create_stack {

	// Global Stack
	Stack<String> stockofcards = new Stack<>();
	
	public void create_stack()
	{
		// push
	stockofcards.push("Jack");
	stockofcards.push("King");
	stockofcards.push("Queen");
	stockofcards.push("Ace");
	
	System.out.println("Element are "+stockofcards);	
		
	}
	
	public void pop_and_peek()
	{
		// Pop
		String poper = stockofcards.pop();
		System.out.println("cards left"+stockofcards);
		
		// Get the top Element of stack without Removing it
		String peeker = stockofcards.peek();
		System.out.println("top element is as follows"+peeker);

	}
	
	public void do_other_operations()
	{
		// check stack status
		System.out.println("Check stack is empty ");
		
		// check stack size
      System.out.println("Size of the Stack is"+stockofcards.size());
      
      // find position
      int pos = stockofcards.search("Queen");
      if(pos != -1)
      {
    	System.out.println("Element Found at "+pos);  
      }
      else
      {
		 System.out.println("Element not found");
      }
		
	}
	
	public void Iterate_Over_Stack()
	{
		// For Each 
		stockofcards.forEach(next -> System.out.println("Element is"+next));
		
		// Using iterator
		Iterator<String> itera = stockofcards.iterator();
		while(itera.hasNext())
		{
			String use = itera.next();
			System.out.println("Element present is as follows"+use);
		}
		
		// using For Each Remaining
		itera.forEachRemaining(ready -> {System.out.println("Element is"+ready);});
       
		// Using List Iterator
		ListIterator<String> power = stockofcards.listIterator(stockofcards.size());
		while(power.hasPrevious())
		{
			String we = power.previous();
			System.out.println("Element from Previous"+we);
		}
		
		
	}
	
	
	
	
	
}
