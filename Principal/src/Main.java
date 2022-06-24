import java.util.Scanner;

public class Main {
    public static void Pagos(){
        Scanner read = new Scanner(System.in);

        String producto;
        float precio;
        byte met_pago;
        char salida;

        do {
            System.out.println("Ingrese el nombre del producto:");
            producto = read.next();
            System.out.println("Ingrese el precio del producto:");
            precio = read.nextFloat();
            System.out.println("Ingrese el método de pago:\n\t1- Contado/Efectivo.\n\t2- Tarjeta de débito.\n\t3- Tarjeta de crédito.");
            met_pago = read.nextByte();
            while(met_pago != 1 && met_pago != 2 && met_pago != 3){
                System.out.println("Método de pago erroneo.");
                System.out.println("Ingrese el método de pago:\n\t1- Contado/Efectivo.\n\t2- Tarjeta de débito.\n\t3- Tarjeta de crédito.");
                met_pago = read.nextByte();
            }
            switch (met_pago) {
                case 1: precio *= 0.85;
                        break;
                case 3: precio *= 1.1;
                        break;
            }
            System.out.println("Producto:"+producto+" - Precio:"+precio);
            System.out.println("Desea ingresar otro producto? (S/N)");
            salida = read.next().charAt(0);
            salida = java.lang.Character.toUpperCase(salida);
        }while (salida == 'S');


    }
}