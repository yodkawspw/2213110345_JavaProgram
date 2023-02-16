import java.util.*;
public class ATMBanking {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter account number : ");
		String accID = scan.next();
		System.out.print("Enter password : ");
		String password = scan.next();
		while(password.length()!=4) {
			System.out.print("enter password : ");
			password = scan.next();
		}
		System.out.print("Enter money : ");
		int money = scan.nextInt();
		while(money%2 != 0) {
			System.out.print("Enter money : ");
			money = scan.nextInt();
		}
		ATMChecking bank = new ATMChecking(accID,password,money);
		bank.Show();
		
	}

}
