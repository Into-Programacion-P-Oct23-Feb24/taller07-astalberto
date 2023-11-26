/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 * 2
 * 5 3
 * 10 5 
 * 17 7 
 * 26 9 
 * 37 11
 */
public class Problema03 {

    public static void main(String[] args) {
        int suma = 2;
        int i = 1;
        do {
            System.out.println(suma);
            i = i + 2;
            suma = suma + i;
        } while (i <= 11);
    }

}
