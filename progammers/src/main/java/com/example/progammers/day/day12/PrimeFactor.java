package com.example.progammers.day.day12;

import java.util.*;

/** 소인수분해
 *  소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다.
 *  예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다. 따라서 12의 소인수는 2와 3입니다.
 *  자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 *
 *  예시
 *  12를 소인수분해하면 2 * 2 * 3 입니다. 따라서 [2, 3]을 return합니다.
 *  17은 소수입니다. 따라서 [17]을 return 해야 합니다.
 *  420을 소인수분해하면 2 * 2 * 3 * 5 * 7 입니다. 따라서 [2, 3, 5, 7]을 return합니다.
 */

public class PrimeFactor {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();

        for(int i=2; i<=n; i++){
            while(n % i == 0){
                n = n/i;
                if(!answer.contains(i))
                    answer.add(i);
            }
        }

        return answer;
    }
}
