// 친구정보관리 앱 v.1
// 이름,연락처,성별(남/여) => 예)홍길동,010-1234-2345,남
// 1.목록 (이름,연락처,성별) 2. 등록 3.조회(성별) 4삭제(이름) 9.종료
//String[] friendAry 크기는 100개;
import java.util.Scanner;

public class Todo2 {
	
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		String[] friends = new String[100];
		
		while(run) {
			System.out.println("1.목록 (이름,연락처,성별) 2.등록 3.조회(성별) 5.수정(이름):연락처를 수정");
			System.out.println("선택하세요>>");
			int menu = 0;
			try {
                menu = Integer.parseInt(scn.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요.");
                continue;
            }
			
			switch(menu) {
			case 1:
				System.out.println("친구 목록");
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null) {
						System.out.println(friends[i]);
					}
					
				}
				break;
				
			case 2:
				System.out.println("[ 친구 등록 ]");
				System.out.println("친구 정보를 입력하세요 (형식: 이름,연락처,성별)");
				String input =scn.nextLine();
				
				boolean isStored = false;
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = input;
						isStored = true;
						System.out.println("등록이 완료되었습니다.");
						break;
					}
				}
			case 3:
				System.out.println("[ 성별 조회 ]");
                System.out.print("조회할 성별(남/여)을 입력하세요: ");
                String searchGender = scn.nextLine();
                
                boolean foundAny = false;
                for (int i = 0; i < friends.length; i++) {
                    if (friends[i] != null) {
                        // "이름,연락처,성별" => split(",") => [0] = 이름, [1] = 연락처, [2] = 성별
                        String[] friendInfo = friends[i].split(",");
                        if (friendInfo.length == 3 && friendInfo[2].equals(searchGender)) {
                            System.out.println(friends[i]);
                            foundAny = true;
                        }
                    }
                }
			case 4:
				    System.out.println("[ 친구 삭제 ]");
	                System.out.print("삭제할 친구의 이름을 입력하세요: ");
	                String deleteName = scn.nextLine();
	                
	                boolean deleted = false;
	                for (int i = 0; i < friends.length; i++) {
	                    if (friends[i] != null) {
	                        String[] friendInfo = friends[i].split(",");
	                        if (friendInfo.length == 3 && friendInfo[0].equals(deleteName)) {
	                            friends[i] = null;
	                            System.out.println("삭제가 완료되었습니다.");
	                            deleted = true;
	                            break;
	                        }
	                    }
	                }
	                if (!deleted) {
	                    System.out.println("삭제할 이름이 목록에 없습니다.");
	                }
	                break;
			case 5:
				System.out.println("[ 연락처 수정 ]");
                System.out.print("수정할 친구의 이름을 입력하세요: ");
                String editName = scn.nextLine();
                
                boolean edited = false;
                for (int i = 0; i < friends.length; i++) {
                    if (friends[i] != null) {
                        String[] friendInfo = friends[i].split(",");
                        if (friendInfo.length == 3 && friendInfo[0].equals(editName)) {
                            // 현재 정보 출력
                            System.out.println("현재 정보: " + friends[i]);
                            
                            // 새 연락처 입력
                            System.out.print("새로운 연락처를 입력하세요: ");
                            String newContact = scn.nextLine();
                            
                            // 정보 갱신
                            friendInfo[1] = newContact;
                            friends[i] = friendInfo[0] + "," + friendInfo[1] + "," + friendInfo[2];
                            System.out.println("연락처가 수정되었습니다.");
                            edited = true;
                            break;
                        }
                    }
                }
                if (!edited) {
                    System.out.println("해당 이름을 가진 친구가 없습니다.");
                }
                break;
			}
		}
		
	}
}
