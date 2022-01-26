public class Productor extends Thread {
    private Cola cola;

    public Productor(Cola c) {
        cola = c;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            int aleatorio=(int) (Math.random() * 100 + 1);
            cola.put(aleatorio); //pone el número
        
            try {
                sleep(100);
            } catch (InterruptedException e) { }			
			
        }
    }
}


