package com.yedam.reference;

public class ReferenceExe3 {
	
	public static void main(String[] args) {
		String[][] scores = {{"홍길동", "80"},{"김민수", "85"},{"심상현", "88"},{"최기동", "90"},{"박헌수", "75"}};
		
		int sum = 0;
		String[] temp = {"","0"};
		int max = 0;
		
		for (int i =0; i < scores.length; i++) {
			System.out.println("점수 => " + scores[i][1]);
			
			sum = sum + Integer.parseInt(scores[i][1]);
//			if (Integer.parseInt(temp[1]) 
//					< Integer.parseInt(scores[i][1])) {
//				temp = scores[i];
//			}
		
		}	
		
		for (int i = 0; i < scores.length; i++) {
			if (max < Integer.parseInt(scores[i][1])) {
				max = Integer.parseInt(scores[i][1]);
			}
		}
		
		System.out.println("최고점수 학생" + max);
		System.out.printf("sum의 값은 %d\n", sum);
		
		
		
	}
}


