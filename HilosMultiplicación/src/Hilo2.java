public class Hilo2 extends Thread{
    int sumando1, sumando2, resultado;

    public Hilo2(int paramSumando1, int paramSumando2){

        this.sumando1 = paramSumando1;
        this.sumando2 = paramSumando2;

    }

    @Override
    public void run() {
        super.run();

        resultado = sumando1 + sumando2;

    }

    public int getSumando1() {
        return sumando1;
    }

    public void setSumando1(int sumando1) {
        this.sumando1 = sumando1;
    }

    public int getSumando2() {
        return sumando2;
    }

    public void setSumando2(int sumando2) {
        this.sumando2 = sumando2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
