package com.example.progammers.day.day3;

/** 짝수는 싫어요
 * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 */

public class hateEven {

    public int[] solution(int n) {
        int[] answer;
        int k = 0;

        if(n % 2 == 0){
            answer= new int[n/2];
        }else {
            answer= new int[n/2+1];
        }


        for(int i=1; i<=n; i++){
            if((i%2)==1){
                answer[k] = i;   // 인덱스를 i-1로 해보려고 했으나, out of bound index 애러 남. 별도 인덱스 k를 for문 밖에서 선언해서 해결
                k++;
            }
        }
        return answer;

    }

//    public int[] solution(int n) {
//        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
//    }

}
