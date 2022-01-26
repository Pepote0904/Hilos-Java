public class Main {

    public static void main(String[] args) {

        int[] array1, array2;
        array1 = new int[1000];
        array2 = new int[array1.length];

        for (int n = 0; n<array1.length; n++){
            array1[n]=(int) (Math.random()*100);
            array2[n]=(int) (Math.random()*100);
        }

        /*for (int n = 0; n<array1.length; n++){
            System.out.println(array1[n] + ", " + array2[n]);
        }*/

        Hilo hilo1 = new Hilo(array1);
        Hilo hilo2 = new Hilo(array2);

        hilo1.start();
        hilo2.start();

        while ( hilo1.isAlive() || hilo2.isAlive()){

        }

    }
}
