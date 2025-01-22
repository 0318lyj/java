import java.util.Scanner;

public class 연습 {
	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		
		String[] studentAry = new String[3];
		boolean run = true;
		
		while(run) {
			System.out.println("1.학생이름,점수 2.최고점수 9.종료");
			System.out.println("선택하세요>");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch (menu) {
			case 1:
				for (int i = 0; i < studentAry.length; i++) {
					System.out.printf("이름,점수 값을 입력하세요>> ex) 홍길동, 85");
					studentAry[i] = scn.nextLine();
				}
				System.out.println("등록완료");
				break;
			case 2:
				int max = 0;
				for (int i = 0; i < studentAry.length; i++) {
					int temp = Integer.parseInt(studentAry[i].split(",")[1]);
					if (max < temp) {
						max = temp;
					}
				}
				System.out.printf("최고점수는 %d\n", max);
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			}
		}
	}
}
