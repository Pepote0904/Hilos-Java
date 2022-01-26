public class Main {

    public static void main(String[] args) {

        int[] array1, array2;
        array1 = new int[5];
        array2 = new int[array1.length];

        for (int i = 0; i< array1.length; i++){
            array1[i] = (int) (Math.random()*10000);
            array2[i] = (int) (Math.random()*10000);
        }

        HiloProf hilo1 = new HiloProf(array1);
        HiloProf hilo2 = new HiloProf(array2);

        hilo1.start();
        hilo2.start();

        while (hilo1.isAlive() || hilo2.isAlive()){

        }

        if (hilo1.getMaximo2() > hilo2.getMaximo2()){
            System.out.println("El maximo es del hilo1 y vale " + hilo1.getMaximo2());
        } else {
            System.out.println("El maximo es del hilo2 y vale " + hilo1.getMaximo2());
        }

        if (hilo1.getMinimo2() < hilo2.getMinimo2()){
            System.out.println("El minimo es del hilo1 y vale " + hilo1.getMinimo2());
        } else {
            System.out.println("El minimo es del hilo2 y vale " + hilo1.getMinimo2());
        }
    }

}
