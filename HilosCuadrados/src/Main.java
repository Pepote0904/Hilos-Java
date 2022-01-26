public class Main {

    public static void main(String[] args) {

        int[] array1;
        int[] array2;
        array1=new int[5];
        array2= new int[array1.length];
        for (int i = 0; i< array1.length; i++){
            array1[i]=(int) (Math.random()*100);
            array2[i]=(int) (Math.random()*100);
        }

        Hilos hilo1 = new Hilos("Hilo 1", array1);
        Hilos hilo2 = new Hilos("Hilo 2", array2);

        hilo1.setMiArray(array1);
        hilo2.setMiArray(array2);

        hilo1.start();
        hilo2.start();

        while (!hilo1.isTerminado()){
        }

    }
}
