package com.example.progammers.day.day21;

/** 숨어 있는 숫자의 덧셈(2)
 * 문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다.
 * my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한조건
 * 연속된 수는 하나의 숫자로 간주합니다.
 * 000123과 같이 0이 선행하는 경우는 없습니다.
 * 문자열에 자연수가 없는 경우 0을 return 해주세요.
 *
 * 예시
 * "aAb1B2cC34oOp"안의 자연수는 1, 2, 34 입니다. 따라서 1 + 2 + 34 = 37 을 return합니다.
 * "1a2b3c4d123Z"안의 자연수는 1, 2, 3, 4, 123 입니다. 따라서 1 + 2 + 3 + 4 + 123 = 133 을 return합니다.
 */

public class HideNumberSum {
    class Solution {
        public int solution(String my_string) {
            int answer = 0;

            my_string = my_string.replaceAll("[A-Z|a-z]", "-");
            String[] str = my_string.split("-");

            for(String s: str){
                if(!s.equals("")){
                    answer += Integer.valueOf(s);
                }
            }

            return answer;
        }
    }

//String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
}
