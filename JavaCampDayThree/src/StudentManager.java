
public class StudentManager extends UserManager {
	@Override
	public void courseAdd(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" öğrenci olarak eklendi ");
	}

}
