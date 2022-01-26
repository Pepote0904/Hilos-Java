public class Hilos extends Thread{
    private int[] miArray;
    private int cuadrado;
    private boolean terminado;

    public Hilos(String nombre, int[] miArray){

        super(nombre);
        this.cuadrado=0;
        terminado=false;
        miArray = miArray;
    }
    @Override
    public void run(){
        super.run();
        cuadrado=0;
        setTerminado(false);
        for (int i = 0; i<miArray.length; i++){
            System.out.println("EL cuadrado de "+ miArray[i] + " es " + (cuadrado = miArray[i] * miArray[i]));
        }
        setTerminado(true);

    }

    public int[] getMiArray() {
        return miArray;
    }

    public void setMiArray(int[] miArray) {
        this.miArray = miArray;
    }

    public int getCuadrado() {
        return cuadrado;
    }

    public void setCuadrado(int cuadrado) {
        this.cuadrado = cuadrado;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }
}
