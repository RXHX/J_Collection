package Tree.TreeSet;

public class User_Tree_Set implements Comparable<User_Tree_Set> {

	

	@Override
	public String toString() {
		return "User_Tree_Set [id=" + id + ", name=" + name + "]";
	}






	public User_Tree_Set(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}






	public User_Tree_Set() {
		super();
	}
	private int id;
	private String name;
	


	
	
	
	
	
	public int compareTo(String anotherString) {
		return name.compareTo(anotherString);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User_Tree_Set other = (User_Tree_Set) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}






	@Override
	public int compareTo(User_Tree_Set o) {
		// TODO Auto-generated method stub
		return this.getId() - o.getId();
	}

	
	
	
	
}
