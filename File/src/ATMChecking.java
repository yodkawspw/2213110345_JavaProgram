import java.io.*;
import java.util.*;

public class ATMChecking extends ATMData{
	private int money;
	
	public ATMChecking(String accNum,String password,int money) {
		super(accNum,password);
		this.money = money;
	}
	
	public boolean checkBookBank() throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("ATMBookBank.txt"));
		String temp = "";
		while((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");
			String accountNumber = data[0];
			int password = Integer.parseInt(data[1]);
		}
		return true;
	}
	
	public void Show() {
		System.out.println("You drawing for "+this.money+", get");
	}
}
