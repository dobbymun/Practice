package com.example.progammers.level.lv1;

import java.util.ArrayList;

/** 약수의 합
 *  정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 */

/** 제한 사항
 * n은 0 이상 3000이하인 정수입니다.
 *
 * 입출력 예 #1
 * 12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28입니다.
 */

public class DivisorSum {
    public int solution(int n) {
        ArrayList<Integer> divisor= new ArrayList<>();

        for(int i = 1; i<= n; i++ ){
            if(n % i == 0){
                divisor.add(i);
            }
        }

        int answer = 0;
        for(int i = 0; i< divisor.size(); i++){
            answer += divisor.get(i);
        }

        return answer;
    }
}
