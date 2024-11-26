import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di parole: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Set<String> parole = new HashSet<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci una parola: ");
            String parola = scanner.nextLine();
            if (!parole.add(parola)) {
                System.out.println("Parola duplicata: " + parola);
            }
        }
        System.out.println("Numero di parole distinte: " + parole.size());
        System.out.println("Elenco di parole distinte: ");
        for (String parola : parole) {
            System.out.println(parola);
        }

        scanner.close();
    }
}