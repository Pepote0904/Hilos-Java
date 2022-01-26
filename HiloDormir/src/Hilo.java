public class Hilo extends Thread{

    public Hilo(String nombre){
        super(nombre);
        System.out.println("El estado de " + getName() + " en el constructor es " + getState());
    }

    public void run(){
        if (this.getName().equals("Pepito")){
            try {
                sleep(2000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
        System.out.println("Está terminando el hilo " + getName());
        System.out.println("El estado de " + getName() + " en el run es " + getState());
    }
}
