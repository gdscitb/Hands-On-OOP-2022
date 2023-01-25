package utils;

public class Loading {
    public static void loading(int duration) {
        try {
            System.out.print("Loading..");
            Thread.sleep(duration);
            System.out.println(".");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
