public class HiloPalabra extends Thread{

    String[] cadenas;

    public HiloPalabra(String[] argCadena){
        cadenas = argCadena;
    }

    @Override
    public void run(){
        super.run();

        for(int n=0; n<cadenas.length; n++) {
            String palabra = cadenas[n];
            String[] cortada = palabra.split("");
            for (int nn = 0; nn < cortada.length; nn++) {
                System.out.println(cortada[nn]);
            }
        }
    }
}
