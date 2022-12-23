import java.util.*;
import java.text.*;
public class StockProduct {
	static Scanner scan = new Scanner(System.in);
	static Product pd = new Product();
	
	public static void main(String[] args) {
		Product[] productList = new Product[4];
		DecimalFormat frm = new DecimalFormat("#,###.00");
		for(int i = 0;i<productList.length;i++) {
			productList[i] = new Product();
			System.out.print("Input product Id : ");
			productList[i].setId(scan.next());
			System.out.print("Input product Unit : ");
			int unit = scan.nextInt();
			productList[i].setUnit(unit);
			while(unit <=0 ) {
				System.out.print("Input product Unit, again : ");
				unit = scan.nextInt();
				productList[i].setUnit(unit);
			}
			System.out.print("Input product Price : ");
			double price = scan.nextDouble();
			productList[i].setPrice(price);
			while(price <= 0) {
				System.out.print("Input product Price, again : ");
				unit = scan.nextInt();
				productList[i].setUnit(unit);
			}//end for()
			System.out.println();
		}//end for()
		System.out.println("---------------------------------------------------");
		double sum = 0;
		for(Product PROLIST : productList) {
			System.out.println("Product ID : "+ PROLIST.getId()+", "+"Total price = "+frm.format(PROLIST.calculate())+" baht.");
			sum += PROLIST.calculate();
		}//end for()
		System.out.println("---------------------------------------------------");
		System.out.println("Total price of all products is "+frm.format(sum)+" baht.");
	}
}
