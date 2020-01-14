package Tree.TreeSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Create_Tree_Set {

	SortedSet<String> starter = new TreeSet<>();

	
	public void create_Tree_Set()
	{
		starter.add("Apple");
		starter.add("Banana");
		starter.add("Orange");
		starter.add("Kiwi");
		
		System.out.println("Elements added "+starter);
		
		// Will not take duplicate
		starter.add("Apple");
		
		//will consider this as different as b is small
		starter.add("apple");

		System.out.println("Elements Which are to be put here"+starter);

	}
	
	
	
	public void create_custom_comparator()
	{
	    // By this statement lower case string will not be considered differeny
		SortedSet<String> fruits = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		fruits.add("Ram");
		fruits.add("ram");
		fruits.add("Shyam");
		fruits.add("Rama");
		fruits.add("Ramu");
		fruits.add("Raman");
		fruits.add("ramu");
		
		
		System.out.println("Elements in the list are as follows"+fruits);
		
		
	}
	
	public void create_descending_order()
	{
		
		SortedSet Newbie = new TreeSet<>(Comparator.reverseOrder());
		
		Newbie.add("Simple");
		Newbie.add("Sample");
		Newbie.add("Secure");
		Newbie.add("Encouraging");
		Newbie.add("Excellent");
		
		System.out.println("Fruits Set"+Newbie);
		
	}
	
	public void Tree_Set_Operation()
	{
		
		TreeSet<String> fun = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		fun.add("A");
		fun.add("B");
		fun.add("C");
		fun.add("D");
		fun.add("E");
		fun.add("F");
		fun.add("G");
		fun.add("H");
		
		
		// Finding Size
		System.out.println("Tree Set Size"+fun.size());
		
		// Checking Element Existence
		String checker = "A";
		if(checker.contains(checker))
		{
		System.out.println("The result is"+checker);	
		}
		else
		{
			System.out.println("The result is"+checker);
		}
		
		// Do Navigation 
		System.out.println("First Element "+fun.first());
		System.out.println("Second Element "+fun.last());
		
		String named = "B";
		System.out.println("Element above named"+fun.higher(named));
		System.out.println("Element above named"+fun.lower(named));

	}
	
	
	public void Tree_Remove_Operation()
	{
		TreeSet<Integer> number = new TreeSet<>();
		number.add(10);
		number.add(15);
		number.add(20);
		number.add(25);
		number.add(30);
		number.add(42);
		number.add(49);
		number.add(50);
		
		System.out.println("Numbered TreeSet"+number);
		
		boolean isRemoved = number.remove(49);
		if(isRemoved)
		{
			System.out.println("TRue");
		}
		
		// remove all Element divisible by 3
		
		number.removeIf(value -> value % 3 == 0);
		
		// remove and retrieve first Element
		Integer num = number.pollFirst();
		System.out.println("Removed Element "+num+"from the treeSet"+number);
		
		// remove and retrieve last Element 
		Integer ok = number.pollLast();
		System.out.println("Element Removed "+ok+"from the TreeSet"+number);
		
		
	}
	
	
}
