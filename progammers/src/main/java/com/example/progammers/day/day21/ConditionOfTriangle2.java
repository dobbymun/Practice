package com.example.progammers.day.day21;

/** 삼각형의 완성조건 (2)
 * 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
 *
 * 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
 * 삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 나머지 한 변이 될 수 있는 정수의 개수를 return하도록 solution 함수를 완성해주세요.
 *
 * 예시
 * sides	result
 * [1, 2]	1
 * [3, 6]	5
 * [11, 7]	13
 *
 * 입출력 예 1
 * 두 변이 1, 2 인 경우 삼각형을 완성시키려면 나머지 한 변이 2여야 합니다. 따라서 1을 return합니다.
 *
 * 입출력 예 2
 * 가장 긴 변이 6인 경우 -> 될 수 있는 나머지 한 변은 4, 5, 6 로 3개입니다.
 * 나머지 한 변이 가장 긴 변인 경우 -> 될 수 있는 한 변은 7, 8 로 2개입니다.
 * 따라서 3 + 2 = 5를 return합니다.
 *
 * 입출력 예 3
 * 가장 긴 변이 11인 경우 -> 될 수 있는 나머지 한 변은 5, 6, 7, 8, 9, 10, 11 로 7개입니다.
 * 나머지 한 변이 가장 긴 변인 경우 -> 될 수 있는 한 변은 12, 13, 14, 15, 16, 17 로 6개입니다.
 * 따라서 7 + 6 = 13을 return합니다.
 */

public class ConditionOfTriangle2 {

    public int solution(int[] sides) {
        int answer = 0;
        int sidesMin = Math.min(sides[0], sides[1]);
        int sidesMax = Math.max(sides[0], sides[1]);

        for(int i= sidesMax; sidesMin+i >sidesMax ; i--){
            answer++;
        }

        for(int i=sidesMin+sidesMax-1; i>sidesMax; i--){
            answer++;
        }

        return answer;
    }

}
