package Problem4;


    import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int n = lector.nextInt();
        int x = 0;

        for (int i = 0; i < n; i++) {
            String orden = lector.next();

            if (orden.contains("++")) {
                x++;
            } else {
                x--;
            }
        }

        System.out.println(x);
        lector.close();
    }
}

