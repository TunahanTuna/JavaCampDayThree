
public class Instructor extends User{
	private Course[] courseGiven;
	private double salary;
	
	public Instructor() {
		super();
	}

	public Instructor(int ID, String firstName, String lastName, String address, String mail, Course[] courseGiven, double salary) {
		super();
		this.setID(ID);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAddress(address);
		this.setMail(mail);
		this.courseGiven = courseGiven;
		this.salary = salary;
	}

	public Course[] getCourseGiven() {
		return courseGiven;
	}

	public void setCourseGiven(Course[] courseGiven) {
		this.courseGiven = courseGiven;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
