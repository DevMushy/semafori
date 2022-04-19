public class EliminaDato extends Thread{
    Semaforo verde;
    Semaforo rosso;
    private int leggiDato;

    public EliminaDato(Semaforo verde, Semaforo rosso){
        this.verde = verde;
        this.rosso = rosso;
    }

    public void run(){
       while (true) {
           verde.semaforoVerde();
           leggiDato = Main.buffer;
           System.out.println("Letto il dato: " + leggiDato);
           rosso.semaforoRosso();
       }
    }

}