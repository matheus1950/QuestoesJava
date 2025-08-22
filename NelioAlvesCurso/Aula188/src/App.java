import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//create 3 courses
		Course c1 = new Course();
		Course c2 = new Course();
		Course c3 = new Course();
		
		Portal.getInstance().addCourse(c1);
		Portal.getInstance().addCourse(c2);
		Portal.getInstance().addCourse(c3);
		
		int qnt;
		System.out.println("How many students for course A");
		qnt = scan.nextInt();
		scan.nextLine();
		
		for(; qnt > 0; qnt --) {
			System.out.println("Enter a student code:");
			Student student = new Student();
			student.setCod(scan.nextInt());
			scan.nextLine();
			c1.enroll(student);
		}
		
		System.out.println("How many students for course B");
		qnt = scan.nextInt();
		scan.nextLine();
		
		for(; qnt > 0; qnt --) {
			System.out.println("Enter a student code:");
			Student student = new Student();
			student.setCod(scan.nextInt());
			scan.nextLine();
			c2.enroll(student);
		}
		
		System.out.println("How many students for course C");
		qnt = scan.nextInt();
		scan.nextLine();
		
		for(; qnt > 0; qnt --) {
			System.out.println("Enter a student code:");
			Student student = new Student();
			student.setCod(scan.nextInt());
			scan.nextLine();
			c3.enroll(student);
		}
		
		Portal.getInstance();
		System.out.println("Total students: " + Portal.getInstance().totalStudents());

	}

}
