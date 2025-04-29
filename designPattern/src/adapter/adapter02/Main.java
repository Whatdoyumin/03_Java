package adapter.adapter02;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");

        p.PrintWeak();
        p.PrintStrong();
    }
}
