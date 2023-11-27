/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 * 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/15
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int signoA = 0;
        String signo = "";
        String acumulador = "";
        double termino = 0;
        int sumaOresta = 1;
        double resultado = 0;
        double i = 1;
        while (i <= 15) {
            if (signoA % 2 == 0) {
                signo = "+";
            } else {
                signo = "-";
            }
            termino = sumaOresta * (1 / i);
            resultado = resultado + termino;
            signoA = signoA + 1;
            if (i <= 1) {
                acumulador = String.format("%s %s", acumulador , (int) i);
            } else {
                acumulador = String.format("%s %s 1/%s", acumulador, signo, (int) i);
            }
            sumaOresta = sumaOresta * -1;
            i = i + 2;
        }
        System.out.printf("%s\nResultado: %.4f\n", acumulador, resultado);
    }

}
