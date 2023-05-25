package com.example.progammers.day.day14;

/** 대소문자
 * 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
 *
 * 예시
 * my_string	   result
 * "cccCCC"	      "CCCccc"
 * "abCdEfghIJ"	 "ABcDeFGHij"
 */

public class UpperLowerCase {
    public String solution(String my_string) {
        String answer = "";

        for(int i= 0; i< my_string.length(); i++){
            char c = my_string.charAt(i);

            if(Character.isUpperCase(c)){
                answer += Character.toLowerCase(c);
            }else{
                answer += Character.toUpperCase(c);
            }
        }

        return answer;
    }
}
