/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;


/*
  Generar e imprimir la siguiente serie:
    2
    6 
    12 
    20 
    30 
    42 
    56 
    72 
    90 
    110 
 */
public class Problema02 {


    public static void main(String[] args) {
        int suma=0;
        int i = 2;

        while(i<=20){
                    suma=suma+i;
            System.out.println(suma);
            i=i+2;
        }
    }
    
}
