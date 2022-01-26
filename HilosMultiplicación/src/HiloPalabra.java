public class HiloPalabra extends Thread{

    String palabra;
    String[] arrayPalabra;

    public HiloPalabra(String paramPalabra){

        this.palabra = paramPalabra;
    }

    @Override
    public void run() {
        //super.run();

        arrayPalabra = palabra.split("");
        /*arrayPalabra=new String[palabra.length()];
        for (int i = 0; i<palabra.length(); i++){

            arrayPalabra[i] = palabra.substring(i, i+1);
        }*/
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String[] getArrayPalabra() {
        return arrayPalabra;
    }

    public void setArrayPalabra(String[] arrayPalabra) {
        this.arrayPalabra = arrayPalabra;
    }
}
