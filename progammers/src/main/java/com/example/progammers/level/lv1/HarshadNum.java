package com.example.progammers.level.lv1;

/** 하샤드 수
 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
 * 예를 들어 18의 자릿수 합은 1+8=9이고,
 * 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 *
 * 예시
 *  x	return
 * 10	true
 * 12	true
 * 11	false
 * 10의 모든 자릿수의 합은 1입니다. 10은 1로 나누어 떨어지므로 10은 하샤드 수입니다.
 * 12의 모든 자릿수의 합은 3입니다. 12는 3으로 나누어 떨어지므로 12는 하샤드 수입니다.
 * 11의 모든 자릿수의 합은 2입니다. 11은 2로 나누어 떨어지지 않으므로 11는 하샤드 수가 아닙니다.
 */

public class HarshadNum {

    public boolean solution(int x) {
        boolean answer = false;
        int tmp = x;
        int sum = 0;

        while(tmp > 0){
            sum += tmp%10;
            tmp = tmp/10;
        }

        if(x % sum == 0) answer = true;
        return answer;
    }
}