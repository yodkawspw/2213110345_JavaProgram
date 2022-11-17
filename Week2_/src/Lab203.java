import java.util.*;
public class Lab203 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input two integers(a,b): ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int sum = num1 + num2;
		System.out.println("Sum of two integers: "+sum);
		int digitNum = 0;
		while(sum != 0) {
			sum = sum/10;
			digitNum++;
		}
		System.out.println("Digit number of sum of said two integers:" + "\n"+digitNum);
	}

}
