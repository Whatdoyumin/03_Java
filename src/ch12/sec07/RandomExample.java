package ch12.sec07;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        // 선택 번호
        int[] selectNumbers = new int[6];
        Random random = new Random(3);
        System.out.print("선택 번호: ");
        for (int i = 0; i < 6; i++) {
            selectNumbers[i] = random.nextInt(45) + 1;
            System.out.print(selectNumbers[i] + " ");
        }
        System.out.println();

        // 당첨 번호
        int[] winningNumbers = new int[6];
        random = new Random(5);
        System.out.print("당첨 번호: ");
        for (int i = 0; i < 6; i++) {
            winningNumbers[i] = random.nextInt(45) + 1;
            System.out.print(winningNumbers[i] + " ");
        }
        System.out.println();

        // 당첨 여부, 비교하기 전에 배열 항목을 정렬
        Arrays.sort(selectNumbers);
        Arrays.sort(winningNumbers);
        boolean result = Arrays.equals(selectNumbers, winningNumbers);
        if (result) {
            System.out.println("1등에 당첨되셨습니다.");
        } else {
            System.out.println("당첨되지 않았습니다.");
        }
    }
}
