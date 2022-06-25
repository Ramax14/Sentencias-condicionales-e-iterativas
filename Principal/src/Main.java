public class Main {
    public static void main(String[] args) {

        /* for (int i = 8; i > 1; i--) {         NO PIDE ESTO ↓ PERO ME COSTÓ Y ME GUSTÓ PODER HACERLO
            for (int k = 0; k < 8 - i; k++) {              *******
                System.out.print(" ");                      ******
            }                                                *****
            for (int j = 1; j < i; j++) {                     ****
                System.out.print("*");                         ***
            }                                                   **
            System.out.println();                                *
           }
         */

        TrianguloCrecienteCEspacioAIzq();
    }

    public static void TrianguloCrecienteCEspacioAIzq(){

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}