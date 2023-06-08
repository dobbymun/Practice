package com.example.progammers.day.day21;

/** 안전지대
 * 다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
 * 지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
 * 지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * board는 n * n 배열입니다.
 * 1 ≤ n ≤ 100
 * 지뢰는 1로 표시되어 있습니다.
 * board에는 지뢰가 있는 지역 1과 지뢰가 없는 지역 0만 존재합니다.
 *
 * 예시
 *                                        board	                                                                              result
 * [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 0, 0], [0, 0, 0, 0, 0]]	                                    16
 * [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 1, 0], [0, 0, 0, 0, 0]]	                                    13
 * [[1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1]]	    0
 *
 * (3, 2)에 지뢰가 있으므로 지뢰가 있는 지역과 지뢰와 인접한 위, 아래, 좌, 우, 대각선 총 8칸은 위험지역입니다. 따라서 16을 return합니다.
 * (3, 2), (3, 3)에 지뢰가 있으므로 지뢰가 있는 지역과 지뢰와 인접한 위, 아래, 좌, 우, 대각선은 위험지역입니다. 따라서 위험지역을 제외한 칸 수 13을 return합니다.
 * 모든 지역에 지뢰가 있으므로 안전지역은 없습니다. 따라서 0을 return합니다.
 */

public class FindBomb {
    class Solution {
        public int solution(int[][] board) {
            int length = board[0].length;

            int[][] dangerBoard = new int[length][length];

            // 1. 지뢰찾기
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    if (board[i][j] == 1) danger(i, j, dangerBoard);
                }
            }
            return countDanger(dangerBoard);
        }

        // 2. 위험지역 표시
        public void danger(int i, int j, int[][] dangerBoard) {
            int length = dangerBoard[0].length;

            dangerBoard[i][j] = 1;

            //상하좌우
            if (i != length - 1) dangerBoard[i + 1][j] = 1;
            if (j != length - 1) dangerBoard[i][j + 1] = 1;
            if (i - 1 >= 0) dangerBoard[i - 1][j] = 1;
            if (j - 1 >= 0) dangerBoard[i][j - 1] = 1;

            //대각선
            if (i - 1 >= 0 && j - 1 >= 0) dangerBoard[i - 1][j - 1] = 1;
            if (i - 1 >= 0 && j + 1 <= length - 1) dangerBoard[i - 1][j + 1] = 1;
            if (i + 1 <= length - 1 && j + 1 <= length - 1) dangerBoard[i + 1][j + 1] = 1;
            if (i + 1 <= length - 1 && j - 1 >= 0) dangerBoard[i + 1][j - 1] = 1;

        }

        //3. 카운트 int 타입
        public int countDanger(int[][] dangerBoard) {
            int answer = 0;
            int length = dangerBoard[0].length;

            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {

                    if (dangerBoard[i][j] == 0) answer++;
                }
            }
            return answer;
        }

    }
}