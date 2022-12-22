import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Student[] std = new Student[3]; //define Array Object
		for(int i=0;i<std.length;i++) {
			std[i] = new Student(); //declare array object ,call all of method Student()
			System.out.print("Input student name : ");
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());
			while(!std[i].checkScore()) {
				System.out.print("Input student score, again : ");
				std[i].setScore(scan.nextInt());
			}//end while()
			System.out.println();
		}//end for()
		System.out.println();
		System.out.println("LIST OF PASS STUDENT (>=50)");
		System.out.println("-----------------------------");
		/*for(int i =0;i<std.length;i++) {
			if(std[i].isPass()) {
				System.out.print(">> "+std[i].getName()+" ("+std[i].getScore()+" )");
			}
		}//end for()*/
		for(Student STD : std) {
			if(STD.isPass()) {
				System.out.print(">> "+STD.getName()+" ("+STD.getScore()+")");
			}
		}//end foreach()
		
	}//end of main()
	
	public String findGrade(int score) {
		if(score >=80 && score <=100) {
			return "A";
		}else if (score >=75 && score <=79) {
			return "B+";
		}
		return "";
	}
}
