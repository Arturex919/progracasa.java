package Tema2_Ejercicos;

import java.util.Random;
import java.util.Scanner;

public class prueba{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        // Atributos básicos
        int lifepoint_1 = 100, lifepoint_2 = 100; // Puntos de vida iniciales de ambos jugadores
        int defensa_1 = 20, ataque_1 = 50; // Atributos de Jugador 1
        int defensa_2 = 20, ataque_2 = 50; // Atributos de Jugador 2

        // Selección de personaje
        System.out.println("Elige tu personaje (Jugador 1):");
        System.out.println("1. Guerrero (Habilidad final: Corte letal)");
        System.out.println("2. Mago (Habilidad final: Bola de fuego)");
        System.out.println("3. Asesino (Habilidad final: Golpe crítico)");
        System.out.println("4. Tanque (Habilidad final: Escudo impenetrable)");
        int personaje1 = in.nextInt();

        System.out.println("Elige tu personaje (Jugador 2):");
        System.out.println("1. Guerrero (Habilidad final: Corte letal)");
        System.out.println("2. Mago (Habilidad final: Bola de fuego)");
        System.out.println("3. Asesino (Habilidad final: Golpe crítico)");
        System.out.println("4. Tanque (Habilidad final: Escudo impenetrable)");
        int personaje2 = in.nextInt();

        boolean finDelJuego = false;

        while (!finDelJuego) {
            // Turno del Jugador 1
            System.out.println("Turno de Jugador 1:");
            System.out.println("1. Atacar");
            System.out.println("2. Defenderse");
            System.out.println("3. Usar habilidad final");

            int opcion1 = in.nextInt();

            switch (opcion1) {
                case 1 -> {
                    System.out.println("Jugador 1 ataca a Jugador 2.");
                    int danio = ataque_1 - (defensa_2 / 2);
                    int total_danio = Math.max(0, danio - random.nextInt(3));
                    lifepoint_2 -= total_danio;
                    System.out.println("Jugador 1 causó " + total_danio + " de daño.");
                }
                case 2 -> {
                    System.out.println("Jugador 1 decide defenderse.");
                    int defensaExtra = (int) (defensa_1 * 0.1); // Incremento del 10% en defensa
                    defensa_1 += defensaExtra;

                    // Penalización del 5% de vida
                    int vidaPerdida = (int) (lifepoint_1 * 0.05);
                    lifepoint_1 -= vidaPerdida;

                    System.out.println("Defensa aumentada en " + defensaExtra + " puntos.");
                    System.out.println("Jugador 1 perdió " + vidaPerdida + " puntos de vida al defenderse.");
                }
                case 3 -> {
                    System.out.println("Jugador 1 usa su habilidad final:");
                    switch (personaje1) {
                        case 1 -> {
                            System.out.println("Corte letal: Jugador 1 causa un daño masivo.");
                            lifepoint_2 -= 40; // Daño fijo
                        }
                        case 2 -> {
                            System.out.println("Bola de fuego: Jugador 1 lanza una poderosa bola de fuego.");
                            lifepoint_2 -= 35; // Daño medio
                        }
                        case 3 -> {
                            System.out.println("Golpe crítico: Jugador 1 ejecuta un ataque con un daño crítico.");
                            lifepoint_2 -= 50; // Daño alto
                        }
                        case 4 -> {
                            System.out.println("Escudo impenetrable: Jugador 1 reduce el daño recibido un 50% por 1 turno.");
                            defensa_1 += 30; // Incremento temporal en defensa
                        }
                        default -> System.out.println("Habilidad desconocida.");
                    }
                }
                default -> System.out.println("Opción no válida.");
            }

            // Verificar si el Jugador 2 fue derrotado
            if (lifepoint_2 <= 0) {
                System.out.println("¡Jugador 1 gana!");
                break;
            }

            // Turno del Jugador 2
            System.out.println("Turno de Jugador 2:");
            System.out.println("1. Atacar");
            System.out.println("2. Defenderse");
            System.out.println("3. Usar habilidad final");

            int opcion2 = in.nextInt();

            switch (opcion2) {
                case 1 -> {
                    System.out.println("Jugador 2 ataca a Jugador 1.");
                    int danio = ataque_2 - (defensa_1 / 2);
                    int total_danio = Math.max(0, danio - random.nextInt(3));
                    lifepoint_1 -= total_danio;
                    System.out.println("Jugador 2 causó " + total_danio + " de daño.");
                }
                case 2 -> {
                    System.out.println("Jugador 2 decide defenderse.");
                    int defensaExtra = (int) (defensa_2 * 0.1); // Incremento del 10% en defensa
                    defensa_2 += defensaExtra;

                    // Penalización del 5% de vida
                    int vidaPerdida = (int) (lifepoint_2 * 0.05);
                    lifepoint_2 -= vidaPerdida;

                    System.out.println("Defensa aumentada en " + defensaExtra + " puntos.");
                    System.out.println("Jugador 2 perdió " + vidaPerdida + " puntos de vida al defenderse.");
                }
                case 3 -> {
                    System.out.println("Jugador 2 usa su habilidad final:");
                    switch (personaje2) {
                        case 1 -> {
                            System.out.println("Corte letal: Jugador 2 causa un daño masivo.");
                            lifepoint_1 -= 40; // Daño fijo
                        }
                        case 2 -> {
                            System.out.println("Bola de fuego: Jugador 2 lanza una poderosa bola de fuego.");
                            lifepoint_1 -= 35; // Daño medio
                        }
                        case 3 -> {
                            System.out.println("Golpe crítico: Jugador 2 ejecuta un ataque con un daño crítico.");
                            lifepoint_1 -= 50; // Daño alto
                        }
                        case 4 -> {
                            System.out.println("Escudo impenetrable: Jugador 2 reduce el daño recibido un 50% por 1 turno.");
                            defensa_2 += 30; // Incremento temporal en defensa
                        }
                        default -> System.out.println("Habilidad desconocida.");
                    }
                }
                default -> System.out.println("Opción no válida.");
            }

            // Verificar si el Jugador 1 fue derrotado
            if (lifepoint_1 <= 0) {
                System.out.println("¡Jugador 2 gana!");
                break;
            }

            // Mostrar estados actuales
            System.out.println("Vida Jugador 1: " + lifepoint_1);
            System.out.println("Vida Jugador 2: " + lifepoint_2);
        }

        in.close();
    }
}
