
public class Main {

	public static void main(String[] args) {
		
		Instructor engin = new Instructor();
		engin.setID(1);
		engin.setFirstName("Engin");
		engin.setLastName("Demiro�");
		engin.setAddress("Ankara");
		engin.setMail("engindemirog@gmail.com");
		Course[] instructorCourses = new Course[3]; // Buras� sonradan doldurulabilir taslak olarak yap�y� belirtmek i�in kullan�ld�
		engin.setCourseGiven(instructorCourses);
		engin.setSalary(100000000);
		
		Student tuna = new Student();
		tuna.setID(2);
		tuna.setFirstName("Tunahan");
		tuna.setLastName("Tuna");
		tuna.setAddress("Konya");
		tuna.setMail("tuna@gmail.com");
		Course[] studentCourses = new Course[2]; // Buras� da tamamen yap�y� olu�turmak i�in olu�turuldu
		tuna.setCourseTaken(studentCourses);
		
		Adder adder = new Adder();
		
		adder.add(new InstructorManager(), engin);
		adder.add(new StudentManager(), tuna);
	}

}
