import javax.swing.*;

public class Lab_Example602_2 {
	static String[] deptName = {"Accounting","HR","Sales","Innovation"};
	static boolean deptWasFound = false;
	public static void main(String[] args) {
		inputdeptName();
	}
	
	public static void inputdeptName() {
		String departName = JOptionPane.showInputDialog("Enter a department name");;
		for(int i =0;i<deptName.length;i++) {
			if(departName.equalsIgnoreCase(deptName[i])) {
				deptWasFound = true;
			}
		}//end of for
		
		if(deptWasFound) {
			JOptionPane.showMessageDialog(null, departName + "was found in the list");
		}else {
			JOptionPane.showMessageDialog(null, departName + "was not found in the list");
		}
	}

}
