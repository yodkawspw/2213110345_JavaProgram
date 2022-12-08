import java.util.*;
public class Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, seperated by a space."+"\n:");
		String fullname = scan.nextLine();
		String firstName = fullname.substring(0,fullname.indexOf(' '));
		System.out.println(abbreviatName(fullname)+firstName);
	}

	public static String abbreviatName(String fullName) {
		String checkName = "";
		for(int i = 1;i<fullName.length();i++) {
			if(fullName.charAt(i)==' ') {
				checkName = (checkName + fullName.charAt(i+1)).toUpperCase();
				checkName = checkName + ".";
			}
		}
		return checkName;
	}
}
