package com.example.progammers.day.day8;

/** 배열 자르기
 * 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
 * numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
 */

public class CutArray {
    class Solution {
        public int[] solution(int[] numbers, int num1, int num2) {
            int[] answer = new int[num2-num1+1];
            int count = 0;

            for(int i= 0; i < (num2-num1+1); i++){
                answer[i]= numbers[num1 + count];
                count++;
            }
            return answer;
        }
    }

// 그 외 방법
// (1) return Arrays.copyOfRange(numbers, num1, num2 + 1);

// (2)
// int[] answer = Arrays.stream(numbers, num1, num2+1).toArray();
// return answer;
}
