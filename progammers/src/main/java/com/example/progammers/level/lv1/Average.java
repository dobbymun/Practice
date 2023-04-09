package com.example.progammers.level.lv1;

/** 평균 구하기
 *정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 */

public class Average {

    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;

        for(int a: arr){
            sum += a;
        }

        answer = sum/(arr.length);

        return answer;
    }
}
