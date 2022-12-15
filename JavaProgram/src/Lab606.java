import javax.swing.*;
public class Lab606 {

	public static void main(String[] args) {
		int[] nums = {25, 78, 41, 22, 36, 85, 37};
		int indexOfArray = Integer.parseInt(JOptionPane.showInputDialog("Input index of array: "));
		while(!checkIndex(nums,indexOfArray)) {
			indexOfArray = Integer.parseInt(JOptionPane.showInputDialog("Input index of array,again: "));
		}
		JOptionPane.showMessageDialog(null, "Current data,"+" nums"+"["+indexOfArray+"]"+" is "+currentData(nums,indexOfArray)
									+"\n"+(indexOfArray!=0
									?"Previous data,"+" nums"+"["+(indexOfArray-1)+"]"+" is "+prevData(nums,indexOfArray)
									:"No previous data")
									+"\n"+(indexOfArray!= nums.length-1
									?"Next data,"+" nums"+"["+(indexOfArray+1)+"]"+" is "+nextData(nums,indexOfArray)
									:"No next data"));
	}//end of main()
	
	public static boolean checkIndex(int[] nums, int index) {
		if(index >= nums.length) {
			return false;
		}else {
			return true;
		}
	}//end of checkIndex
	
	public static int currentData(int[] nums, int index) {
		return nums[index];
	}//end of currentData
	
	public static int prevData(int[] nums, int index) {
		return nums[index-1];
	}//end of prevData
	
	public static int nextData(int[] nums, int index) {
		return nums[index+1];
	}//end of nextData;
}
