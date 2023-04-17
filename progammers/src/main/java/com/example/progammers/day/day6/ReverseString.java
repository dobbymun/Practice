package com.example.progammers.day.day6;

/** 문자열 뒤집기
 * 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
 */

public class ReverseString {

    public String solution(String my_string) {
        String answer = "";

        for(int i= 0; i< my_string.length(); i++){
            answer += my_string.charAt(my_string.length()-i-1);
        }

        return answer;
    }
}
