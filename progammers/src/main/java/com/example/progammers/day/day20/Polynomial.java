package com.example.progammers.day.day20;

/** 다항식 더하기
 * 한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다.
 * 다항식을 계산할 때는 동류항끼리 계산해 정리합니다. 덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때,
 * 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요. 같은 식이라면 가장 짧은 수식을 return 합니다.
 *
 * 예시
 * polynomial	    result
 * "3x + 7 + x"	   "4x + 7"
 * "x + x + x"	   "3x"
 *
 * "3x + 7 + x"에서 동류항끼리 더하면 "4x + 7"입니다.
 * "x + x + x"에서 동류항끼리 더하면 "3x"입니다.
 */

public class Polynomial {
    public String solution(String polynomial) {
        String answer = "";
        int num = 0;
        String xCount = "";
        int xSum = 0;
        String[] string = polynomial.split(" ");

        for(int i=0; i< string.length; i+=2){
            if(string[i].contains("x")){
                string[i] = string[i].replace("x", "");
                if( string[i].equals("")){
                    xSum++;
                }else{
                    xSum += Integer.valueOf(string[i].replace("x", ""));
                }
            }else{
                num += Integer.valueOf(string[i]);
            }
        }

        if(num == 0){
            if(xSum == 1) {
                answer = "x";
            }else if(xSum == 0){
                answer = 0 +"";
            } else{
                answer = xSum + "x";
            }

        } else{
            if(xSum == 1) {
                answer = "x + " + num;
            } else if(xSum == 0){
                answer = num + "";
            } else{
                answer = xSum + "x + " + num;
            }
        }

        return answer;
    }
}