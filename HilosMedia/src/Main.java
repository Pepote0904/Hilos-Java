public class Main {

    public static void main(String[] args) {
	int[] array1, array2;

    array1 = new int[5];
    array2 = new int[array1.length];

    for (int i = 0; i< array1.length; i++){
        array1[i] = (int) (Math.random()*100+1);
        array2[i] = (int) (Math.random()*100+1);
    }

    HiloMedia h1 = new HiloMedia(array1);
    HiloMedia h2 = new HiloMedia(array2);

    h1.start();
    h2.start();

    while (h1.isAlive() || h2.isAlive()){

    }


        /*System.out.println("La media del array1 es " + h1.getMedia());
        System.out.println("La media del array2 es " + h2.getMedia());*/
    }
}
