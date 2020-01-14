
package com.main;
import java.util.*;



import Array.ArrayList.*;
import Array.ArrayList.Linked.LinkedHashMap.Create_Linked_HashMap;
import Array.ArrayList.Linked.LinkedList.Create_Linked_List;
import Basic.queue.Creation_Queue;
import Basic.stack.Create_stack;
import Hash.HashMap.Create_HashMap;
import Hash.HashMap.User_Hash_Map;
import Hash.HashSet.Create_HashSet;
import Hash.HashSet.User_Hash_Set;
import Tree.TreeMap.Create_TreeMap;
import Tree.TreeSet.Create_Tree_Set;
import Tree.TreeSet.User_Tree_Set;



public class MainApp {
	
	public void ArrayList()
	{
		
	     List <User_Sort_ArrayList> b = new ArrayList<>();
	     b.add(new User_Sort_ArrayList("Ram", 12));
	     b.add(new User_Sort_ArrayList("Shyam", 24));
	     b.add(new User_Sort_ArrayList("Rahul", 26));
	     
	     
	     User_Sort_ArrayList alpha = new User_Sort_ArrayList();
	     alpha.Sort_By_Using_Array_List_Sort();
	     alpha.Sort_By_Using_Array_List_Object_Sort();
	     b.forEach(arrow -> System.out.println("Values for name and Age are as follows "+arrow.getName()+" "+arrow.getAge()));
	     
	     
	     
	     User_Sort_ArrayList c = new User_Sort_ArrayList();
	     c.Sort_By_Array_List_By_Collection();
	    
	    
	    
	    
	     A_Execution a = new A_Execution();
	     a.Adding_to_a_List_General();
	     a.Adding_to_a_List_Particular_Location();
	     a.Create_ArrayList_Using_Another_Collection();
	     a.Access_ArrayList_Using_Func();
		 a.Remove_ArrayList_Ele_Using_Func();
		 a.Iterate_Over_ArrayList_Using_ForEach();
		 a.Iterate_Over_ArrayList_Using_Iterator();
		 a.Iterate_Over_ArrayList_Using_ForEachRemaining();
		 a.Iterate_Over_ArrayList_Using_ListIterator();
		 a.Iterate_Over_ArrayList_Using_ForEachLoop();
		 a.Iterate_Over_ArrayList_Using_ForLoop_WithIndex();
		 a.Search_Element_In_Array_List();	 
		
		
	}

	
	public void LinkedHashMap()
	{
		  Create_Linked_HashMap doer = new Create_Linked_HashMap();
	        doer.Create_Linked_Hash_Map();
	        doer.Access_Entry();
	        doer.Remove_Linked_Hash_Map_Element();
	        doer.iterate_Linked_HashMap();
	        
	}
	
	
	public void LinkedList()
	{
		Create_Linked_List print = new Create_Linked_List();
        print.Create_Link_List();		
		print.Linked_List_Element_Retrieval();
		print.Remove_Linked_List_Element();
		print.Search_Linked_list();
		print.List_Iterate();
	}

	public void Queue()
	{
		Creation_Queue creator = new Creation_Queue();
		creator.Enqueue_Dequeue();
		creator.basic_operation();
		creator.Iterate_Over_Queue();
		
		
	}
	public void Stack()
	{
		
		Create_stack creator = new Create_stack();
		creator.create_stack();
		creator.pop_and_peek();
		creator.do_other_operations();
		creator.Iterate_Over_Stack();
		
		
		
	}
	
