public class Main {
    protected static Contatore buffer = new Contatore(0);
    public static void main(String[] args) {
        Semaforo pieno = new Semaforo(0);
        Semaforo vuoto = new Semaforo(1);
        CreaDato p1 = new CreaDato(pieno, vuoto);
        CreaDato2 p2 = new CreaDato2(pieno, vuoto);
        Eliminadato c1 = new Eliminadato(pieno, vuoto);
        Eliminadato2 c2 = new Eliminadato2(pieno, vuoto);
        p1.start();
        c1.start();
        p2.start();
        c2.start();
    }
}
