package com.example.progammers.day.day9;

import java.util.HashMap;

/** 가위 바위 보
 * 가위는 2 바위는 0 보는 5로 표현합니다. 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
 * rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.
 */

public class RockScissorsPaper {
    public String solution(String rsp) {
        String answer = "";

        //Rock=0 Paper=5 Scissors =2

        HashMap<String, String> winResult = new HashMap<>();
        winResult.put("0", "5");
        winResult.put("2", "0");
        winResult.put("5", "2");

        String[] strArray = rsp.split("");

        for(String s: strArray){

            answer += winResult.get(s);

        }

        return answer;

    }
}
