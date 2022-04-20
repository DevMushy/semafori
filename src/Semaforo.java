public class Semaforo {
    private int valore;

    public Semaforo(int v) {
        valore = v;
    }

    synchronized public void p() throws InterruptedException {
        while(valore == 0) {
            try {
                wait();
            } catch (Exception e) {e.printStackTrace();}
        }
        valore--;
    }

    synchronized public void v() {
        valore++;
        notify();
    }

    public int getValore() {
        return valore;
    }
}