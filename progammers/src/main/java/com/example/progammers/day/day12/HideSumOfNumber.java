package com.example.progammers.day.day12;

/** 숨어있는 숫자의 덧셈 (1)
 * 문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
 *
 * 예시
 * "aAb1B2cC34oOp"안의 한자리 자연수는 1, 2, 3, 4 입니다. 따라서 1 + 2 + 3 + 4 = 10 을 return합니다.
 * "1a2b3c4d123Z"안의 한자리 자연수는 1, 2, 3, 4, 1, 2, 3 입니다. 따라서 1 + 2 + 3 + 4 + 1 + 2 + 3 = 16 을 return합니다.
 */

public class HideSumOfNumber {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[A-Z|a-z]", "");

        for(int i=0; i < my_string.length(); i++){
            answer += Integer.valueOf(my_string.charAt(i)-'0');
        }

        return answer;
    }
}

// answer += Integer.valueOf(my_string.charAt(i)-'0');              // 아스키코드 인식으로 char -> int 변환 시 '0' 빼줘야
// answer += Character.getNumericValue(my_string.charAt(i));        // Character.getNumericValue() 메소드 사용
// answer += Integer.valueOf(String.valueOf(my_string.charAt(i)));  // char -> String -> Integer 변환

