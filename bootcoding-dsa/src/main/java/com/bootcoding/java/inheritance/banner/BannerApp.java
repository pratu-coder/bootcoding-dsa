package main.java.com.bootcoding.java.inheritance.banner;

public class BannerApp {
    public static void main(String[] args) {
        FlexBanner fb = new FlexBanner();
        fb.matter = "new batches of java is starting soon";
        fb.type = "Flex Banner";
        fb.create();
        fb.display();
        System.out.println(fb.matter);
        System.out.println(fb.type);
    }

}
