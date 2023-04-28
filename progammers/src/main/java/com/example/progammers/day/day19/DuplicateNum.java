package com.example.progammers.day.day19;

/** 중복된 숫자 갯수 찾기
 * 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
 * array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
 */

public class DuplicateNum {
    public int solution(int[] array, int n) {
        int answer = 0;

        for(int a: array){
            if(a == n)
                answer ++;
        }
        return answer;
    }
}
