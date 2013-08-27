package MetodosParametros;

import java.util.Scanner;

public class GradeBookTest {

	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);

		GradeBook myGradeBook = new GradeBook();
		String nameOfCourse;
		
		System.out.println("please enter the course name");
		nameOfCourse = imput.next();

		myGradeBook.displayMessege(nameOfCourse);

	}
}
