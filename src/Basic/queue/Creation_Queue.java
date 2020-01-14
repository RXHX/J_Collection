package Basic.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Creation_Queue {

Queue<String> waiter = new LinkedList<>();

public void Enqueue_Dequeue()
{
	waiter.add("A");
	waiter.add("B");
	waiter.add("C");
	waiter.add("D");
	waiter.add("E");
	waiter.add("F");
	waiter.add("G");
	waiter.add("H");

    System.out.println("Element are as follows"+waiter);
    
	// Use remove method
    String clear_it = waiter.remove();
    System.out.println("Element removed"+clear_it+" from queue  "+waiter);
	
    // Use Poll method to remove 
    clear_it = waiter.poll();
    System.out.println("Element removed"+clear_it+" from queue  "+waiter);
    
}

public void basic_operation()
{
	// check if empty
	System.out.println("Queue empty "+waiter.isEmpty());
	
	// find Size of Queue
	System.out.println("Find queue size "+waiter.size());
	
	// Check if queue Contains the Element
	String name = "D";
	if(waiter.contains(name))
	{
		System.out.println("Element is conatined");
	}
	else
	{
		System.out.println("Element is not Contained");
	}
	
	// Get Element at Front Without Removing it
	String F_Person_In_Wait_Queue = waiter.element();
	System.out.println("Element Which is First in Waiting Queue"+F_Person_In_Wait_Queue);
	
	// Get Element at Front Without Removing it using Peek
	F_Person_In_Wait_Queue = waiter.peek();
	System.out.println("Element Which is First in Waiting Queue"+F_Person_In_Wait_Queue);
	
}

public void Iterate_Over_Queue()
{
	// Using for Each Java 8
	waiter.forEach(next -> {System.out.println("The Elements in Queue are"+next);});
	
	//Using Iterator
	Iterator<String> flow = waiter.iterator();
	while(flow.hasNext())
	{
		String store = flow.next();
		System.out.println("Element inside store is"+store);
	}
	
	// Using ForEachRemaining
	flow.forEachRemaining((nexter)->{System.out.println("The Elements are "+nexter);});
	
	// Using For Each loop
	for(String print :waiter)
	{
		System.out.println("Element is as follows"+print);
	}

}



}
