import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    double A = scan.nextDouble();
	    double B = scan.nextDouble();
	    double C = scan.nextDouble();
		System.out.printf("MEDIA = %.1f\n", ((A*2 + B*3 + C*5)/10));
	}
}