package com.example.progammers.day.day4;

/** 배열의 평균값
 * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
 */

public class ArrayAverage {
    // numbers_len은 배열 numbers의 길이입니다.
    double solution(int numbers[], int numbers_len) {
        double answer = 0;
        int sum = 0;

        for(int i=0; i <numbers_len; i++){
            sum += numbers[i];
        }

        answer = sum /(numbers_len*1.0);

        return answer;
    }
}
