/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 * Generar una solución que permita ingresar jugadores de fútbol; por cada
 * jugador se debe solicitar: Nombre el jugador Posición en el campo de juego
 * Edad Estatura
 *
 * El ciclo de ingreso de información deberá terminar cuando el usuario lo
 * decida. Se debe imprimir el siguiente reporte (usar una cadena de
 * acumulación):
 *
 * Listado de Jugadores 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
 * 2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85 3. Moisés Caicedo
 * -Mediocentro-, edad 19, estatura 1.88 4. Ángel Mena -Delantero-, edad 32,
 * estatura 1.75 5. Michael Estrada -Delantero-, edad 27, estatura 1.93 Listado
 * de Edades 32 24 19 32 27 Promedio de edades: 26.8 Promedio de estaturas: 1.87
 */
public class Problema01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombreJ;
        String posicion;
        int edad;
        double estatura;
        String acumulador1 = "Listado de Jugadores\n";
        String acumulador2 = "Listado de Edades";
        int contador = 0;
        boolean estado = true;
        int salida = 0;
        double promedioE = 0;
        double promedioEst = 0;
        do {
            contador++;
            System.out.println("Ingrese el nombre del jugador");
            nombreJ = entrada.nextLine();
            System.out.println("Ingrese la posicion del jugador");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt();
            promedioE = promedioE + edad;
            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();
            promedioEst = promedioEst + estatura;
            acumulador1 = String.format("%s%s. %s -%s-, edad %s, estatura %.2f\n",
                    acumulador1, contador, nombreJ,
                    posicion, edad, estatura);
            acumulador2 = String.format("%s\n%s", acumulador2, edad);

            //Salida
            System.out.println("Ingrese (-1) si desea salir del ciclo; ");
            salida = entrada.nextInt();
            if (salida == -1) {
                estado = false;
            }
            entrada.nextLine();
        } while (estado);
        promedioE = promedioE / contador;
        promedioEst = promedioEst / contador;
        System.out.printf("%s%s\nPromedio de edades: %.2f\n"
                + "Promedio de estatura: %.2f\n",
                acumulador1,
                acumulador2,
                promedioE,
                promedioEst);
    }

}
