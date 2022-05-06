import java.util.Scanner;

public class MayorDeDosNumeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("Introduzca primer número: ");                                                           
        n1 = sc.nextInt();
        System.out.print("Introduzca segundo número: ");
        n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("El mayor es " + n1);
        } else if (n1 < n2) {
            System.out.println("El mayor es " + n2);
        } else {
            System.out.println("Los números son iguales");
        }
    }
}