public class Main {

    public static void main(String[] args) {
        //Creo la variable que van a compartir
        Contador miContador= new Contador(100);

        //Creo el hilo que va a sumar y le paso la variable que debe de sumar
        HiloSumador miHiloSumador = new HiloSumador(miContador);

        //Creo el hilo que va a restar y le paso la variable que debe de restar
        HiloRestador miHiloRestador = new HiloRestador(miContador);

        //Pongo en marcha los hilos
        miHiloSumador.start();
        miHiloRestador.start();

        //Espero a que termien los hilos
        while (miHiloSumador.isAlive() || miHiloRestador.isAlive()){

        }

        //Muestro el valor final de los hilos
        System.out.println("El valor final es: " + miContador.getValor());
    }
}
