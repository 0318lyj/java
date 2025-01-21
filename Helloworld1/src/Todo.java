
import java.util.Scanner;

//com.yedam.Todo
public class Todo {

	public static void main (String[] args) {
		Scanner scn = new java.util.Scanner(System.in);
		System.out.println("임의의 문자를 입력");
		int num = Integer.parseInt(scn.nextLine());
		
		System.out.printf("입력한 값은 %d\n", num);
	}
}


