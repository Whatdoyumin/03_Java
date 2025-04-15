package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x값 입력: ");
        int x = sc.nextInt();

        System.out.print("y값 입력: ");
        int y = sc.nextInt();

        System.out.println("x + y: " + (x + y));
    }
}

