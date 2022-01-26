public class Hilo1 extends Thread{

    public Hilo1 (String nombre){
        super(nombre);
    }

    public void run(){
        if (getName().equals("Hilo2")){
            try{
                sleep(2000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
        System.out.println("Ejecutando HILO:" +getName()+ " con Id "+ getId());
        System.out.println(getState());
    }
}
