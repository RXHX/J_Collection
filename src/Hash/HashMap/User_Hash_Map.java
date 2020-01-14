package Hash.HashMap;

public class User_Hash_Map {


private int id;
private String Name;
private String Gender;	
	@Override
	public String toString() {
		return "User_Hash_Map [id=" + id + ", Name=" + Name + ", Gender=" + Gender + "]";
	}

public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}
	
	
	public void setName(String name) {
		Name = name;
	}
	
	
	public String getGender() {
		return Gender;
	}
	
	
	public void setGender(String gender) {
		Gender = gender;
	}
	
	
public User_Hash_Map(int id, String name, String gender) {
		super();
		this.id = id;
		Name = name;
		Gender = gender;
	}

public User_Hash_Map()
{
	
}




	
	
	
	
	
	
}
