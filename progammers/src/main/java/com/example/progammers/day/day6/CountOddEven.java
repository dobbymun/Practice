package com.example.progammers.day.day6;

/** 짝수 홀수 개수
 * 정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */

public class CountOddEven {
    public int[] solution(int[] num_list) {
        int[] answer = {0,0};

        for(int n: num_list){
            if(n % 2 == 0){
                answer[0]++;
            } else{
                answer[1]++;
            }
        }
        return answer;
    }
}
