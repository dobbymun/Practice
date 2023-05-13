package com.example.progammers.day.day11;

import java.util.Arrays;

/** 최대값 만들기 (1)
 * 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
 *
 * 예시
 *     numbers	           result
 * [1, 2, 3, 4, 5]	         20
 * [0, 31, 24, 10, 1, 9]	744
 *
 * 두 수의 곱중 최댓값은 4 * 5 = 20 입니다.
 * 두 수의 곱중 최댓값은 31 * 24 = 744 입니다.
 */

public class MakeMaxNum {
    public int solution(int[] numbers) {
        int answer = 0;
        int length = numbers.length;

        Arrays.sort(numbers);

        answer = numbers[length-1] * numbers[length-2];

        return answer;
    }
}
