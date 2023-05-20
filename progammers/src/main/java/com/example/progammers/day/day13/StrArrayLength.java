package com.example.progammers.day.day13;

/** 배열 원소의 길이
 * 문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
 *
 * 예시
 * ["We", "are", "the", "world!"]의 각 원소의 길이인 [2, 3, 3, 6]을 return합니다.
 * ["I", "Love", "Programmers."]의 각 원소의 길이인 [1, 4, 12]을 return합니다.
 */

public class StrArrayLength {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int idx = 0;

        for(String s: strlist){
            answer[idx] = s.length();
            idx++;
        }

        return answer;
    }
}
