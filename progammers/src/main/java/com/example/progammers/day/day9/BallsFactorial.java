package com.example.progammers.day.day9;

import java.math.BigInteger;

/** 구슬을 나누는 경우의 수
 * 머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다.
 * 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
 * balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
 *
 * 예시
 * 서로 다른 구슬 3개 중 2개를 고르는 경우의 수는 3입니다.
 * 서로 다른 구슬 5개 중 3개를 고르는 경우의 수는 10입니다.
 */

public class BallsFactorial {
    public int solution (int balls, int share){
        BigInteger answer = BigInteger.valueOf(1);

        for(int i= balls; i>share; i--){
            answer = answer.multiply(BigInteger.valueOf(i));
        }
        for(int i=2; i<=balls - share; i++){
            answer = answer.divide(BigInteger.valueOf(i));
        }

        return answer.intValue();
    }
}


// int와 long 범위를 넘어서서 큰 수는 적용 못한 다른 방법

//1. 반복문
//    public long solution(int balls, int share) {
//         long answer = 0;

//         long result1 = factorial(balls);
//         long result2 = (factorial(balls - share)) * factorial(share);

//         answer = result1/result2;

//         return answer;
//     }

//     private long factorial(int n) {
//         int result=1;
//         for(int i = n; i>=1; i--){
//             result *=i;
//         }
//         return result;
//     }

//2. 재귀
// public long solution(int balls, int share) {
//        long answer = 0;
//
//        answer = factorial(balls) / (factorial(balls - share)) * factorial(share);
//
//        return answer;
//    }
//
//    private long factorial(int n) {
//        if (n == 0) {
//            return 1;
//        } else {
//            return n * factorial(n - 1);
//        }
//    }