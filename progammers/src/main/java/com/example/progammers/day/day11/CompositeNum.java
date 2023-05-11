package com.example.progammers.day.day11;

/** 합성수 찾기
 * 약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
 * 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
 *
 * 예시
 * 10 이하 합성수는 4, 6, 8, 9, 10 로 5개입니다. 따라서 5를 return합니다.
 * 15 이하 합성수는 4, 6, 8, 9, 10, 12, 14, 15 로 8개입니다. 따라서 8을 return합니다.
 */
public class CompositeNum {

    public int solution(int n) {
        int answer = 0;

        for(int i=n; i>=4; i--){
            int count = 0;

            for(int j=i; j>=1; j--){
                if(i%j == 0){
                    count++;
                }
            }
            if(count >= 3){
                answer++;
            }
        }

        return answer;
    }
}
