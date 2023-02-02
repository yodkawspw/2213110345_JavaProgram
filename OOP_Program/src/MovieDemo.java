import java.util.*;
public class MovieDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input movie id : ");
		String id = scan.nextLine();
		System.out.print("Input movie name : ");
		String name = scan.nextLine();
		System.out.println();
		System.out.print("Input director name : ");
		String direcName = scan.nextLine();
		System.out.print("Input director e-mail : ");
		String direcEmail = scan.nextLine();
		System.out.print("Input director gender : ");
		char direcGender = scan.nextLine().toLowerCase().charAt(0);
		while(direcGender != 'm' && direcGender != 'f') {
			System.out.print("Input director gender, again : ");
			direcGender = scan.nextLine().toLowerCase().charAt(0);
		}
		System.out.println();
		System.out.print("Input movie theater no. : ");
		int theaterNum = scan.nextInt();
		while(theaterNum < 1 || theaterNum > 15) {
			System.out.print("Please input 1 - 15 only : ");
			theaterNum = scan.nextInt();
		}
		System.out.println();
		Theater theater = new Theater(id,name,new Director(direcName,direcEmail,direcGender),theaterNum);
		System.out.print(theater);
	}

}
