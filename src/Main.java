public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i + ")You can still sleep !!!");
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("The battery is changing");
            }
        }
    }
}