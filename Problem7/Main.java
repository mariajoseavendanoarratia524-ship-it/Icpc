package Problem7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String nombre = lector.next();
        boolean[] aparece = new boolean[26];

        for (int i = 0; i < nombre.length(); i++) {
            char letra = nombre.charAt(i);
            aparece[letra - 'a'] = true;
        }

        int distintas = 0;

        for (int i = 0; i < 26; i++) {
            if (aparece[i]) {
                distintas++;
            }
        }

        if (distintas % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        lector.close();
    }
}