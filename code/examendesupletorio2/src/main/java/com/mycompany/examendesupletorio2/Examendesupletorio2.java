

package com.mycompany.examendesupletorio2;
import java.util.Scanner;

public class Examendesupletorio2 {

    public static void main(String[] args) {
        System.out.println("pedir 5 sueldo que superen los 400 dolares");
        

     Scanner sc = new Scanner(System.in);
        int cantidadSueldos = 5;
        double sumaSueldos = 0; 
        int sueldosMayoresOIguales400 = 0;

        System.out.println("Ingrese 5 sueldos mayores o iguales a $400:");

        for (int i = 1; i <= cantidadSueldos; i++) {
            System.out.print("Sueldo " + i + ": $");
            double sueldo = sc.nextDouble();

            while (sueldo < 0) {
                System.out.println("El sueldo no puede ser negativo. Ingrese un valor válido:");
                System.out.print("Sueldo " + i + ": $");
                sueldo = sc.nextDouble();
            }

            sumaSueldos += sueldo;

            if (sueldo >= 400) {
                sueldosMayoresOIguales400++;
            }
        }

        System.out.println("La suma de los sueldos ingresados es: $" + sumaSueldos);
        System.out.println("Cantidad de sueldos mayores o iguales a $400: " + sueldosMayoresOIguales400);

        sc.close(); 
    }
}