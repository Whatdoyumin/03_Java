package ch14.exam;

public class MusicRunnable extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                System.out.println("음악을 재생합니다.");
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}
