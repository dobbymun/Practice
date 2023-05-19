package com.example.progammers.day.day13;

import java.util.*;

/** 중복 문자제거
 * 문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
 *
 *       예시
 *    my_string	            result
 *    "people"	            "peol"
 * "We are the world"	"We arthwold"
 *
 * 예시 설명
 * "people"에서 중복된 문자 "p"와 "e"을 제거한 "peol"을 return합니다.
 * "We are the world"에서 중복된 문자 "e", " ", "r" 들을 제거한 "We arthwold"을 return합니다.
 */

public class DistinctString {
    public String solution(String my_string) {
        String answer = "";

        Set<Character> set = new LinkedHashSet<>();       //1. 중복제거 + 순서 유지되는 LinkedHashSet 사용

        for(int i= 0; i< my_string.length(); i++){
            set.add(my_string.charAt(i));
        }

        for(char s : set){
            answer += s;
        }

        return answer;
    }
}
// 2. indexOf() 사용 방법
// String.indexOf()는 찾는 값이 중복된 경우 첫번째 인덱스 반환, 없는 경우 -1 반환
//  String.indexOf("찾는문자") == i 인경우 -> 첫번째 인덱스와 i 값이 같은 경우만 answer에 문자 저장하는 방법

// String answer = "";
// for (int i=0; i< my_string.length(); i++) {
//     if (my_string.indexOf(my_string.charAt(i))==i) answer += my_string.charAt(i);
// }
// return answer;
