import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        EstadoDeCursadaDeEstudiantes(read);
    }

    public static void EstadoDeCursadaDeEstudiantes(Scanner read){
        float n1, n2, n3, prom;
        String cursante;

        System.out.println("Ingrese el nombre del estudiante:");
        cursante = read.next();
        System.out.println("Ingrese la primer nota del estudiante");
        n1 = read.nextFloat();
        while (n1<0 || n1>10){
            System.out.println("Valor erroneo.");
            System.out.println("Ingrese la primer nota del estudiante");
            n1 = read.nextFloat();
        }
        System.out.println("Ingrese la segunda nota del estudiante");
        n2 = read.nextFloat();
        while (n2<0 || n2>10){
            System.out.println("Valor erroneo.");
            System.out.println("Ingrese la segunda nota del estudiante");
            n2 = read.nextFloat();
        }
        System.out.println("Ingrese la tercer nota del estudiante");
        n3 = read.nextFloat();
        while (n3<0 || n3>10){
            System.out.println("Valor erroneo.");
            System.out.println("Ingrese la tercer nota del estudiante");
            n3 = read.nextFloat();
        }
        prom = (n1 + n2 + n3)/3;
        if (prom<6)
            System.out.printf("-Estudiante:"+cursante+".\n-Promedio: "+prom+".\n-Situación: Desaprobado.");
        else if (prom<9)
            System.out.printf("-Estudiante:"+cursante+".\n-Promedio: "+prom+".\n-Situación: Aprobado.");
        else
            System.out.printf("-Estudiante:"+cursante+".\n-Promedio: "+prom+".\n-Situación: Promociado.");
    }
}

