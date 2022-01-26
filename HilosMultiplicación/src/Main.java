public class Main {

    public static void main(String[] args) {
	    /*Hilo h1 = new Hilo(3);
        Hilo h2 = new Hilo(9);

        //h1.start();
        while (h1.isAlive()){

        }
        //h2.start();

        Hilo2 h3 = new Hilo2(2,2);
        Hilo2 h4 = new Hilo2(10, 10);

        h3.start();
        h4.start();

        while (h3.isAlive() || h4.isAlive()){

        }



        System.out.println("La suma de los números "+ h3.getSumando1() + " + " + h3.getSumando2() + " = " + h3.getResultado());
        System.out.println("La suma de los números "+ h4.getSumando1() + " + " + h4.getSumando2() + " = " + h4.getResultado());
*/
        HiloPalabra h5 = new HiloPalabra("Palabra");

        h5.start();

        while (h5.isAlive()){

        }

        for (int i = 0; i<h5.getArrayPalabra().length; i++){
            System.out.println(h5.getArrayPalabra()[i]);
        }



    }
}
