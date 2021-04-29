
public class Student extends User {
	private Course[] courseTaken;
	
	public Student() {
		super();
	}
	
	public Student(int ID, String firstName, String lastName, String address, String mail, Course[] courseTaken) {
		super();
		this.setID(ID);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAddress(address);
		this.setMail(mail);
		this.courseTaken = courseTaken;
	}

	public Course[] getCourseTaken() {
		return courseTaken;
	}

	public void setCourseTaken(Course[] courseTaken) {
		this.courseTaken = courseTaken;
	}

	
	
}
