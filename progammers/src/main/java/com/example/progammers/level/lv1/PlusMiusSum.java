package com.example.progammers.level.lv1;

/** 음양 더하기
 *어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와
 * 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
 * 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
 *
 * 예시
 * absolutes	signs	      result
 * [4,7,12]	[true,false,true]	9
 * [1,2,3]	[false,false,true]	0
 *
 * signs가 [true,false,true] 이므로, 실제 수들의 값은 각각 4, -7, 12입니다. 따라서 세 수의 합인 9를 return 해야 합니다.
 */

public class PlusMiusSum {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0; i< absolutes.length; i++){

            if(signs[i]){
                answer += absolutes[i];
            }else{
                answer += absolutes[i]*(-1);
            }
        }

        return answer;
    }
}

// answer += absolutes[i] * (signs[i]? 1: -1);
