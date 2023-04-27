package com.example.progammers.day.day9;

import java.util.*;

/** 모스부호 1
 *머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
 * 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
 * 문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
 * 모스부호는 다음과 같습니다.
 * morse = {
 *     '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
 *     '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
 *     '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
 *     '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
 *     '-.--':'y','--..':'z'
 * }
 *
 * 제한사항
 * letter는 공백으로 구분됩니다.
 *
 * 예시
 * letter가 ".... . .-.. .-.. ---" 는 "hello"가 리턴됩니다.
 */

public class Morse1 {
    public String solution(String letter) {
        String answer = "";
        String[] letterList = letter.split(" ");
        String word="";
        HashMap<String, String> m = new HashMap<>();

        m.put(".-","a");m.put("-...","b");m.put("-.-.","c");m.put("-..","d");m.put(".","e");
        m.put("..-.","f");m.put("--.","g");m.put("....","h");m.put("..","i");m.put(".---","j");
        m.put("-.-","k");m.put(".-..","l");m.put("--","m");m.put("-.","n");m.put("---","o");
        m.put(".--.","p");m.put("--.-","q");m.put(".-.","r");m.put("...","s");m.put("-","t");
        m.put("..-","u");m.put("...-","v");m.put(".--","w");m.put("-..-","x");
        m.put("-.--","y");m.put("--..","z");

        for(int i=0; i<letterList.length; i++){
            word= letterList[i];
            answer += m.get(word); // hashMap 반복문 없이  map.get("검색 key 값") 하면 키에 맞는 value 리턴됨
        }

        return answer;
    }
}