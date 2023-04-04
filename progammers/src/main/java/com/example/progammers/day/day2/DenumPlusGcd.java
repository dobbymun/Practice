package com.example.progammers.day.day2;

/** 분수의 덧셈
 * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */

public class DenumPlusGcd {

    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int denum = denum1*num2 + denum2*num1;
        int num = num1*num2;
        int gcd = getGcd(denum,num);
        int[] answer = {denum/gcd, num/gcd};
        return answer;
    }

    public int getGcd(int num1, int num2){
        if(num1 % num2 == 0) {
            return num2;
        }
        else{
            return getGcd(num2 , num1 % num2);
        }
    }
}
