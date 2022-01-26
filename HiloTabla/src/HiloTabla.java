public class HiloTabla extends Thread{
    private int numero;
    boolean terminado;

    public HiloTabla(int numero){
        this.numero=numero;
        this.terminado=false;

    }
    @Override
    public void run(){
        terminado=false;
        for (int i =1; i<=10;i++){
            System.out.println(numero + " x " + i + " = " + (i*numero));
        }
        terminado=true;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
