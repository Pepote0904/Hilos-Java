public class Productor extends Thread {
    private Cola cola;

    public Productor(Cola c) {
        cola = c;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            cola.put(i); //pone el número
        
            try {
                sleep(100);
            } catch (InterruptedException e) { }			
			
        }
    }
}


