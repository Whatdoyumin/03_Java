package adapter.adapter02;

import adapter.adapter01.Banner;

public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void PrintWeak() {
        banner.showWithParen(); //기능 위임
    }

    @Override
    public void PrintStrong() {
        banner.showWithAster(); // 기능 위임
    }
}
