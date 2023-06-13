package com.example.progammers.day.day20;

/** 최댓값 만들기(2)
 *  정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
 *
 *  제한사항
 *  -10,000 ≤ numbers의 원소 ≤ 10,000
 *  2 ≤ numbers 의 길이 ≤ 100
 *
 *  예시
 *  numbers                 	result
 * [1, 2, -3, 4, -5]	        15
 * [0, -31, 24, 10, 1, 9]	    240
 * [10, 20, 30, 5, 5, 20, 5]	600
 *
 * 두 수의 곱중 최댓값은 -3 * -5 = 15 입니다.
 * 두 수의 곱중 최댓값은 10 * 24 = 240 입니다.
 * 두 수의 곱중 최댓값은 20 * 30 = 600 입니다.
 */

public class FindMaxMultiply {
    public int solution(int[] numbers) {
        int answer = numbers[0] * numbers[1];

        for(int i=0; i< numbers.length-1; i++){
            for(int j=i+1; j< numbers.length; j++ ){
                if(numbers[i] * numbers[j] >= answer) answer = numbers[i] * numbers[j];
            }
        }
        return answer;
    }
}

// sort 후 인덱스 (작은 값 2개 곱) vs (큰 값 2개 곱) 비교
//         int answer = 0;
//         Arrays.sort(numbers);
//         int edge1 = numbers[0]*numbers[1];
//         int edge2 = numbers[numbers.length-2]*numbers[numbers.length-1];
//         answer = Math.max(edge1,edge2);