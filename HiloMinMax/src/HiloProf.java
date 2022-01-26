public class HiloProf extends Thread{
    private int[] misNumeros;
    private int minimo2, maximo2;

    public HiloProf(int [] argNumeros){
        misNumeros = argNumeros;
    }

    public void run(){
        minimo2 = misNumeros[0];
        maximo2 = misNumeros[0];
        for (int i = 0; i<misNumeros.length; i++){
            if (misNumeros[i]<minimo2){
                minimo2=misNumeros[i];
            }

            if (misNumeros[i]>maximo2){
                maximo2=misNumeros[i];
            }

        }
        //System.out.println("El valor minimo es " + minimo2 + " y el máximo es " + maximo2);
    }

    public int[] getMisNumeros() {
        return misNumeros;
    }

    public void setMisNumeros(int[] misNumeros) {
        this.misNumeros = misNumeros;
    }

    public int getMinimo2() {
        return minimo2;
    }

    public void setMinimo2(int minimo2) {
        this.minimo2 = minimo2;
    }

    public int getMaximo2() {
        return maximo2;
    }

    public void setMaximo2(int maximo2) {
        this.maximo2 = maximo2;
    }
}
