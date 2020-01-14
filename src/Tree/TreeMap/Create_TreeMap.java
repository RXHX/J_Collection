package Tree.TreeMap;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Comparator;

public class Create_TreeMap {
	
SortedMap<String, String> f_exten = new TreeMap<>();


public void create_Tree_Map()
{
	f_exten.put("phython",".py");
	f_exten.put("c++", ".cpp");
	f_exten.put("kotlin", ".kt");
	f_exten.put("golang",".go");
	f_exten.put("java", ".java");
	
	
    System.out.println("File Extension is as follows"+f_exten);
    

}

public void create_Tree_Map_Custom_Comparator_Reverse_Order()
{
	SortedMap<String, String> applyer = new TreeMap<>(new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o2.compareTo(o1);
		}
		
	});
	
	
	// or
	
	//SortedMap<String, String> applyer = new TreeMap<>(Comparator.reverseOrder());

	
	applyer.put("Ram", "Sharma");
	applyer.put("Anushka", "Rawat");
	applyer.put("Pranjal","Maheshwari");
	applyer.put("Kalpesh", "Roy");
	
	System.out.println("Elements in Decreasing order / reverse Order are as follows"+applyer);
	
}

public void create_Tree_Map_Custome_Comparator_Case_Insensitive()
{
	
	SortedMap<String,String> newer = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
	 
	
	newer.put("Panag","leasr" );
	newer.put("anag","lfffr" );
	newer.put("Kanag","ldfmodfklsr" );
	newer.put("fgfgg","jkdr" );
	newer.put("Gfmv,f","rlmcfd" );
	
	System.out.println("Elements in the Tree Map are as follows"+newer);
	
}


public void Tree_Map_Access()
{
	TreeMap<Integer,String> changer = new TreeMap<>();
	changer.put(1001, "A");
	changer.put(1002, "B");
	changer.put(1003, "C");
	changer.put(1004, "D");
	
	// Find Size of Tree Map
	System.out.println("Tree Map Size "+changer.size());
	
    // Find key status
	Integer id = 1003;
	if(changer.containsKey(id))
	{
		String storer = changer.get(id);
	   System.out.println("Element of Id "+id+" is having value "+storer);	
	}
	else {
		System.out.println("Element does not Exists");
	}
	
	// Find first and last entry
	System.out.println("First Entry "+changer.firstEntry());
	System.out.println("Last Entry "+changer.lastEntry());
	
	// key with entry higher than preceding
	System.out.println("Element above id "+id+" is "+changer.higherKey(id));
	
	// key with entry lower than preceding 
	System.out.println("Element below id "+id+" is "+changer.lowerKey(id));
	
}

public void Tree_Map_Remove()
{
	
TreeMap<String, String> countryISOCode = new TreeMap<>();
countryISOCode.put("India", "IN");
countryISOCode.put("United States Of America", "US");
countryISOCode.put("China", "CN");
countryISOCode.put("Russia", "RU");
countryISOCode.put("United Kingdom", "UK");
countryISOCode.put("japan", "JP");

System.out.println("Country ISO Mapping "+countryISOCode);

// Remove mapping from current

String ISOCode = "IN";
if(countryISOCode.remove(ISOCode) == null)
{
	System.out.println("Element is Removed");
}
else {
	System.out.println("ELement is not Removed");
}

// Remove Mapping for the given key , when mapped to a given value

String CountryName = "India";
boolean isOK = countryISOCode.remove(CountryName, "IA");
if(isOK)
{
	System.out.println("Element Existed and removed");
}
else
{
	System.out.println("Element does not exist which is to be removed");
}

// remove first entry
System.out.println("First Entry"+countryISOCode.pollFirstEntry());

// remove second entry
System.out.println("Last Entry"+countryISOCode.pollLastEntry());





	
	
	
	
}









	
	
	
	
	
	
	
	
	
	
	
}
