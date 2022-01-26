public class Hilo extends Thread{
    private int[] miArray;
    private int suma;
    private boolean terminado;
    public Hilo(String nombre){
        super(nombre);
        this.suma=0;
        terminado=false;
        miArray=new int[5];
    }
    @Override
    public void run() {
        super.run();
        suma=0;
        setTerminado(false);
        for(int i=0; i<miArray.length; i++){
            suma=suma + miArray[i];
        }
        setTerminado(true);
    }
    public int[] getMiArray() {
        return miArray;
    }
    public void setMiArray(int[] miArray) {
        this.miArray = miArray;
    }
    public int getSuma() {
        return suma;
    }
    public void setSuma(int suma) {
        this.suma = suma;
    }
    public boolean isTerminado() {
        return terminado;
    }
    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }
}
