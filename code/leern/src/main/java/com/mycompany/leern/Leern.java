
/*Leer 20 números del 1 al 40 , ordenarlos de manera crecientemente. 
Leer N y buscarlo en la tabla. Se debe mostrar la posición en que
se encuentra. Si no está, indicarlo con un mensaje. Que el número registrado no se encuentra.*/

package com.mycompany.leern;



import java.util.Scanner;


public class Leern {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 

        // Leer 20 números del 1 al 40
        int[] numeros = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese un número entre 1 y 40: ");
            int numero = sc.nextInt();

            // Validar que el número esté dentro del rango
            if (numero < 1 || numero > 40) {
                System.out.println("Número fuera de rango. Ingrese otro valor.");
                i--;
                // Restar 1 al contador para volver a ingresar el número
                continue;
            }

            // Verificar si el número ya fue ingresado
            boolean repetido = false;
            for (int j = 0; j < i; j++) {
                if (numeros[j] == numero) {
                    System.out.println("Número repetido. Ingrese otro valor.");
                    i--; // Restar 1 al contador para volver a ingresar el número
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                numeros[i] = numero;
            }
        }

        // Ordenar los números de manera creciente (utilizando el método de la burbuja)
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        // Mostrar los números ordenados
        System.out.println("Números ordenados de manera creciente:");
        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Leer  número N al buscar en la tabla
        System.out.print("Ingrese un número a buscar en la tabla: ");
        int numeroBuscado = sc.nextInt();

        // Buscar y mostrar la posición del número (o indicar que no se encontró)
        boolean encontrado = false;
        for (int i = 0; i < 20; i++) {
            if (numeros[i] == numeroBuscado) {
                System.out.println("El número " + numeroBuscado + " se encuentra en la posición " + (i + 1));
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El número " + numeroBuscado + " no se encuentra en la tabla.");
        }

        sc.close();
    }
}