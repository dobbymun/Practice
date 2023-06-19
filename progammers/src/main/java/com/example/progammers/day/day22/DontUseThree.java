package com.example.progammers.day.day22;

/** 저주의 숫자 3
 * 3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다. 3x 마을 사람들의 숫자는 다음과 같습니다.
 *
 * 예시
 * 10진법   3x 마을에서 쓰는 숫자	|  10진법	    3x 마을에서 쓰는 숫자
 * 1	          1	                6	         8
 * 2	          2	                7	        10
 * 3	          4                	8	        11
 * 4	          5	                9	        14
 * 5	          7	               10	        16
 *
 */

public class DontUseThree {

    public int solution(int n) {
        int plus = 0;
        int answer = 0;

        for(int i=1; i <= n+plus; i++){
            if(i% 3 == 0 || i% 10 == 3 || i/10 == 3 || i/10 == 13 ) {
                plus++;
            }
        }
        answer = n + plus;
        return answer;
    }
}

// String str;
// for (int i = 1; i <= n; i++){
//     str = ""+i;
//     if(str.contains("3") || i%3 == 0) n++;
// }
// return n;