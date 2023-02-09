import java.util.*;
public class ShapeDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cylinder[] cylinder = new Cylinder[5];
		for(int i = 0;i<cylinder.length;i++) {
			System.out.print("Input radius: ");
			double radius = scan.nextDouble();
			System.out.print("Input height: ");
			double height = scan.nextDouble();
			cylinder[i] = new Cylinder(radius,height);
			System.out.println();
		}
		
		for(int i = 0;i<cylinder.length;i++) {
			System.out.println("Cylinder "+(i+1)+", volume="+cylinder[i].getVolume());
		}
	}

}
