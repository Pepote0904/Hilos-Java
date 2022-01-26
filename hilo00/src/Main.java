public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Hilo1 h1 = new Hilo1("Hilo" + i);
            h1.setPriority((5-i) + 1);
            h1.start();

        }
    }
}
