package com.example.progammers.day.day11;

/**
 * i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다. 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다.
 * 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
 * 즉, i! ≤ n
 *
 * 제한 사항
 * 0 < n ≤ 3,628,800
 *
 * 예시
 * 10! = 3,628,800입니다. n이 3628800이므로 최대 팩토리얼인 10을 return 합니다.
 * 3! = 6, 4! = 24입니다. n이 7이므로, 7 이하의 최대 팩토리얼인 3을 return 합니다.
 */

public class Factorial {
    public int solution(int n) {
        int answer = 1;
        int result = 1;

        for(int i = 1; i <= n; i++){
            result *= i;
            if(result <= n){
                answer = i;
            }else{
                break;
            }
        }
        return answer;
    }
}
