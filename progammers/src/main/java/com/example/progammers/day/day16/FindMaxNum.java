package com.example.progammers.day.day16;

/**가장 큰 수 찾기
 * 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 예시
 * array	         result
 * [1, 8, 3]	     [8, 1]
 * [9, 10, 11, 8]	[11, 2]
 *
 * 1, 8, 3 중 가장 큰 수는 8이고 인덱스 1에 있습니다.
 */
public class FindMaxNum {

    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = array[0];
        int index = 0;

        for(int i=1; i<array.length; i++){
            if(array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        answer[0] = max;
        answer[1] = index;


        return answer;
    }
}
