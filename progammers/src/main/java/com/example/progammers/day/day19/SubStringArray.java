package com.example.progammers.day.day19;

/** 잘라서 배열로 저장하기
 * 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 예시
 * "abc1Addfggg4556b" 를 길이 6씩 잘라 배열에 저장한 ["abc1Ad", "dfggg4", "556b"]를 return해야 합니다.
 * "abcdef123" 를 길이 3씩 잘라 배열에 저장한 ["abc", "def", "123"]를 return해야 합니다.
 *
 * 유의사항
 * 입출력 예 #1의 경우 "abc1Addfggg4556b"를 길이 6씩 자르면
 * "abc1Ad", "dfggg4" 두개와 마지막 "556b"가 남습니다. 이런 경우 남은 문자열을 그대로 배열에 저장합니다.
 */

public class SubStringArray {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[ (int) Math.ceil(my_str.length()/(n*1.0))];
        int idx = 0;
        int start = 0;

        while(start < my_str.length()){

            if( start + n > my_str.length()+1){
                answer[idx] = my_str.substring(start);
            } else{
                answer[idx] = my_str.substring(start, start + n);
            }
            start = start+n;
            idx++;
        }

        return answer;
    }
}
//int end = start + n >= my_str.length()? my_str.length(): start + n;