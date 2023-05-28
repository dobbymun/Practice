package com.example.progammers.day.day15;
import java.util.*;

/** 한 번만 등장한 문자
 * 문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
 * 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
 */

public class CountChar {
    public String solution(String s) {
        String answer = "";

        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);

        for(int i=0; i<charArray.length; i++){
            int count = s.length() - s.replace(String.valueOf(charArray[i]), "").length(); // 문자열 카룬트 방법!

            if(count ==1) answer += charArray[i];
        }


        return answer;
    }
}

