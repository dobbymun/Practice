package com.example.progammers.day.day14;

/** 기까운 수
 * 정수 배열 array와 정수 n이 매개변수로 주어질 때,
 * array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
 * 가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.
 *
 * 예시
 * array        	n	result
 * [3, 10, 28]	   20	28
 * [10, 11, 12]	   13	12
 * [5, 9, 10, 2]   6    5
 *
 * 설명
 * 10, 11, 12 중 13과 가장 가까운 수는 12입니다.
 */

public class CloseNum {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 0;
        for(int num : array){
            if(answer == 0){
                answer = num;
                min = Math.abs(num - n);  // abs로 차이 계산
            }else{
                if(Math.abs(num - n) < min){
                    answer = num;
                    min = Math.abs(num - n);
                }else if( Math.abs(num - n) == min && num < answer){
                    answer = num;
                }
            }
        }
        return answer;
    }

}


//
//         Arrays.sort(array);

//         int answer = array[0];

//         if(n <= array[0]){
//             return answer;
//         } else{
//             int min = n - array[0];

//             for(int i = 1; i < array.length; i++){
//             if(n >= array[i]){
//                 if( n - array[i] < min) {
//                     min = n - array[i];
//                     answer = array[i];
//                 }

//             } else{
//                 if( array[i] - n < min) {
//                     min = array[i] - n;
//                     answer = array[i];
//                 }
//             }
//          }
//         }

//         return answer;
//}
