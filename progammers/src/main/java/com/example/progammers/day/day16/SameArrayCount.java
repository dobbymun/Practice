package com.example.progammers.day.day16;

/** 배열의 유사도
 * 두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
 */

public class SameArrayCount {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for(String st1 : s1){
            for(String st2: s2){
                if(st1.equals(st2)){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}

// public int solution(String[] s1, String[] s2) {
//         Set<String> set = new HashSet<>(Arrays.asList(s1));
//         return (int)Arrays.stream(s2).filter(set::contains).count();
//     }


// return (int) Arrays.stream(s1).map(s -> Arrays.stream(s2).collect(Collectors.toList()).contains(s)).filter(b -> b).count();

