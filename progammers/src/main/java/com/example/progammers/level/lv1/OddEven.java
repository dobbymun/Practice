package com.example.progammers.level.lv1;

/** 짝수와 홀수
 * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
 */

public class OddEven {
    public String solution(int num) {
        String answer = "";
        int mod = num % 2;

        if(mod != 0){
            answer = "Odd";
        } else{
            answer = "Even";
        }
        return answer;
    }
}
