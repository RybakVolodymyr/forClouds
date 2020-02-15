public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(2000);
                System.out.println(i + ") Wake up !!! You have the first lesson !!!");
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("The alarm clock is broken");
            }
        }
    }
}