package com.example.progammers.day.day17;

/** 자릿수 더하기
 * 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
 *
 * 예시
 *    n  	result
 * 1234	    10
 * 930211	16
 *
 * 1 + 2 + 3 + 4 = 10을 return합니다.
 * 9 + 3 + 0 + 2 + 1 + 1 = 16을 return합니다.
 */
public class SumNumber {
    public int solution(int n) {
        int answer = 0;
        String nString = String.valueOf(n);

        for(int i=0; i<nString.length(); i++){      //while(n > 0)으로 했으면 길이 안구해도
            answer += (n % 10);
            n = n/10;
        }

        return answer;
    }
}

//1. Stream 연산
// return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
//2. split으로 자르기 String[] split = String.valueOf(n).split("");