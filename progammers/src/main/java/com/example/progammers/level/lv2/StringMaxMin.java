package com.example.progammers.level.lv2;

/**최댓값과 최솟값
 * 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
 * str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
 * 예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
 *
 * s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.
 *
 * 예시
 *     s             return
 * "1 2 3 4"	     "1 4"
 * "-1 -2 -3 -4"	 "-4 -1"
 * "-1 -1"	         "-1 -1"
 * "-1, -2, 1"       "-2, 1"
 */

import java.util.*;

public class StringMaxMin {
    public String solution(String s) {
        String answer = "";
        String[] strArray = s.split(" ");
        int[] num = Arrays.stream(strArray).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(num);

        int min = num[0];
        int max = num[num.length-1];

        answer = min + " " + max;

        return answer;
    }
}
