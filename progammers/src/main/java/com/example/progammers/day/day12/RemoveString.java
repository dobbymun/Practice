package com.example.progammers.day.day12;

/** 모음 제거
 * 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
 * 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
 *
 * 예시
 * "bus"에서 모음 u를 제거한 "bs"를 return합니다.
 * "nice to meet you"에서 모음 i, o, e, u를 모두 제거한 "nc t mt y"를 return합니다.
 */
public class RemoveString {
    public String solution(String my_string) {
        String answer = "";
        String[] alphabet = {"a", "e", "i", "o", "u"};

        for(int i=0; i<alphabet.length; i++){
            my_string = my_string.replace(alphabet[i], "");
        }

        answer = my_string;
        return answer;
    }

}

// 정규식 이용한 replaceAll 방식들
// answer = my_string.replaceAll("[a,e,i,o,u]","");
// answer = my_string.replaceAll("[aeiou]","");
// answer = myString.replaceAll("a|e|i|o|u", "");
