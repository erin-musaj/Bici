public class Main {

    public static int pos = 1;

    public static void main(String[] args) throws InterruptedException {
          Thread b1 = new Thread(new Bici("Marco", 10));
          Thread b2 = new Thread(new Bici("Giovanni", 20));
          Thread b3 = new Thread(new Bici("Furly", 30));

          b1.start();
          b2.start();
          b3.start();

          b1.join();
          b2.join();
          b3.join();
    }
}