import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // definimos la edad ingresada como una constante

        System.out.println("ingrese la edad a evaluar");

        final int AGE_LIMIT = sc.nextInt();

        if (AGE_LIMIT >= 18) {
            System.out.println("Access granted");
        }

        else {
            System.out.println("Access denied");
        }
    }
}
