package Array.ArrayList;
import java.util.*;

public class User_Sort_ArrayList {
   
	  @Override
	public String toString() {
		return "User_Sort_ArrayList [name=" + name + ", age=" + age + "]";
	}

	private String name;
	  private int age;
	  
	  public User_Sort_ArrayList()
	  {
		
	  }
	  public User_Sort_ArrayList(String name,int age)
	  {
		  this.name = name;
		  this.age = age;
	  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	  
	
	  
	public void Sort_By_Array_List_By_Collection()
	{
		List<Integer> num = new ArrayList<>();
		num.add(12);
		num.add(9);
		num.add(16);
		num.add(7);		
		num.add(19);
		num.add(20);
		System.out.println(num);
		System.out.println("Numbers Before Sorting by Collectios"+num);
		Collections.sort(num);
		System.out.println("Numbers After Sorting by Collections"+num);
	}
	
	public void Sort_By_Using_Array_List_Sort()
	{
	    List<String> exma = new ArrayList<>();
	    exma.add("Aad");
	    exma.add("dsr");
	    exma.add("ssfwxz");
	    exma.add("aadcd");
	    exma.add("dde");
	    exma.add("qqww");
	    exma.add("bd");
	    exma.add("dv");
	    exma.add("aa");
	    System.out.println("Names : "+exma);
		
	    // One Way
	    exma.sort(new Comparator<String>() {
			@Override
			public int compare(String n1, String n2) {
			return n1.compareTo(n2)	;

			

			}
		});
		
		// another Way
	    exma.sort((n1,n2) -> n1.compareTo(n2));
		
		// another Way
	    exma.sort(Comparator.naturalOrder());
	    
	    System.out.println("Names Sorted as follows"+exma);
		
		
	}
	
	public void Sort_By_Using_Array_List_Object_Sort()
	{
		List<User_Sort_ArrayList> people = new ArrayList<>();
		
		people.add(new User_Sort_ArrayList("Ram",12));
		people.add(new User_Sort_ArrayList("Shyam",23));
		people.add(new User_Sort_ArrayList("Rahul",34));
		people.add(new User_Sort_ArrayList("Ravan",67));
		
		Collections.sort(people,Comparator.comparing(User_Sort_ArrayList::getName));
		System.out.println("Sorted List by Names"+people);
		
	}
	
	
}
