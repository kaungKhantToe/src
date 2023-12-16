public class Faculty extends Person {
	private int facultyID;

	public Faculty() {
		super();
	}

	public Faculty(String name, char type, int facultyID) {
		super(name, type);
		this.facultyID = facultyID;
	}

	public int getId() {
		return facultyID;
	}

	public void setId(int facultyID) {
		this.facultyID = facultyID;
	}

	public String toString() {
		return getName() + "\t" + getType() + "\t" + getId();
	}
}