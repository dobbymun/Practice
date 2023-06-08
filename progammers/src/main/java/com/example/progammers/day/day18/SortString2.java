package com.example.progammers.day.day18;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/** 문자열 정렬하기 (2)
 * 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
 * my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 예시
 * my_string	result
 * "Bcad"	   "abcd"
 * "heLLo"	  "ehllo"
 *
 * "Bcad"를 모두 소문자로 바꾸면 "bcad"이고 이를 알파벳 순으로 정렬하면 "abcd"입니다.
 * "heLLo"를 모두 소문자로 바꾸면 "hello"이고 이를 알파벳 순으로 정렬하면 "ehllo"입니다.
 */
public class SortString2 {
    public String solution(String my_string) {

        String answer = Stream.of(my_string.split(""))
                .map(s -> s.toLowerCase())
                .sorted()
                .collect(Collectors.joining());
        return answer;
    }
}

// char[] c = my_string.toLowerCase().toCharArray();
//         Arrays.sort(c);
//         return new String(c);