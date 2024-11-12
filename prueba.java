package Tema2_Ejercicos;

import java.util.Random;
import java.util.Scanner;
public class prueba {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //avanzado las rondas//
        int jugador_1 =50,jugador_2 =50,lifepoint=50,lifepoint_2=50;
        int ronda=1;
        while(jugador_1>0 && jugador_2>0){
            System.out.println("=====================================================");
            System.out.println("-----------------  RONDA"+" "+ ronda+" ----------------");
            System.out.println("JUGADOR 1: "+lifepoint);
            System.out.println("Jugador 2:"+lifepoint_2);
            System.out.println("Ingresa el nombre de tu personaje:");
            String nombrePersonaje = in.nextLine();

            // Mostrar el menú de opciones usando un switch
            System.out.println("Selecciona una acción para " + nombrePersonaje + ":");
            System.out.println("1. Atacar");
            System.out.println("2. Defender");
            System.out.println("3. Huir");

            // Leer la opción del usuario
            int opcion = in.nextInt();

            // Utilizar switch para manejar las opciones
            switch (opcion) {
                case 1:
                    System.out.println(nombrePersonaje + " ha elegido atacar.");
                    // Aquí puedes agregar la lógica del ataque
                    break;
                case 2:
                    System.out.println(nombrePersonaje + " se está defendiendo.");
                    // Aquí puedes agregar la lógica de defensa
                    break;
                case 3:
                    System.out.println(nombrePersonaje + " ha decidido huir.");
                    // Aquí puedes agregar la lógica de huida
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción correcta.");
                    break;
            }
        }
        int cont=1;
        while(cont<=23){
            System.out.println("=====================================================");
            System.out.println("-----------------  RONDA"+" "+ cont+" ----------------");
            cont++;
            System.out.println("Toca Enter para pasar la ronda");
            in.nextLine();
        }

}}


