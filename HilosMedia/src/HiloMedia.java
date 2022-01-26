public class HiloMedia extends Thread{

    private int[] miArray;
    private double media;

    public HiloMedia(int[]paramArray){
        this.miArray = paramArray;
        this.media=0;
    }

    @Override
    public void run() {
        super.run();
        media=0;
        for (int i = 0; i< miArray.length; i++){
            media = media + miArray[i];
        }
        System.out.println(media);
        System.out.println("la media del array es: " + media / miArray.length);
    }

    public int[] getMiArray() {
        return miArray;
    }

    public void setMiArray(int[] miArray) {
        this.miArray = miArray;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }
}
