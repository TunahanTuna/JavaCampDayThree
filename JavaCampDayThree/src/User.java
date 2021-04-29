
public class User {
	private int ID;
	private String firstName;
	private String lastName;
	private String address;
	private String mail;
	
	public User() {
		super();
	}

	public User(int iD, String firstName, String lastName, String address, String mail) {
		super();
		ID = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mail = mail;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
