
public class InstructorManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " Eklendi.");
	}
	
	public void addCourses(String[] courses) {
		for (String string : courses) {
			System.out.println(string + " Eklendi.");
		}
	}
}
