import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Course {
	private String name;
	private Instructor instructor;
	private Set students = new HashSet();
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public Set getStudents() {
		return students;
	}
	public void setStudents(Set students) {
		this.students = students;
	}
	public void enroll(Student student) { //matricular
		this.students.add(student);
	}
}
