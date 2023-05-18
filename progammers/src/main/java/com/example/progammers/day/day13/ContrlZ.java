package com.example.progammers.day.day13;

import java.util.Stack;

/** 컨트롤 제트
 * 숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다. 문자열에 있는 숫자를 차례대로 더하려고 합니다.
 * 이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다.
 * 숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.
 *
 * 예시
 *       s	       result
 * "1 2 Z 3"    	 4
 * "10 20 30 40"	100
 * "-1 -2 -3 Z"	    -3
 *
 * 설명
 * 10 + 20 + 30 + 40 = 100을 return 합니다.
 * "10 Z 20 Z 1"에서 10 다음 Z, 20 다음 Z로 10, 20이 지워지고 1만 더하여 1을 return 합니다.
 */

public class ContrlZ {
    public int solution(String s) {
        int answer = 0;

        String[] strArr = s.split(" ");

        Stack<Integer> st = new Stack();        // 1. Stack 이용 방식 - push() , pop() -> Stack도 <데이터 타입> 지정 가능

        for(String s1: strArr){
            if(s1.equals("Z")){
                st.pop();
            } else{
                st.push(Integer.valueOf(s1));
            }
        }

        while(!st.empty()){
            answer += st.pop();
        }

        return answer;
    }
}

//         String[] strArr = s.split(" ");
//
//         for(int i= 0; i<strArr.length; i++){                   // 2. if문 분기 처리 - 기본 인덱스 조작 (i-1)
//             if(strArr[i].equals("Z")){
//                 answer -= Integer.valueOf(strArr[i-1]);
//             } else{
//                 answer += Integer.valueOf(strArr[i]);
//             }
//         }