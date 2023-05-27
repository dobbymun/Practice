package com.example.progammers.day.day15;

/** 인덱스 바꾸기
 * 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
 * my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
 *
 * my_string	   num1	num2	result
 * "hello"	         1	2	    "hlelo"
 * "I love you"	     3	6	   "I l veoyou"
 *
 * "hello"의 1번째 인덱스인 "e"와 2번째 인덱스인 "l"을 바꾸면 "hlelo"입니다.
 */
public class ChangeIndex {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] ch = my_string.toCharArray();

        StringBuilder sb = new StringBuilder(my_string);
        sb.setCharAt(num1, ch[num2]);
        sb.setCharAt(num2, ch[num1]);

        answer = sb.toString();
        return answer;
    }
}

//StringBuilder 주요 메소드

//StringBuilder sb = new StringBuilder(기본 String 디폴트값); -> 생성 시 기존 string 넣어 생성 가능
//sb.setCharAt(인덱스, 대체할 문자);
//sb.replace(int start, int end, String str) -> 주어진 위치에 문자열을 주어진 문자열로 대체한다.
//sb.reverse() ->역순으로
//sb.toString() ->스트링으로 변환
