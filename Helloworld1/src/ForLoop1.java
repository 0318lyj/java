
import java.util.Scanner;


public class ForLoop1 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		String[] name = new String[100];
		
		while(run) {
			System.out.println("");
			System.out.println("이름을 추가하세요");
			String name = scn.nextLine();
		}
		
	}
}
