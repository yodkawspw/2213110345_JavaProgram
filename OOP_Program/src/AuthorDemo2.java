import java.util.*;
public class AuthorDemo2 {

	public static void main(String[] args) {
		Author[] author = new Author[2];
		Scanner scan = new Scanner(System.in);
		String name,email;
		for(int i = 0;i<author.length;i++) {
			System.out.println("Information Author "+(i+1));
			System.out.println("---------------------------------------");
			System.out.print("Input author name : ");
			name = scan.nextLine();
			System.out.print("Input author e-mai : ");
			email = scan.nextLine();
			System.out.println("---------------------------------------");
		}
		System.out.println();
		int i = 1;
		for(Author _author:author) {
			System.out.println(i+"."+_author.getName()+""+"("+_author.getEmail()+")");
			i++;
		}
	}
}
