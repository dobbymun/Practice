package com.example.progammers.day.day24;

import java.util.Arrays;

/** A로 B 만들기
 * 문자열 before와 after가 매개변수로 주어질 때,
 * before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
 *
 * 예시
 * "olleh"의 순서를 바꾸면 "hello"를 만들 수 있습니다.
 * "allpe"의 순서를 바꿔도 "apple"을 만들 수 없습니다.
 */

public class AtoB {

    public int solution(String before, String after) {
        int answer = 0;
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();

        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        if(String.valueOf(beforeArr).equals(String.valueOf(afterArr))) answer =1;

        return answer;
    }
}