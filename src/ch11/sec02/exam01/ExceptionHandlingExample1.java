package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        // int result = data.length();
        // System.out.println("문자 수: " + result);

        // 문제점
        /*
         * 12번째 줄에서 printLength()의 data가 null이기 때문에 NullPointerException 에러가 발생한다.
         * */

        // 예외처리 코드 추가
        try {
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
//            System.out.println(e.toString());
//            e.printStackTrace();
        } finally {
            System.out.println("[마무리 실행]\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}
