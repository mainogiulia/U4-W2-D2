import java.util.HashMap;
import java.util.Map;

public class Rubrica {
    private HashMap<String, String> contatti;

    public Rubrica() {
        contatti = new HashMap<>();
    }

    public void aggiungiContatto(String nome, String numero) {
        contatti.put(nome, numero);
    }

    public String cercaContatto(String nome) {
        return contatti.get(nome);
    }

    public void rimuoviContatto(String nome) {
        contatti.remove(nome);
    }

    public void mostraContatti() {
        for (Map.Entry<String, String> entry : contatti.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Numero: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();
        rubrica.aggiungiContatto("Mario Rossi", "123456789");
        rubrica.aggiungiContatto("Giulia Bianchi", "987654321");

        System.out.println("Contatto di Mario Rossi: " + rubrica.cercaContatto("Mario Rossi"));
        rubrica.mostraContatti();

        rubrica.rimuoviContatto("Giulia Bianchi");
        rubrica.mostraContatti();
    }
}