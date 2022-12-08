import java.util.*;
public class Lab505 {

	public static void main(String[] args) {
		inputStudent();
	}//end of main() method
	
	public static void inputStudent() {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter Student Id: ");
		String studentId = scan.next();
		System.out.print("Enter Subject Id: ");
		String subjectId = scan.next();
		while(isLength(studentId,subjectId)) {
			System.out.print("Enter Student Id: ");
			studentId = scan.next();
			System.out.print("Enter Subject Id: ");
			subjectId = scan.next();
		}
		isITStudent(studentId);
		isITSubject(subjectId);
		displayData(isITStudent(studentId),isITSubject(studentId));
	}
	
	public static boolean isLength(String stuId,String subId) {
		if(stuId.length()==10||subId.length()==7) {
			return true;
		}else {
			return false;
		}
	}//end of isLength() method
	
	public static boolean isITStudent(String stuId) {
		return true;
	}//end of isITStudent() method
	
	public static boolean isITSubject(String subId) {
		return true;
	}//end of isITSubject() method
	
	public static void displayData(String ITStudent,String ITSubject) {
	
	}//end of displayData() method
}
