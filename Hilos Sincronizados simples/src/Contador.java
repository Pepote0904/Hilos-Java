public class Contador {
    int valor;

    public Contador(int numero){
        this.valor = numero;
    }

    public void incrementar(int argumento){
        valor = valor + argumento;
    }

    public void decrementar(int parametro){
        valor = valor - parametro;
    }

    public int getValor(){
        return valor;
    }
}
