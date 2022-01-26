public class Main {
    public static void main(String[] args) {
        int[] array1;
        int[] array2;
        array1=new int[5];
        array2=new int[5];
        for(int i=0; i< array1.length; i++){
            array1[i]=(int) (Math.random()*2);
            array2[i]=(int) (Math.random()*2);
        }
        /*int suma=0;
        for(int i=0; i<array1.length; i++){
            suma=suma + array1[i];
        }
        System.out.println("La suma es (nuevo): " + suma);*/
        Hilo hilo1=new Hilo("Hilo 1");
        Hilo hilo2=new Hilo("Hilo 2");
        hilo1.setMiArray(array1);
        hilo2.setMiArray(array2);
        hilo1.start();
        hilo2.start();
        while (!hilo1.isTerminado()){
        }
        System.out.println("La suma del array 1 es " + hilo1.getSuma());
        System.out.println("La suma del array 2 es " + hilo2.getSuma());
    }
}