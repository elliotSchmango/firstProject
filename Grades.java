import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		
		//Asking for user input (names, points)
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = myScan.nextLine();
		System.out.println("Enter Lab Points: ");
		int lab = myScan.nextInt();
		System.out.println("Enter Bonus Points: ");
		int bonus = myScan.nextInt();
		
		int total = lab + bonus;
		
		//printing border
		System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("==\tStudent Points\t\t==");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
		System.out.println("                                      ");
		System.out.println("Name\t\tLab\tBonus\tTotal");
		System.out.println("----\t\t---\t-----\t-----");
		
		//printing content with string concatenation
		System.out.println(name + "\t\t" + lab + "\t" + bonus + "\t" + total);
	}

}
