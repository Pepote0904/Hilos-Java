public class Hilo extends Thread{
    int[] miArray;

    public Hilo(int[] paramArray){
        this.miArray=paramArray;
    }

    public void run(){
        int acumulador=0;

        for (int n=0; n<miArray.length; n++){
            acumulador = acumulador + miArray[n];
        }

        System.out.println("La suma del array es " + acumulador);
    }
}
