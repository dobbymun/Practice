package com.example.progammers.day.day16;

/** 문자열 계산하기
 * my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때,
 * 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
 *
 * 예시
 * my_string	result
 * "3 + 4"	      7
 *
 * 3 + 4 = 7을 return 합니다.
 */
public class StringCalculator {
    public int solution(String my_string) {
        int answer = 0;

        String[] s = my_string.split(" ");

        for(int i= 0; i<s.length; i++){

            if(s[i].equals("-")){
                s[i+1] = Integer.valueOf(s[i+1])*(-1)+"";
            }else if(s[i].equals("+")){
                continue;
            } else{
                answer += Integer.valueOf(s[i]);
            }
        }

        return answer;
    }
}