package Problem6;

    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int filaDelUno = 0;
        int columnaDelUno = 0;

        for (int fila = 1; fila <= 5; fila++) {
            for (int columna = 1; columna <= 5; columna++) {
                int numero = lector.nextInt();

                if (numero == 1) {
                    filaDelUno = fila;
                    columnaDelUno = columna;
                }
            }
        }

        int pasos = Math.abs(filaDelUno - 3) + Math.abs(columnaDelUno - 3);

        System.out.println(pasos);
        lector.close();
    }
}

