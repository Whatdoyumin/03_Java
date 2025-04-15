package ch05.sec14;

import java.util.Scanner;

public class ScoreExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int[] arr = null; // ⚠️ 배열 초기화를 null로, 이후에 학생 수에 따라 생성

        while(true) {
            System.out.println("----------------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수 입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("----------------------------------------------------------");

            System.out.print("선택> ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("학생수> ");
                    num = sc.nextInt();
                    arr = new int[num]; // ⚠️ 학생 수만큼 배열 한 번만 생성
                    break;

                case 2:
                    if (arr == null) {
                        System.out.println("먼저 학생 수를 입력하세요.");
                        break;
                    }
                    for(int i = 0; i < num; i++) {
                        System.out.print("score[" + i + "]> ");
                        arr[i] = sc.nextInt();
                    }
                    break;

                case 3:
                    if (arr == null) {
                        System.out.println("점수가 없습니다. 먼저 입력해주세요.");
                        break;
                    }
                    for(int i = 0; i < num; i++) {
                        System.out.println("score[" + i + "] = " + arr[i]);
                    }
                    break;

                case 4:
                    if (arr == null) {
                        System.out.println("점수가 없습니다. 먼저 입력해주세요.");
                        break;
                    }
                    System.out.println("최고 점수: " + MaxValue(arr));
                    System.out.println("평균 점수: " + AvgValue(arr));
                    break;

                case 5:
                    System.out.println("프로그램 종료");
                    return; // 완전 종료

                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }

    static int MaxValue(int[] arr) {
        int max = arr[0];
        for (int num: arr) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    static double AvgValue(int[] arr) {
        int sum = 0;
        for (int num: arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}