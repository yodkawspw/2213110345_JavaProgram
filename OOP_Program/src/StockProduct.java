import java.util.*;
public class StockProduct {
	static Scanner scan = new Scanner(System.in);
	static Product pd = new Product();
	public static void main(String[] args) {
		Product[] productList = new Product[4];
		for(Product pdl : productList) {
			System.out.print("Input product Id : ");
			pd.setId(scan.next());
			System.out.print("Input product Unit : ");
			int unit = scan.nextInt();
			pd.setUnit(unit);
			while(unit <=0 ) {
				System.out.print("Input product Unit, again : ");
				unit = scan.nextInt();
				pd.setUnit(unit);
			}
			System.out.print("Input product Price : ");
			double price = scan.nextDouble();
			pd.setPrice(price);
			while(price <= 0) {
				System.out.print("Input product Price, again : ");
				unit = scan.nextInt();
				pd.setUnit(unit);
			}
			
			System.out.println();
		}//end for()
		System.out.print("---------------------------------");
		System.out.print("Product ID : "+pd.getId());
	}

}
