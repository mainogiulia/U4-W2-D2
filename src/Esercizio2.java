import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Esercizio2 {

    public static List<Integer> generaListaCasuale(int n) {
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            lista.add(random.nextInt(101));
        }

        Collections.sort(lista);

        return lista;
    }

    public static List<Integer> invertiLista(List<Integer> lista) {
        List<Integer> listaInvertita = new ArrayList<>(lista);
        Collections.reverse(listaInvertita);

        return listaInvertita;
    }

    public static void stampaLista(List<Integer> lista, boolean dispari) {
        if (dispari) {
            for (int i = 0; i < lista.size(); i += 2) {
                System.out.println(lista.get(i) + " ");
            }
        } else {
            for (int i = 1; i < lista.size(); i += 2) {
                System.out.println(lista.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        List<Integer> lista = generaListaCasuale(n);
        System.out.println("Lista originale: " + lista);

        List<Integer> listaInvertita = invertiLista(lista);
        System.out.println("Lista invertita: " + listaInvertita);

        System.out.println("Elementi in posizioni dispari: ");
        stampaLista(lista, true);

        System.out.println("Elementi in posizioni pari: ");
        stampaLista(lista, false);
    }
}