//rama1/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author kiko
 */
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;

        do {
            // Menú
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = teclado.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                // Pedir números
                System.out.print("Introduce el primer número: ");
                num1 = teclado.nextDouble();

                System.out.print("Introduce el segundo número: ");
                num2 = teclado.nextDouble();

                switch (opcion) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("Resultado: " + resultado);
                        break;

                    case 2:
                        resultado = num1 - num2;
                        System.out.println("Resultado: " + resultado);
                        break;

                    case 3:
                        resultado = num1 * num2;
                        System.out.println("Resultado: " + resultado);
                        break;

                    case 4:
                        if (num2 == 0) {
                            System.out.println("Error: no se puede dividir entre 0.");
                        } else {
                            resultado = num1 / num2;
                            System.out.println("Resultado: " + resultado);
                        }
                        break;
                }
            } else if (opcion != 5) {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        System.out.println("Saliendo... ¡Gracias!");
        teclado.close();
    }
}
//comentario desde git
