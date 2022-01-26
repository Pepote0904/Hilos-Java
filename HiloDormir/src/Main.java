public class Main {

    public static void main(String[] args) {

        Hilo h1, h2, h3;

        h1=new Hilo("Juanito");
        h2= new Hilo("Pepito");
        h3 = new Hilo("Pepita");

        h1.start();
        h2.start();
        h3.start();
    }
}
