package ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        Thread movieThread = new MovieThread();
        Thread musicRunnable = new MusicRunnable();

        movieThread.start();
        musicRunnable.start();
    }
}
