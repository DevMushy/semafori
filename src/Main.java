public class Main {
    protected static int buffer = 0;
    public static void main(String[] args) throws Exception {
        Semaforo rosso = new Semaforo(0);
        Semaforo verde = new Semaforo(1);
        CreaDato c = new CreaDato(verde , rosso);
        EliminaDato e = new EliminaDato(verde , rosso);
        c.start();
        e.start();
        System.out.println("Termine avvio thread");
    }
}
