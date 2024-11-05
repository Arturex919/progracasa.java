package Tema2_Ejercicos;

import java.util.Scanner;
public class Tema2_Ej30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opciones;
        System.out.println("Bienvenido a la calculadora");
        while (true) {
            System.out.println("Ingrese el número de la operación que quiere realizar:");
            System.out.println("1-Suma, 2-Resta, 3-Multiplicación, 4-División, 5-Resto, 0-Salir");

            opciones = in.nextInt();
            if (opciones == 0) {
                System.out.println("Saliendo de la calculadora. ¡Gracias por usarla!");
                break;
            }
            double num1, num2;
            System.out.print("Ingrese el primer número: ");
            num1 = in.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            num2 = in.nextDouble();

            switch (opciones) {
                case 1 -> {
                    double suma;
                    suma = num1 + num2;
                    System.out.println("La suma de num1+num2");
                    System.out.println("La suma es : " + suma);
                }
                case 2 -> {
                    double resta;
                    resta = num1 - num2;
                    System.out.println("el resultado de la resta es : " + resta);
                }
                case 3 -> {
                    double Multiplicacion;

                    Multiplicacion = num1 * num2;
                    System.out.println("el resultado de la suma es : " + Multiplicacion);
                }
                case 4 -> {
                    double division;
                    if (num2 != 0) {
                        division = num1 / num2;
                        System.out.println("el resultado es :" + division);
                    } else {
                        System.out.println("no se puede dividir en cero");
                    }
                }
                case 5 -> {
                    double resto;
                    if (num2 != 0) {
                        resto = num1 % num2;
                        System.out.println("el resultado es :" + resto);
                    } else {
                        System.out.println("errooooooor");
                    }
                }

            }
        }
    }
}

