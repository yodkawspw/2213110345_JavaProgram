import java.util.Scanner;

public class AuthorDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		String email;
		char gender;
		System.out.print("Input author name : ");
		name = scan.nextLine();
		System.out.print("Input author e-mai : ");
		email = scan.nextLine();
		System.out.print("Input author gender : ");
		gender = scan.nextLine().charAt(0);
		Author author = new Author(name,email,gender);
		System.out.println();
		System.out.println(author);
	}
}
