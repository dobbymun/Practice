package com.example.progammers.day.day18;

/** 제곱수 판별하기
 * 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
 * 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
 *
 * 예시
 *  n	result
 * 144	1
 * 976	2
 *
 * 144는 12의 제곱이므로 제곱수입니다. 따라서 1을 return합니다.
 * 976은 제곱수가 아닙니다. 따라서 2를 return합니다.
 */

public class SquareNumber {
    public int solution(int n) {
        int answer = 2;

        for(int i = 2; i <= n; i++){
            if( i*i == n){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}
//if (n % Math.sqrt(n) == 0)
