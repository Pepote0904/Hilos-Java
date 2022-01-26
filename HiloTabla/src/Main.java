public class Main {

    public static void main(String[] args) {
	int[] array1;
    array1= new int[11];
    for (int i = 0; i<array1.length; i++){
        HiloTabla ht = new HiloTabla(i);
        ht.start();
        while (!ht.terminado) {

        }
    }

    }
}
