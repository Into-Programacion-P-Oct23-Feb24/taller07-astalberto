/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

/**
 *
 * @author alber
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int signoA = 1;
        String signo = "";
        String acumulador = "1";
        double termino = 0;
        int sumaOresta = 1;
        double resultado = 0;
        double i = 1;
        do {
            if (signoA % 2 == 0) {
                signo = "+";
            } else {
                signo = "-";
            }
             termino = sumaOresta * (1 / i);
            resultado = resultado + termino;
            signoA = signoA + 1;
            acumulador = String.format("%s %s 1/%s", acumulador, signo, (int) i);
            sumaOresta = sumaOresta * -1;
            i = i + 2;
        } while (i <= 15);
        System.out.printf("%s\nResultado: %.4f\n", acumulador, resultado);
    }

}
