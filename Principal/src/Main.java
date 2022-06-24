import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        MayorEntreDos(read);

    }

    public static void MayorEntreDos(Scanner read){
        int a, b;

        System.out.println("Ingrese un numero entero:");
        a = read.nextInt();
        System.out.println("Ingrese otro numero entero:");
        b = read.nextInt();
        if (a>b){
            System.out.println("El numero "+a+" es mayor que el numero "+b);
        }
        else
            System.out.println("El numero "+b+" es mayor que el numero "+a);
    }
}