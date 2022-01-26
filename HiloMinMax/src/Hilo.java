public class Hilo extends Thread{
    private int[] miArray;
    private int maximo;
    private int minimo;

    public Hilo(String nombre){
        super(nombre);
        this.maximo=0;
        this.minimo=0;
        miArray = new int[100];
    }

    @Override
    public void run(){
        super.run();
        minimo = 0;
        maximo = 0;
        for (int i = 0; i<miArray.length; i++){
            minimo = minimo * miArray[i];
            maximo = maximo + miArray[i];
        }
        /*System.out.println("El valor minimo es " + minimo);
        System.out.println("El valor máximo es " + maximo);*/
    }

    public int[] getMiArray() {
        return miArray;
    }

    public void setMiArray(int[] miArray) {
        this.miArray = miArray;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }
}
