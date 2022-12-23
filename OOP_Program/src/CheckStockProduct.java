import java.util.*;

public class CheckStockProduct {

	static Scanner scan = new Scanner(System.in);
	static Product pd = new Product();

	public static void main(String[] args) {
		System.out.print("How many product list in stock : ");
		int stock = scan.nextInt();
		Product[] proStock = new Product[stock];
		System.out.println();
		for (int i = 0; i < proStock.length; i++) {
			proStock[i] = new Product();
			System.out.print("Input product Id : ");
			proStock[i].setId(scan.next());
			System.out.print("Input product Unit : ");
			int unit = scan.nextInt();
			proStock[i].setUnit(unit);
			while (unit <= 0) {
				System.out.print("Input product Unit, again : ");
				unit = scan.nextInt();
				proStock[i].setUnit(unit);
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
		System.out.println("List of product in "+"'"+"LOW"+"' "+"status.");
		System.out.println("-----------------------------------");
		for(Product PRO : proStock) {
			if(PRO.getUnit()<5)
			System.out.println(">> "+PRO.getId()+" has "+PRO.getUnit()+" units");
		}
		System.out.println("-----------------------------------");
		System.out.println("List of product in "+"'"+"NORMAL"+"' "+"status.");
		System.out.println("-----------------------------------");
		for(Product PRO : proStock) {
			if(PRO.getUnit()>=5 && PRO.getUnit()<50)
			System.out.println(">> "+PRO.getId()+" has "+PRO.getUnit()+" units");
		}
		System.out.println("-----------------------------------");
		System.out.println("List of product in "+"'"+"HIGH"+"' "+"status.");
		System.out.println("-----------------------------------");
		for(Product PRO : proStock) {
			if(PRO.getUnit()>50)
			System.out.println(">> "+PRO.getId()+" has "+PRO.getUnit()+" units");
		}
	}// end of main()
}