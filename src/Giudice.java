public class Giudice {
    int distanzaTraguardo = 5000;

    public synchronized void verifica() {
        if (distanzaTraguardo == 0) {
            System.out.println("Complimenti, l'astronave " + Astronave.nome + " ha vinto");
        }

    }
}
