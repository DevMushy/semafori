public class Contatore {
    int valore;

    public Contatore(int valore) {
        this.valore = valore;
        System.out.println("valore: " + this.getValore());
    }
    public int getValore() {
        return valore;
    }

    void incrementa(int passo) {
        valore += passo;
    }
    void decrementa(int passo) {
        valore -= passo;
    }
    void uguale(int passo) {
        valore = passo;
    }
    void raddoppia() {
        valore += valore;
    }
}