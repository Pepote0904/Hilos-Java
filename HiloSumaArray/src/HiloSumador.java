public class HiloSumador extends Thread{

    private int[] miArray;
    private int suma;

    public HiloSumador(String nombre){
        super(nombre);
        this.suma=0;
        miArray=new int[100];
    }

    @Override
    public void run() {
        super.run();
        suma=0;
        for (int i = 0; i< miArray.length; i++){
            suma = suma + miArray[i];
        }
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
}
