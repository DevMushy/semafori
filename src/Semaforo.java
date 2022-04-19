public class Semaforo extends Thread{
    int luce;

    public Semaforo(int luce){
        this.luce = luce;
    }

    synchronized public void semaforoRosso(){
        while (luce == 0) {
            try {
                wait();
            } catch (Exception e) {}
        }
        luce--;
    }

    synchronized public void semaforoVerde(){
       luce++;
       notify();
    }


}