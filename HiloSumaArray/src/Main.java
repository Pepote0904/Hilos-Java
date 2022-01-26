public class Main {

    public static void main(String[] args) {
	int[] array1;
    int[] array2;

    array1 = new int[100];
    array2 = new int[array1.length];

    for (int i = 0; i< array1.length; i++){
        array1[i] = (int) (Math.random()*10);
        array2[i] = (int) (Math.random()*10);
    }

    HiloSumador h1 = new HiloSumador("Hilo 1");
    HiloSumador h2 = new HiloSumador("Hilo 2");

    h1.setMiArray(array1);
    h2.setMiArray(array2);

    h1.start();
    h2.start();

    while (h1.isAlive() || h2.isAlive()){

    }

        System.out.println("La suma del array1 es de " + h1.getSuma());
        System.out.println("La suma del array2 es de " + h2.getSuma());
    }
}
