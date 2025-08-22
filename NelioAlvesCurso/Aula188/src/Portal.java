import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Portal { //Singleton
	private static Portal instance;
	private Set<Course> courses = new HashSet();
	
	private Portal() {
	}
	
	public static Portal getInstance() {
		if(instance == null)
			instance = new Portal();
		return instance;
	}
	
	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public void addCourse(Course course) {
		this.courses.add(course);
	}
	
	public int totalStudents(){
		Set<Student> allStudents = new HashSet();
		for(Course c: courses) {
			allStudents.addAll(c.getStudents());
		}
		return allStudents.size();
	}

}
