package com.example.progammers.day.day24;

/** 치킨 쿠폰
 * 프로그래머스 치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다.
 * 쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다.
 * 시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때 받을 수 있는 최대 서비스 치킨의 수를 return하도록 solution 함수를 완성해주세요.
 *
 * 예시
 * chicken	result
 * 100	     11
 * 1,081	120
 *
 * 100마리를 주문하면 쿠폰이 100장 발급되므로 서비스 치킨 10마리를 주문할 수 있습니다.
 * 10마리를 주문하면 쿠폰이 10장 발급되므로 서비스 치킨 1마리를 주문할 수 있습니다.
 * 따라서 10 + 1 = 11 을 return합니다.
 */

public class ChickenCoupon {
    public int solution(int chicken) {

        int answer = 0;

        while( chicken >= 10 )
        {
            answer += chicken / 10;
            chicken = ( chicken / 10 ) + ( chicken % 10 );
        }

        return answer;
    }
}

//         int coupon = chicken;

//         int service = 0;
//         int mod = 0;
//         int ans = 0;

//         while(coupon >=10){
//             service = coupon/10;
//             mod = coupon%10;
//             ans += service;

//             coupon = service+mod;

//         }

//         return ans;
//     }