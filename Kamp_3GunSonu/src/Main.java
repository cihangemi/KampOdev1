
public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setFirstName("O�uzhan");
		student.setLastName("�zt�rk");
		student.setId(1);
		student.setMail("aasdad@sad.asd");
		student.setSchoolName("SDU");
		student.setDepartment("CE");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);

	}

}
