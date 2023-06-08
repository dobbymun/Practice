package com.example.progammers.day.day18;

/** 문자열안에 문자열
 * 문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
 *
 * 예시
 *     str1	                       str2	    result
 * "ab6CDE443fgh22iJKlmn1o"     	"6CD"	  1
 * "AbcAbcA"	                    "AAA"	  2
 *
 * "ab6CDE443fgh22iJKlmn1o" str1에 str2가 존재하므로 1을 return합니다.
 * "AbcAbcA" str1에 str2가 없으므로 2를 return합니다.
 */

public class ContainsString {
    public int solution(String str1, String str2) {
        int answer = str1.contains(str2) ? 1: 2;

        return answer;
    }
}
