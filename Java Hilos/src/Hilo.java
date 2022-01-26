public class Hilo extends Thread{
    int[] miArray;
    int posicion;
    int valorBuscado;

    public Hilo(int[] paramArray, int valorBuscado){
        this.miArray=paramArray;
        this.valorBuscado= valorBuscado;

    }

    @Override
    public void run() {
        super.run();
        posicion = encotrar(valorBuscado);
    }

    public int encotrar(int valor){
        int p = 0, respuesta = 0;

        while(p<miArray.length && miArray[p]!=valor){
            p++;
        }
        respuesta = (p==miArray.length) ? -1 : p;
        return respuesta;

        /*if (p==miArray.length){
            respuesta =-1;
        }else{
            return p;
        }*/
    }

    public int[] getMiArray() {
        return miArray;
    }

    public void setMiArray(int[] miArray) {
        this.miArray = miArray;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getValorBuscado() {
        return valorBuscado;
    }

    public void setValorBuscado(int valorBuscado) {
        this.valorBuscado = valorBuscado;
    }
}
