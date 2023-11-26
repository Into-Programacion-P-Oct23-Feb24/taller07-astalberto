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
        int i = 3;

        do {
            if (signoA % 2 == 0) {
                signo = "+";
            } else {
                signo = "-";
            }
            
            signoA = signoA + 1;
            acumulador = String.format("%s %s 1/%s", acumulador, signo, i);
            i = i + 2;
        } while (i <= 15);
        System.out.println(acumulador);
    }

}
