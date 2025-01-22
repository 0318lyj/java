/*
* 학생점수를 입력을 받아서 배열에 저장하고, 
* 배열에 저장된 값을 가지고 최고점수,평균,합계점수 출력
*/

import java.util.Scanner;

public class ForLoopExe1 {
	
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		int[] scores = new int[3];
		
		while(run) {
			System.out.println("1.학생점수 입력 2.최고점수 3.평균,합계점수 5.종료");
			System.out.print("선택하세요>");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
			case 1: //학생점수 입력
				for(int i = 0; i < scores.length; i++) {
					System.out.print("점수를 입력하세요.>");
					scores[i] = Integer.parseInt(scn.nextLine());
				}
				System.out.println("입력완료");
				break;
				
			case 2: //최고점수 출력
				int max = 0;
				// 반복문
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.printf("최고점은 %d입니다.\n", max);
				break;
			case 3: // 합계, 평균
				int sum = 0;
				double avg = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				
				avg = sum * 1.0 / scores.length; //int와 int의 연산결과는 int
				System.out.printf("합계는 %d, 평균은 %f입니다.\n", sum, avg);
				break;
			case 4:
				break;
				
			case 5:
				System.out.println("종료");
				run = false;
				break;
				
			default:
				System.out.println("메뉴를 다시 선택하세요");
			}
		}
		System.out.println("시스템 종료");
	}
}
