package com.example.progammers.day.day17;

import java.util.ArrayList;
import java.util.List;

/** n의 배수 고르기
 *정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
 * numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 예시
 *  n	numlist                         	result
 *  3	[4, 5, 6, 7, 8, 9, 10, 11, 12]	  [6, 9, 12]
 *  5	[1, 9, 3, 10, 13, 5]	          [10, 5]
 *
 * numlist에서 3의 배수만을 남긴 [6, 9, 12]를 return합니다.
 * numlist에서 5의 배수만을 남긴 [10, 5]를 return합니다.
 */
public class SelectMultipleOfN {

    public List<Integer> solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();

        for(int num: numlist){
            if(num % n == 0) {
                answer.add(num);
            }
        }

        return answer;
    }
}

// Stream으로 연산 -> return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
// 타입만 int[]로 반환 -> return answer.stream().mapToInt(x -> x).toArray();
