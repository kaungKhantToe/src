public class Student extends Person{
	private long StudentID;
	public Student() {
		
	}
	
	public Student(long StudentID) {
		super();
	}

	public Student(String name, char type, long StudentID) {
		super(name,type);
		this.StudentID = StudentID;
	}

	public long getId() {
		return StudentID;
	}

	public void setId(long StudentID) {
		this.StudentID = StudentID;
	}
	
	public String toString() {
		return "[name=" + getName()+ ", type=" + getType() + ", ID=" + getId() + "]";
	}
	
}