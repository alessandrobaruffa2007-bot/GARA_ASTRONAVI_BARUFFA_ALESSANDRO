public class garaAstronave {
    public static void main(String[] args) {
        System.out.println("Inizia la gara!");
        Giudice giudice = new Giudice();
        Thread threadAlpha = new Thread(new Astronave("Alpha", giudice));
        Thread threadBeta = new Thread(new Astronave("Beta", giudice));
        Thread threadGamma = new Thread(new Astronave("Gamma", giudice));
        Thread threadDelta = new Thread(new Astronave("Delta", giudice));

        threadAlpha.start();
        threadBeta.start();
        threadGamma.start();
        threadDelta.start();
        try {
            threadAlpha.join();
            threadBeta.join();
            threadGamma.join();
            threadDelta.join();
        } catch (InterruptedException e) {
            System.err.println("Errore nella transizione da RUNNING a WAITING del thread main");
        }
    }
}
