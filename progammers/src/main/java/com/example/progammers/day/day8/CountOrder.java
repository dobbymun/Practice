package com.example.progammers.day.day8;

import java.util.Arrays;

/** 진료 순서 정하기
 * 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
 * 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 예시
 * emergency가 [3, 76, 24]이므로 응급도의 크기 순서대로 번호를 매긴 [3, 1, 2]를 return합니다.
 */

public class CountOrder {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] ascEmergency = emergency.clone();

        Arrays.sort(ascEmergency);

        for(int i = 0; i < emergency.length; i++){
            for(int j= 0; j< emergency.length; j++){
                if(ascEmergency[i] == emergency[j]){
                    answer[j] = emergency.length - i;
                }
            }
        }

        return answer;
    }

}

//(1)번 방법 오름차순 sort해서 제일 작은 순서부토 length-1로 값 넣어주기
//(2)번 방법 for문으로 해당 숫자보다 큰 값 카운트해서 +1씩 해준 후 결과 저장

//       public int[] solution(int[] emergency) {
//         int[] answer = new int[emergency.length];

//         for(int i = 0; i < answer.length; i++){
//             if(answer[i] != 0){
//                 continue;
//             }
//             int idx = 1;
//             for(int j = 0; j < answer.length; j++){
//                 if(emergency[i] < emergency[j]){
//                     idx++;
//                 }
//             }
//             answer[i] = idx;
//         }
//         return answer;
//     }