public class HiloCadena extends Thread{

    private String palabra;


    public HiloCadena(String palabra) {
        this.palabra=palabra;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i<palabra.length();i++){
            System.out.println(palabra.substring(i, i+1));
        }
    }


}
