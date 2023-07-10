package com.example.progammers.level.lv1;

/**[1차] 비밀지도
 *네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다.
 * 그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다. 다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.
 *
 * 지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 "공백"(" ") 또는 "벽"("#") 두 종류로 이루어져 있다.
 * 전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 "지도 1"과 "지도 2"라고 하자. 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다. 지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
 * "지도 1"과 "지도 2"는 각각 정수 배열로 암호화되어 있다.
 * 암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
 *
 * 입력 형식
 * 입력으로 지도의 한 변 크기 n 과 2개의 정수 배열 arr1, arr2가 들어온다.
 *
 * 예시
 * 매개변수	     값
 * n	         5
 * arr1	      [9, 20, 28, 18, 11]             -> 9를 2진수 변환하면 01001
 * arr2	      [30, 1, 21, 17, 28]
 * 출력	      ["#####","# # #", "### #", "# ##", "#####"]
 *
 */

public class SecretMap1 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[] b1= convertBinaryString(arr1, n);
        String[] b2= convertBinaryString(arr2, n);

        return sumBinaryString(b1, b2, n);
    }

    //1. 10진수 1개 배열 받아 이진수 배열 리턴 메소드
    public static String[] convertBinaryString(int[] arr, int n){
        String[] binary = new String[arr.length];

        for(int i=0; i<arr.length; i++){
            String s0 = "";
            String tmpB = "";

            tmpB = Integer.toBinaryString(arr[i]);

            if(tmpB.length() < n) {                          //자리수 맞추기용 00110 인 경우 Integer.toBinaryString()하면 앞에 0이 사라짐
                for(int j=0; j< n- tmpB.length(); j++) {
                    s0 += "0";
                }
            }
            binary[i] = s0 + tmpB;
        }
        return binary;
    }

    //2. 이진수 배열 2개 받아 1이면 #, 0이면 공백으로 변환 후 리턴 메소드
    public static String[] sumBinaryString(String[] arr1, String[] arr2, int n){

        String[] sumMap = new String[n];

        for(int i=0; i < n; i++){
            char[] tmp1 = arr1[i].toCharArray();
            char[] tmp2 = arr2[i].toCharArray();
            char[] tmpSum = new char[tmp1.length];

            for(int j= 0; j< tmp1.length; j++){
                if(tmp1[j] == '1' || tmp2[j] =='1'){
                    tmpSum[j] = '#';
                } else{
                    tmpSum[j] = ' ';
                }
            }
            sumMap[i] = String.valueOf(tmpSum);
        }
        return sumMap;
    }
}

// 다른 풀이1
// public String[] solution(int n, int[] arr1, int[] arr2) {
//        String[] result = new String[n];
//        for (int i = 0; i < n; i++) {
//            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);   //*or연산자(|) : 두 값 중 하나라도 1이면 1, 두 값 모두 1이면 0으로 처리
//        }
//
//        for (int i = 0; i < n; i++) {
//            result[i] = String.format("%" + n + "s", result[i]);  // 자릿수 맞춰주는 방법 1
//            result[i] = result[i].replaceAll("1", "#");
//            result[i] = result[i].replaceAll("0", " ");
//        }
//
//        return result;
//    }

// 다른 풀이2
// public String[] solution(int n, int[] arr1, int[] arr2) {
//      String[] answer = new String[n];
//      String temp;
//
//      for(int i = 0 ; i < n ; i++){
//          temp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));  // 자릿수 맞춰주는 방법 2 - 16자리로 맞추고 substring으로 잘라줌
//          temp = temp.substring(temp.length() - n);
//          temp = temp.replaceAll("1", "#");
//          temp = temp.replaceAll("0", " ");
//          answer[i] = temp;
//      }
//
//      return answer;
//  }

//다른 풀이 3
//public String[] solution(int n, int[] arr1, int[] arr2) {
//        String[] answer = new String[n];
//        for(int i = 0; i < n; i++) {
//            String bi = Integer.toBinaryString(arr1[i] | arr2[i]);
//            bi = "0".repeat(n - bi.length()) + bi;
//            answer[i] = bi.replaceAll("1", "#").replaceAll("0", " ");
//        }
//        return answer;
//    }