	public void Hashmap()
	{
		 
		 Create_HashMap plan = new Create_HashMap();
		 plan.Create_hashMap();
		 plan.Access_hash_Map_Elem();
		 plan.Remove_hash_Map_Elem();
		 plan.Entry_Key_Set_value();
		 plan.Iterate_using_For_Each();
		 plan.Iterate_using_Hash_Set_EntrySet();
		 plan.Iterate_Using_lambda_Eigth();
		 plan.Iterate_using_Hash_Set_EntrySet();
		 
		 User_Hash_Map var = new User_Hash_Map();
		 
		 Map<Integer, User_Hash_Map> placer = new HashMap<>();
		 placer.put(1001, new User_Hash_Map(12,"Ramu","Male"));
		 placer.put(1002, new User_Hash_Map(13,"Ramuju","FeMale"));
		 placer.put(1003, new User_Hash_Map(14,"Ramuna","Male"));
		 placer.put(1004, new User_Hash_Map(15,"Shamu","FeMale"));
		 placer.put(1005, new User_Hash_Map(16,"LAmu","FeMale"));
		 placer.put(1006, new User_Hash_Map(17,"muj;","FeMale"));
		 placer.put(1007, new User_Hash_Map(18,"Ru","Male"));
		 placer.put(1008, new User_Hash_Map(19,"ud","Male"));
		 placer.put(1000, new User_Hash_Map(24,"Raffmu","FeMale"));
		 
		 System.out.println("Value of the List is as follows"+placer);
	     System.out.println("value from class is as follows"+var.getGender()+"  "+var.getId()+" "+var.getName());
		
		 	
	}
	public void HashSet()
	{
		Create_HashSet user = new Create_HashSet();
		user.Hash_Set_Creation();
        user.Create_Hash_Set_by_Another_Collection();
        user.Hash_Set_Simple_Operation();     
        user.Element_removal_hashSet();
        user.Elemet_Iterate_in_HashSet();
        Set<User_Hash_Set> setter = new HashSet<>();
       setter.add(new User_Hash_Set(110,"Rahul"));
       setter.add(new User_Hash_Set(112, "Sachin"));
       User_Hash_Set k = new User_Hash_Set();
       System.out.println("ELements are"+setter+k.getName());
       
	}
	public void TreeMap()
	{
		 Create_TreeMap next = new Create_TreeMap();
	        next.create_Tree_Map();
	        next.create_Tree_Map_Custom_Comparator_Reverse_Order();   
	        next.create_Tree_Map_Custome_Comparator_Case_Insensitive();
	        next.Tree_Map_Access();
		
	}
	public void TreeSet()
	{
		Create_Tree_Set user = new Create_Tree_Set();
		user.create_Tree_Set();
		user.create_custom_comparator();
		user.create_descending_order();
        user.Tree_Set_Operation();
        user.Tree_Remove_Operation();
        
        User_Tree_Set key = new User_Tree_Set();
        SortedSet<User_Tree_Set> addf = new TreeSet<>();
        addf.add(new User_Tree_Set(10101, "Hello"));
        addf.add(new User_Tree_Set(101013, "Hey"));
        addf.add(new User_Tree_Set(1010123, "Helldefo"));
        addf.add(new User_Tree_Set(1010143, "Hellodwcd"));
        addf.add(new User_Tree_Set(1010123, "Helljdwuco"));

        
        System.out.println("Employee Information is as follows"+addf);
        
       // Custom Comparator 
        
        addf = new TreeSet<>(Comparator.comparing(User_Tree_Set :: getName ));
        
        addf.add(new User_Tree_Set(10101, "Hello"));
        addf.add(new User_Tree_Set(101013, "Hey"));
        addf.add(new User_Tree_Set(1010123, "Helldefo"));
        addf.add(new User_Tree_Set(1010143, "Hellodwcd"));
        addf.add(new User_Tree_Set(1010123, "Helljdwuco"));
        
        System.out.println("Employee Sorted on basis of the Supplied Comparator");
        System.out.println(addf);
		
	}
	
	public static void main(String[] args) {
		MainApp m = new MainApp();
		Scanner sc = new Scanner(System.in);
		System.out.println("This is an Menu driven Program");
		System.out.println("Choose Following Options");
		System.out.println("1 For ArrayList");
		System.out.println("2 For LinkedHashMap");
		System.out.println("3 For LinkedList");
		System.out.println("4 For Queue");
		System.out.println("5 For Stack");
		System.out.println("6 For Hashmap");
		System.out.println("7 For HashSet");
		System.out.println("8 For TreeMap");
		System.out.println("9 For TreeSet");
		System.out.println("10 For Exit");
		int choice;
		do {
			System.out.println("Enter your  choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1: m.ArrayList();break;
			case 2: m.LinkedHashMap();break;
			case 3: m.LinkedList();break;
			case 4: m.Queue();break;
			case 5: m.Stack();break;
			case 6: m.Hashmap();break;
			case 7: m.HashSet();break;
			case 8: m.TreeMap();break;
			case 9: m.TreeSet();break;
			case 10: exit();
			default:
				System.out.println("Enter Choice between 1-9");
			}

		}while(choice <=10 && choice !=0);
		
		
 
		
        

        
        
	}


	private static void exit() {
		// TODO Auto-generated method stub
		
	}

}
