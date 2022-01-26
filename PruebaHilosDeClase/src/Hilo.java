public class Hilo extends Thread{
    private int[] miArray;
    private int alCuadrado;
    private int suma;

    public Hilo(int[] argNumero){
        miArray = argNumero;
    }

    @Override
    public void run() {
        super.run();
        alCuadrado=0;
        for (int i = 0; i< miArray.length; i++){
            alCuadrado += (miArray[i] * miArray[i]);
            //System.out.println(miArray[i] * miArray[i]);
        }
        suma=alCuadrado;
        System.out.println("El cuadrado de los hilos es " + alCuadrado);

    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int[] getMiArray() {
        return miArray;
    }

    public void setMiArray(int[] miArray) {
        this.miArray = miArray;
    }

    public int getAlCuadrado() {
        return alCuadrado;
    }

    public void setAlCuadrado(int alCuadrado) {
        this.alCuadrado = alCuadrado;
    }
}
