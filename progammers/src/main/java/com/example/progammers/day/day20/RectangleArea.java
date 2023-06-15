package com.example.progammers.day.day20;

/** 직사각형 넒이 구하기
 * 2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다.
 * 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때,
 * 직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
 *
 * 예시
 * dots                                 	result
 * [[1, 1], [2, 1], [2, 2], [1, 2]]	        1
 * [[-1, -1], [1, 1], [1, -1], [-1, 1]]  	4
 *
 * 좌표 [[1, 1], [2, 1], [2, 2], [1, 2]] 를 꼭짓점으로 갖는 직사각형의 가로, 세로 길이는 각각 1, 1이므로 직사각형의 넓이는 1 x 1 = 1입니다.
 * 좌표 [[-1, -1], [1, 1], [1, -1], [-1, 1]]를 꼭짓점으로 갖는 직사각형의 가로, 세로 길이는 각각 2, 2이므로 직사각형의 넓이는 2 x 2 = 4입니다.
 */

public class RectangleArea {
    public int solution(int[][] dots) {
        int minX = dots[0][0];
        int maxX = dots[0][0];
        int minY = dots[0][1];
        int maxY = dots[0][1];
        int width = 0;
        int height = 0;

        for(int i=1; i < 4; i++){
            if(dots[i][0] < minX ) minX = dots[i][0];

            if(dots[i][0] > maxX) maxX = dots[i][0];

            if (dots[i][1] < minY) minY = dots[i][1];

            if (dots[i][1] > maxY) maxY = dots[i][1];

        }
        width = maxX - minX;
        height = maxY - minY;

        return width*height;
    }
}

//직사각형 넒이 = 가로 크기 * 세로 크기;
//minA = Math.min(minA, dots[i][0]);
