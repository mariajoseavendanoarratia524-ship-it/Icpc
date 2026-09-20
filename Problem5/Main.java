package Problem5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        int[] puntuaciones = new int[n];
        for (int i = 0; i < n; i++) {
            puntuaciones[i] = scanner.nextInt();
        }
        
        int puntajeK = puntuaciones[k - 1];
        int avanzados = 0;
        
        for (int i = 0; i < n; i++) {
            if (puntuaciones[i] >= puntajeK && puntuaciones[i] > 0) {
                avanzados++;
            }
        }
        
        System.out.println(avanzados);
        scanner.close();
    }
}

