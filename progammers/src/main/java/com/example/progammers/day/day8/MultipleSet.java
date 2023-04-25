package com.example.progammers.day.day8;

/** 순서 쌍의 개수
 * 순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다.
 * 자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요.
 *
 * 예시
 * n이 100 이므로 곱이 100인 순서쌍은 (1, 100), (2, 50), (4, 25), (5, 20), (10, 10), (20, 5), (25, 4), (50, 2), (100, 1) 이므로 9를 return합니다.
 */

public class MultipleSet {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<= n; i++ ){
            if(n % i == 0){
                answer += 1;
            }
        }

        return answer;
    }
}

// [1차 풀이] 아래와 같이 이중 for문으로 결과는 count값이지만
// hashMap 생성해서 만들어보았으나 시간초과로 실패.. => 결과값은 어차피 count 값이므로 약수개수 구하는 방법으로 변경

//    public int solution(int n) {
//    int answer = 0;
//    HashMap<Integer, Integer> map = new HashMap<>();
//
//             for(int i=1; i<= n; i++ ){
//             for(int j=n; j>=1; j--){
//              if(i*j == n){
//                 // map.put(i, j);
//                 answer += 1;
//              }
//
//             }
//         return answer;
//    }
//}
