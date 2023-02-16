
public class ATMData {
	private String accountNumber;
	private String password;
	
	public ATMData(String accNum,String password) {
		this.accountNumber = accNum;
		this.password = password;
	}
	
	public String getID() {
		return this.accountNumber;
	}
	
	public String getPass() {
		return this.password;
	}
}
