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
        int signoA = 1;
        String signo = "";
        String acumulador = "1";
        int i = 3;

        while (i <= 15) {
            if (signoA % 2 == 0) {
                signo = "+";
            } else {
                signo = "-";
            }
            signoA = signoA + 1;
            acumulador = String.format("%s %s 1/%s", acumulador, signo, i);
            i = i + 2;
        }
        System.out.println(acumulador);
    }

}