public class Main {

    public static void main(String[] args) {

        int[] array1 = new int [100];
        int[] array2 = new int[array1.length];

        for (int i = 0; i < array1.length; i++){
            array1[i]=(int) (Math.random() *10);
            array2[i]=(int) (Math.random() * 10);
        }

        int valorBuscado = 5;

        Hilo h1 = new Hilo(array1, valorBuscado);
        Hilo h2 = new Hilo(array2, valorBuscado);


        h1.start();
        h2.start();

        while (h1.isAlive() || h2.isAlive()){

        }

        System.out.println("En el primer array el " + valorBuscado + " esta en " + h1.getPosicion());
        System.out.println("En el primer array el " + valorBuscado + " esta en " + h2.getPosicion());
    }
}
