package com.example.progammers.day.day3;

import java.util.*;

/** 최빈값 구하기
 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때,
 * 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
 *
 * 입출력 예
 * [1, 2, 3, 3, 3, 4]에서 1은 1개, 2는 1개, 3은 3개, 4는 1개로 최빈값은 3입니다.
 * [1, 1, 2, 2]에서 1은 2개, 2는 2개로 최빈값이 1, 2입니다. 최빈값이 여러 개이므로 -1을 return 합니다.
 */
public class Mode {
    public int solution(int[] array) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int a : array){                                          //(1) array를 hashmap으로 key(array 실제값)-value(카운트)로 저장
            count.put(a, count.getOrDefault(a, 0) + 1);    // hashMap.getOrDefault(키값, 키값이 없는경우 적용되는 디폴트값) -> 3이 있는 이미 있던 경우 3의 value + 1해준다
        }

        int max = Collections.max(count.values());                   //(2) hashMap 최대값 구하기
        int cnt = 0;                                                 //최빈값이 동일한게 있는 지 카운트하기 위한 변수
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() == max) {                            //(3) hashmap에서 value가 위에서 찾은 max와 동일한 경우(최빈값이 동일한 숫자가 여러개!!) count++
                cnt++;
                result = entry.getKey();
            }
        }

        if(cnt == 1){                                                 //(4) 최빈값 여러개인지 유무에 따라 결과 리턴
            return result;
        } else{
            return -1;
        }

        //return cnt == 1 ? result : -1;
    }
}
