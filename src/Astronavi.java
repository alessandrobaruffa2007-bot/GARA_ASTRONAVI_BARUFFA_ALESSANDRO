public class Astronave implements Runnable {
    public static String nome;
    Giudice giudice = new Giudice();
    public static int velocità = (int) (Math.random() * ((300 - 50)));



    public Astronave(String nome, Giudice giudice) {
        this.nome = nome;
        this.giudice = giudice;
    }


    @Override
    public void run() {
        System.out.println("Sono il giocatore " + nome + " e inizio la gara");
        while (giudice.distanzaTraguardo > 0) {
            giudice.distanzaTraguardo -= velocità;
            if (giudice.distanzaTraguardo < 0) {
                giudice.distanzaTraguardo = 0;
            }
            System.out.println("Sono " + nome + ", distanza rimanente: " + giudice.distanzaTraguardo);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Errore SLEEPING");

            }
//            giudice.verifica();
        }
    }
}
// devo sistemare il fatto che mi istanzia 4 volte Delta!
