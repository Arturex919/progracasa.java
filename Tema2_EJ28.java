package Tema2_Ejercicos;

import java.util.Random;
import java.util.Scanner;

public class Tema2_EJ28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        Random random = new Random();
        int randomint = random.nextInt(100000);
        System.out.println(randomint);
        System.out.println("Bienvenido a la loteria");
        System.out.println("Se ha generado un numero ganador entre 0-100.000");
        System.out.println("ingrese los cinco numeros de su boleto ");
        a = in.nextInt();
        if (a == randomint) {
            System.out.println("¡FELICIDADES!");
            System.out.println("ha ganado la loteria ");
        }else{
            System.out.println (" no ha ganado la loteria ");
        }
    }
}