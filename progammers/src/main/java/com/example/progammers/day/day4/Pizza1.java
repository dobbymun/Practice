package com.example.progammers.day.day4;

/** 피자 나눠 먹기 (1)
 *머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때,
 * 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
 */

public class Pizza1 {
    int solution(int n) {
        int answer = 0;
        int pizza = 7;

        if((n % pizza) == 0) {
            answer = n / pizza;
        }
        else {
            answer = n / pizza + 1;
        }

        return answer;
    }
}

// 7의 배수와 배수가 아닌 경우로 생각할 것
// int 나누기는 소수점 없이 내림 반환됨