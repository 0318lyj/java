package com.yedam.reference;

import java.util.Scanner;

public class BoardExe2 {
    static Board[] boardRepo = new Board[100]; // 게시글 등록 배열
    static Scanner scn = new Scanner(System.in);

    public static void initData() {
        // 배열의 샘플 데이터 (총 15건 등록)
        boardRepo[0] = new Board("게시글제목1", "내용입니다1", "user01", "2025-01-27");
        boardRepo[1] = new Board("게시글제목2", "내용입니다2", "user03", "2025-01-29");
        boardRepo[2] = new Board("게시글제목3", "내용입니다3", "user01", "2025-01-29");
        boardRepo[3] = new Board("게시글제목4", "내용입니다4", "user01", "2025-01-29");
        boardRepo[4] = new Board("게시글제목5", "내용입니다5", "user01", "2025-01-29");

        boardRepo[5] = new Board("게시글제목6", "내용입니다6", "user01", "2025-01-27");
        boardRepo[6] = new Board("게시글제목7", "내용입니다7", "user03", "2025-01-29");
        boardRepo[7] = new Board("게시글제목8", "내용입니다8", "user01", "2025-01-29");
        boardRepo[8] = new Board("게시글제목9", "내용입니다9", "user01", "2025-01-29");
        boardRepo[9] = new Board("게시글제목10", "내용입니다10", "user01", "2025-01-29");

        boardRepo[10] = new Board("게시글제목11", "내용입니다11", "user01", "2025-01-27");
        boardRepo[11] = new Board("게시글제목12", "내용입니다12", "user03", "2025-01-29");
        boardRepo[12] = new Board("게시글제목13", "내용입니다13", "user01", "2025-01-29");
        boardRepo[13] = new Board("게시글제목14", "내용입니다14", "user01", "2025-01-29");
        boardRepo[14] = new Board("게시글제목15", "내용입니다15", "user01", "2025-01-29");
    }

    public static void boardList() {
        // 글 목록: 한 페이지당 5건씩 표시 (예: 1페이지: 인덱스 0~4, 2페이지: 5~9, 3페이지: 10~14)
        int page = 1;
        int maxCount = getMaxCount();
        int lastPage = (int) Math.ceil(maxCount / 5.0);

        while (true) {
            System.out.println("=== " + page + "페이지 ===");
            int firstIdx = (page - 1) * 5;
            int lastIdx = (page * 5) - 1;
            for (int i = firstIdx; i <= lastIdx; i++) {
                if (i < boardRepo.length && boardRepo[i] != null) {
                    System.out.println(boardRepo[i].showBoard());
                }
            }
            System.out.println("[이전 페이지: p, 다음 페이지: n, 종료: q]");
            String paging = scn.nextLine();
            if (paging.equalsIgnoreCase("n")) {
                if (page < lastPage) {
                    page++;
                } else {
                    System.out.println("마지막 페이지입니다.");
                }
            } else if (paging.equalsIgnoreCase("p")) {
                if (page > 1) {
                    page--;
                } else {
                    System.out.println("첫 페이지입니다.");
                }
            } else if (paging.equalsIgnoreCase("q")) {
                break;
            }
        }
    } // end of boardList()

    // 배열의 전체 건수를 반환하는 메소드
    public static int getMaxCount() {
        int count = 0; // 전체 건수
        for (int i = 0; i < boardRepo.length; i++) {
            if (boardRepo[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static void addBoard() {
        // 글 등록
        System.out.println("제목을 입력>> ");
        String title = scn.nextLine();
        System.out.println("내용을 입력>> ");
        String content = scn.nextLine();
        System.out.println("작성자를 입력>> ");
        String writer = scn.nextLine();
        System.out.println("작성일시를 입력>> ");
        String writeDate = scn.nextLine();
        // 배열의 빈 공간에 등록
        for (int i = 0; i < boardRepo.length; i++) {
            if (boardRepo[i] == null) {
                boardRepo[i] = new Board(title, content, writer, writeDate);
                System.out.println("등록완료");
                return; // 한 건만 등록 후 종료
            }
        }
        System.out.println("더 이상 글을 등록할 수 없습니다.");
    }

    public static void removeBoard() {
        // 글 삭제: 삭제할 게시글의 제목을 입력받아 해당 게시글 삭제 (배열의 요소에 null 대입)
        System.out.println("삭제할 게시글의 제목을 입력하세요>> ");
        String title = scn.nextLine();
        boolean found = false;
        for (int i = 0; i < boardRepo.length; i++) {
            if (boardRepo[i] != null && boardRepo[i].getTitle().equals(title)) {
                boardRepo[i] = null; // 삭제 처리
                System.out.println("게시글 삭제 완료");
                found = true;
                break; // 첫 번째 해당 게시글만 삭제
            }
        }
        if (!found) {
            System.out.println("해당 제목의 게시글이 없습니다.");
        }
    }

    public static void main(String[] args) {
        boolean run = true;
        initData(); // 초기 데이터 생성

        while (run) {
            System.out.println("1.글목록  2.글등록  3.삭제  9.종료");
            System.out.print("선택> ");
            int menu = Integer.parseInt(scn.nextLine());
            switch (menu) {
                case 1: // 목록
                    boardList();
                    break;
                case 2: // 등록
                    addBoard();
                    break;
                case 3: // 삭제
                    removeBoard();
                    break;
                case 9: // 종료
                    System.out.println("프로그램을 종료합니다.");
                    run = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        } //
        System.out.println("끝");
    }
}

