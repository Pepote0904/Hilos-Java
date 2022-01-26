public class Main {

    public static void main(String[] args) {
	int[] array1, array2;

    array1=new int[1000];
    array2=new int[array1.length];
        for(int i=0; i< array1.length; i++){
            array1[i]=(int) (Math.random()*1000);
            array2[i]=(int) (Math.random()*1000);
        }

        Hilo hilo1=new Hilo(array1);
        Hilo hilo2=new Hilo(array2);

        hilo1.start();
        hilo2.start();



        while (hilo1.isAlive() || hilo2.isAlive()){

        }

        if (hilo1.getSuma()>hilo2.getSuma()){
            System.out.println("Hilo 1 es mayor: " + hilo1.getSuma());
        }else{
            System.out.println("Hilo 2 es mayor: " + hilo2.getSuma());
        }

    }
}
