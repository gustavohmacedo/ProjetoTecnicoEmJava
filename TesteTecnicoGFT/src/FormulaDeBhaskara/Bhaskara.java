package TesteTecnicoGFT.src.FormulaDeBhaskara;

import java.util.Scanner;
import java.lang.Math;

public class Bhaskara {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double coeficienteA, coeficienteB, coeficienteC;
        double delta;
        double raizBhaskaraPosistiva, raizBhaskaraNegativa;

        System.out.println("\nEntre com o Coeficinete de A: ");
        coeficienteA = scan.nextDouble();

        System.out.println("Entre com o Coeficinete de B: ");
        coeficienteB = scan.nextDouble();

        System.out.println("Entre com o Coeficinete de C: ");
        coeficienteC = scan.nextDouble();

        delta = (Math.pow(coeficienteB, 2)) - (4 * coeficienteA * coeficienteC);
        raizBhaskaraPosistiva = (-coeficienteB + Math.sqrt(delta)) / (2 * coeficienteA);
        raizBhaskaraNegativa = (-coeficienteB - Math.sqrt(delta)) / (2 * coeficienteA);

        if (coeficienteA == 0) {

            System.out.println("\nImpossivel calcular devido a uma divisao por zero. \n\n");

        } else if (delta < 0) {
            System.out.println("\nImpossivel calcular raiz quadrada de um valor negativo. \n\n");

        } else {
            System.out.printf("\nX1 = %.5f \n", raizBhaskaraPosistiva);
            System.out.printf("X2 = %.5f \n\n", raizBhaskaraNegativa);
        }

        scan.close();

    }

}
