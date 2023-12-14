public class Admin extends Person{
	private String AdminID;
	public Admin() {
		
	}
	public Admin(String id) {
		
		//this.id = id;
	}

	public Admin(String name, char type, String AdminID) {
		super(name,type);
		this.AdminID=AdminID;
	}
	public String getId() {
		return AdminID;
	}

	public void setId(String AdminID) {
		this.AdminID = AdminID;
	}
	
	public String toString() {
		return "[name=" + getName()+ ", type=" + getType() + ", ID=" + getId() + "]";
	}
}