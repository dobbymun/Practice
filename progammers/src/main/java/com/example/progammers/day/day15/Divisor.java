package com.example.progammers.day.day15;

import java.util.*;

/** 약수 구하기
 * 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 예시
 *  n	 result
 * 24	[1, 2, 3, 4, 6, 8, 12, 24]
 * 29	[1, 29]
 */

public class Divisor {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(n%i == 0) {
                answer.add(i);
            }
        }
        return answer;
    }
}

//answer.stream().mapToInt(x -> x).toArray();  // List<Integer> -> int [] 변환 시

// 그 외
//    public int[] solution(int n) {
//        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
//    }


