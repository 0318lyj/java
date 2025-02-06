package com.yedam.api;

public class TimeExe {
    public static void main(String[] args) {
        // 프로그램 시작 시각 기록 (밀리초 단위)
        long startTime = System.currentTimeMillis();
        
        long sum = 0;
        // 1부터 10,000,000,000까지의 250의 배수 합산
        // 250의 배수는 모두 짝수이므로 250씩 증가시키면서 합산합니다.
        for (long i = 1; i <= 10_000_000_000L; i++) {
            if( i % 250 == 0) {
            	sum += i;
            }
        }
        
        // 프로그램 종료 시각 기록 (밀리초 단위)
        long endTime = System.currentTimeMillis();
        
        // 경과 시간 계산 (밀리초)
        long elapsedMillis = endTime - startTime;
        
        // 밀리초를 초 단위로 변환 후, 분과 초로 분리
        long totalSeconds = elapsedMillis / 1000;
        long minutes = totalSeconds / 60;
        long seconds = totalSeconds % 60;
        
        // 결과 출력: "?분 ?초 합은 ? 입니다"
        System.out.println(minutes + "분 " + seconds + "초 합은 " + sum + "입니다");
    }
}


