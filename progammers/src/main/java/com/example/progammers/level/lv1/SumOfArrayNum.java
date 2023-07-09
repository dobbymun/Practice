package com.example.progammers.level.lv1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/** 두 개 뽑아서 더하기
 * 정수 배열 numbers가 주어집니다.
 * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를
 * 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * numbers의 길이는 2 이상 100 이하입니다.
 * numbers의 모든 수는 0 이상 100 이하입니다.
 *
 * 예시
 * numbers	result
 * [2,1,3,4,1]	[2,3,4,5,6,7]
 * [5,0,2,7]	[2,5,7,9,12]
 *
 * 2 = 1 + 1 입니다. (1이 numbers에 두 개 있습니다.)
 * 3 = 2 + 1 입니다.
 * 4 = 1 + 3 입니다.
 */

public class SumOfArrayNum {
    public int[] solution(int[] numbers) {
        List<Integer> numberList = new ArrayList<>();

        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length ; j++){
                numberList.add(numbers[i] + numbers[j]);
            }
        }

        //1. ArrayList -> int[]
        int[] intArray = numberList.stream().mapToInt(i -> i).toArray();

        //2. int[]를 sort + distinct
        int[] answer = IntStream.of(intArray).distinct().sorted().toArray();
        return answer;
    }
}