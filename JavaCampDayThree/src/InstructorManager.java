
public class InstructorManager extends UserManager {
	@Override
	public void courseAdd(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" e�itmen olarak eklendi ");
	}
}
