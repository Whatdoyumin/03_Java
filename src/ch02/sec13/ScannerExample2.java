package ch02.sec13;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.print("입력 문자열: ");
            String x = sc.next();

            if (x.equals("q")) {
                break;
            }
            System.out.println("출력 문자열: " + x);
            System.out.println();
        }
    }
}
