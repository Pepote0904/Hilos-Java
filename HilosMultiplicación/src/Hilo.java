public class Hilo extends Thread{
    int numero;

    public Hilo(int paramNumero){
        this.numero = paramNumero;

    }

    @Override
    public void run() {
        super.run();
        for (int i = 1; i<11; i++){
            System.out.println(i + " x " + numero + " = " + i*numero);
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
