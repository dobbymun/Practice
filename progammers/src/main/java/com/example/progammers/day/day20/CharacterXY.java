package com.example.progammers.day.day20;

/** 캐릭터의 좌표
 * 머쓱이는 RPG게임을 하고 있습니다. 게임에는 up, down, left, right 방향키가 있으며
 * 각 키를 누르면 위, 아래, 왼쪽, 오른쪽으로 한 칸씩 이동합니다.
 * 예를 들어 [0,0]에서 up을 누른다면 캐릭터의 좌표는 [0, 1], down을 누른다면 [0, -1], left를 누른다면 [-1, 0], right를 누른다면 [1, 0]입니다.
 * 머쓱이가 입력한 방향키의 배열 keyinput와 맵의 크기 board이 매개변수로 주어집니다.
 * 캐릭터는 항상 [0,0]에서 시작할 때 키 입력이 모두 끝난 뒤에 캐릭터의 좌표 [x, y]를 return하도록 solution 함수를 완성해주세요.
 *
 * [0, 0]은 board의 정 중앙에 위치합니다.
 * 예를 들어 board의 가로 크기가 9라면 캐릭터는 왼쪽으로 최대 [-4, 0]까지 오른쪽으로 최대 [4, 0]까지 이동할 수 있습니다.
 *
 * 제한 사항
 * board은 [가로 크기, 세로 크기] 형태로 주어집니다.
 * board의 가로 크기와 세로 크기는 홀수입니다.
 * board의 크기를 벗어난 방향키 입력은 무시합니다.
 * keyinput은 항상 up, down, left, right만 주어집니다.
 *
 * 예시
 * keyinput	board	result
 * ["left", "right", "up", "right", "right"]	[11, 11]	[2, 1]
 * ["down", "down", "down", "down", "down"]	[7, 9]	[0, -4]
 *
 * [0, 0]에서 왼쪽으로 한 칸 오른쪽으로 한 칸 위로 한 칸 오른쪽으로 두 칸 이동한 좌표는 [2, 1]입니다
 * [0, 0]에서 아래로 다섯 칸 이동한 좌표는 [0, -5]이지만 맵의 세로 크기가 9이므로 아래로는 네 칸을 넘어서 이동할 수 없습니다. 따라서 [0, -4]를 return합니다.
 */

public class CharacterXY {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int maxX = board[0]/2;
        int maxY = board[1]/2;

        for(String key: keyinput){
            switch (key) {
                case "left":
                    if(maxX >= Math.abs(answer[0]-1))
                        answer[0]--;
                    break;
                case "right":
                    if(maxX  >=  Math.abs(answer[0]+1))
                        answer[0]++;
                    break;
                case "up":
                    if(maxY >= Math.abs(answer[1]+1))
                        answer[1]++;
                    break;
                case "down":
                    if(maxY >= Math.abs(answer[1]-1))
                        answer[1]--;
                    break;
            }
        }

        return answer;
    }
}

