package Problem2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int n = lector.nextInt();

        for (int i = 0; i < n; i++) {
            String palabra = lector.next();
            int largo = palabra.length();

            if (largo > 10) {
                String primera = palabra.substring(0, 1);
                String ultima = palabra.substring(largo - 1);
                int enElMedio = largo - 2;
                System.out.println(primera + enElMedio + ultima);
            } else {
                System.out.println(palabra);
            }
        }
        lector.close();
    
    }
}
