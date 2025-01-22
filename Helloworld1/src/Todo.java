
import java.util.Scanner;

//com.yedam.Todo
public class Todo {

	public static void main (String[] args) {
		Scanner scn = new java.util.Scanner(System.in);
		int balance = 0;
		int money = 0;
		
		while (true) {
			System.out.println("1.입금 2.출금 3.잔액조회 4.종료 ");
			System.out.print("메뉴를 선택하세요>>");
			int num = Integer.parseInt(scn.nextLine());
			
			//입금
			if (num == 1) {
				System.out.print("예금액을 입력>>");
				money = Integer.parseInt(scn.nextLine());
				if (balance + money > 100000) {
					System.out.println("금액초과입니다.");
				} else {
					balance = balance + money;
					System.out.println("입금완료");
				}
				
			//출금	
			} else if (num == 2) {
				System.out.print("출금액을 입력>>");
				money = Integer.parseInt(scn.nextLine());
				
				if (balance < money) {
					System.out.println("잔액을 확인하세요");
				} else {
					balance = balance + money;
					System.out.println("출금완료");
				}
				
			//잔액조회
			} else if (num == 3) {
				System.out.println("현재 잔액은 %d 입니다. \n" + balance);
				
			//종료
			}else if (num ==4) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}


