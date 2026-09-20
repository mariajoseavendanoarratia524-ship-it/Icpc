package Problem9;
public class Main {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String texto = String.valueOf(x);
        int izquierda = 0;
        int derecha = texto.length() - 1;

        while (izquierda < derecha) {
            if (texto.charAt(izquierda) != texto.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }

        return true;
    }

    public static void main(String[] args) {
        int x = 121;

        System.out.println(isPalindrome(x));
    }
}