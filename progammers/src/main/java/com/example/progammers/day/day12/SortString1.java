package com.example.progammers.day.day12;

import java.util.*;

/** 문자열 정렬하기 (1)
 *  문자열 my_string이 매개변수로 주어질 때,
 *  my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
 *
 *  예시
 *  "hi12392"에 있는 숫자 1, 2, 3, 9, 2를 오름차순 정렬한 [1, 2, 2, 3, 9]를 return 합니다.
 *  "p2o4i8gj2"에 있는 숫자 2, 4, 8, 2를 오름차순 정렬한 [2, 2, 4, 8]을 return 합니다.
 *  "abcde0"에 있는 숫자 0을 오름차순 정렬한 [0]을 return 합니다.
 */

public class SortString1 {
    public List<Integer> solution(String my_string) {
        List<Integer> answer = new ArrayList<>();

        for(int i=0; i< my_string.length(); i++){
            for(int j=0; j<=9; j++){
                String check = String.valueOf(my_string.charAt(i));

                if(check.equals(j+"")){
                    answer.add(Integer.valueOf(check));
                }
            }
        }

        Collections.sort(answer);

        return answer;
    }
}

// 일반 배열 정렬 -> Arrays.sort()
// 컬렉션 배열 정렬 -> Collections.sort()
