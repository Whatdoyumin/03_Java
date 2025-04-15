package ch05.sec14;

import java.util.Scanner;

public class BankExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        while(true) {
            System.out.println("--------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("--------------------------------------");

            System.out.print("선택> ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("예금액> ");
                    int income = sc.nextInt();
                    total += income;
                    System.out.println();
                    continue;
                case 2:
                    System.out.print("출금액> ");
                    int outcome = sc.nextInt();
                    total -= outcome;
                    System.out.println();
                    continue;
                case 3:
                    System.out.println("잔고> " + total);
                    System.out.println();
                    continue;
                case 4:
                    System.out.println("프로그램 종료");
                    break;
            }
            break;
        }
    }
}
