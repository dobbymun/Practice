package com.example.progammers.day.day10;

/** 공 던지기
 *
 * 머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다. 공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다.
 * 친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때, k번째로 공을 던지는 사람의 번호는 무엇인지 return 하도록 solution 함수를 완성해보세요.
 *
 * 예시
 * [1, 2, 3, 4] - 1번은 첫 번째로 3번에게 공을 던집니다. 3번은 두 번째로 1번에게 공을 던집니다. k= 2일때 answer = 3
 * [1, 2, 3] - 1번은 첫 번째로 3번에게 공을 던집니다. 3번은 두 번째로 2번에게 공을 던집니다. 2번은 세 번째로 1번에게 공을 던집니다. k= 3일때 answer = 2
 */
public class NextBalls {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int[] numArray = new int[k];
        int index = 0;

        if(numbers.length % 2 == 0){

            for(int i=0; i < k; i++){
                numArray[i] = numbers[index];
                if(numArray[i] == numbers.length-1){
                    index = 0;
                } else{
                    index += 2;
                }
            }
        } else{
            for(int i=0; i<k; i++){
                numArray[i] = numbers[index];
                if(numArray[i] == numbers.length){
                    index = 1;
                } else if(numArray[i] == numbers.length-1){
                    index = 0;
                } else{
                    index += 2;
                }
            }
        }

        answer = numArray[k-1];
        return answer;
    }
}

// public int solution(int[] numbers, int k) {
//        int count = 0;
//        int answer = 0;
//        for(int i=0; i<k-1; i++) {
//            count = count + 2;
//            if(count > numbers.length-1) {
//               count =  count - numbers.length;
//            }
//            answer = numbers[count];
//        }
//
//        return answer;
//    }
