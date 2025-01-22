
public class Todo3{
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		while(run) {
			System.out.println("1.목록 2.입력 3.조회 4.삭제 5.수정 9.종료");
			
			switch (menu) {
				case 1:
					System.out.println("이름 연락처 성별");
					System.out.println("============");
					for (int i = 0; i < friendAry.length; i++) {
						System.out.printf("%s %s %s \n",
									friendAry[i].split(",")[0],
									friendAry[i].split(",")[1],
									friendAry[i].split(",")[2]);
					 	}				
					}
					System.out.println("============");
					break;
					
				case 2:
					System.out.println("정보입력> ");
					for (int i = 0; i < friednAry.length; i++) {
						if (friendAry[i] == null) {
							friendAry[i] = scn.nextLine();
						}
				case 3:
					System.out.println("조회할 성별 입력>");
				case 9:
			}
		}
	}
}




