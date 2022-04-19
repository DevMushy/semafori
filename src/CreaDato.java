public class CreaDato extends Thread{
    Semaforo verde;
    Semaforo rosso;
    int elementi = 5;
    final int attesa = 500;

    public CreaDato(Semaforo verde, Semaforo rosso){
        this.verde = verde;
        this.rosso = rosso;
    }

    public void run(){
        for (int i = 0; i < elementi; i++) {
            rosso.semaforoVerde();
            Main.buffer = i;
            System.out.println("Dato: " + i);
            verde.semaforoRosso();
            try {
                Thread.sleep(attesa);
            } catch (Exception e) {}
        }
        System.out.println("Terminata l'uscita dati");
    }

}