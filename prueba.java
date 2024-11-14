package Tema2_Ejercicos;

import java.util.Random;
import java.util.Scanner;
public class prueba {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                int opciones;
                int opcions = 0;
                int jugador_1, velocidad = 0, ataque = 0, defensa = 0, lifepoint = 0, sal;
                int jugador_2, velocidad_2 = 0, ataque_2 = 0, defensa_2 = 0, lifepoint_2 = 0;
                boolean salir = false;

                System.out.println("El maximo de poder de su personaje no debe de pasar de 500P");
                System.out.println("Las caracteristicas del jugador deben rondar entre 1P - 200P");
                System.out.print("¿Deseas continuar? (Y/N): ");
                opciones = in.next().charAt(0);

                if (opciones == 'Y' || opciones == 'y') {
                    // Configuración del Jugador 1
                    // Proceso de entradas y validación para el jugador 1...
                    // Similar a la parte anterior del código donde validas atributos como velocidad, ataque, defensa, vida.

                    // Configuración del Jugador 2
                    // Similar al proceso del jugador 1

                    // Una vez ambos jugadores estén configurados, iniciamos la lógica del combate.
                    System.out.println("CARACTERISTICAS DE CADA JUGADOR");
                    System.out.println("=====================================================");
                    System.out.println("JUGADOR 1: Velocidad:" + velocidad + "P | Ataque:" + ataque + "P | Defensa:" + defensa + "P | Vida:" + lifepoint + "P");
                    System.out.println("JUGADOR 2: Velocidad:" + velocidad_2 + "P | Ataque:" + ataque_2 + "P | Defensa:" + defensa_2 + "P | Vida:" + lifepoint_2 + "P");
                    System.out.println("Inicio del combate!");

                    // Determinar quién inicia según la velocidad
                    boolean empiezaJugador1 = velocidad > velocidad_2 || (velocidad == velocidad_2 && Math.random() < 0.5); // Si las velocidades son iguales, se decide aleatoriamente

                    int ronda = 1;
                    while (!salir && lifepoint > 0 && lifepoint_2 > 0) {
                        System.out.println("======================================");
                        System.out.println("Ronda " + ronda);
                        if (empiezaJugador1) {
                            // El Jugador 1 ataca
                            int dano1 = ataque - defensa_2;
                            if (dano1 > 0) {
                                lifepoint_2 -= dano1; // Reducir vida de jugador 2
                                System.out.println("Jugador 1 ataca con " + dano1 + " puntos de daño. Vida del Jugador 2: " + lifepoint_2);
                            } else {
                                System.out.println("El ataque de Jugador 1 no hizo daño.");
                            }

                            // Comprobar si el Jugador 2 ha muerto
                            if (lifepoint_2 <= 0) {
                                System.out.println("Jugador 2 ha caído. ¡Jugador 1 gana!");
                                break;
                            }

                            // El Jugador 2 ataca
                            int dano2 = ataque_2 - defensa;
                            if (dano2 > 0) {
                                lifepoint -= dano2; // Reducir vida de jugador 1
                                System.out.println("Jugador 2 ataca con " + dano2 + " puntos de daño. Vida del Jugador 1: " + lifepoint);
                            } else {
                                System.out.println("El ataque de Jugador 2 no hizo daño.");
                            }

                            // Comprobar si el Jugador 1 ha muerto
                            if (lifepoint <= 0) {
                                System.out.println("Jugador 1 ha caído. ¡Jugador 2 gana!");
                                break;
                            }

                        } else {
                            // El Jugador 2 ataca primero
                            int dano2 = ataque_2 - defensa;
                            if (dano2 > 0) {
                                lifepoint -= dano2; // Reducir vida de jugador 1
                                System.out.println("Jugador 2 ataca con " + dano2 + " puntos de daño. Vida del Jugador 1: " + lifepoint);
                            } else {
                                System.out.println("El ataque de Jugador 2 no hizo daño.");
                            }

                            // Comprobar si el Jugador 1 ha muerto
                            if (lifepoint <= 0) {
                                System.out.println("Jugador 1 ha caído. ¡Jugador 2 gana!");
                                break;
                            }

                            // El Jugador 1 ataca
                            int dano1 = ataque - defensa_2;
                            if (dano1 > 0) {
                                lifepoint_2 -= dano1; // Reducir vida de jugador 2
                                System.out.println("Jugador 1 ataca con " + dano1 + " puntos de daño. Vida del Jugador 2: " + lifepoint_2);
                            } else {
                                System.out.println("El ataque de Jugador 1 no hizo daño.");
                            }

                            // Comprobar si el Jugador 2 ha muerto
                            if (lifepoint_2 <= 0) {
                                System.out.println("Jugador 2 ha caído. ¡Jugador 1 gana!");
                                break;
                            }
                        }

                        ronda++; // Incrementar la ronda
                    }
                }

                in.close(); // Cerrar el scanner
            }
        }



            /*
                // Bucle para ingresar características de ambos jugadores
        while (!salir && ronda <= maxRondas && vida1 > 0 && vida2 > 0) {
            System.out.println("=====================================================");
            System.out.println("-------------- RONDA " + ronda + " ------------------");

            // Determinación de orden de ataque
            boolean turnoJugador1 = true;
            if (velocidad1 == velocidad2) {
                turnoJugador1 = Math.random() < 0.5; // Empate de velocidad, elige al azar
            } else {
                turnoJugador1 = velocidad1 > velocidad2; // El jugador más rápido ataca primero
            }

            // Ejecuta ataque para ambos jugadores en orden de turno
            if (turnoJugador1) {
                vida2 = realizarAtaque(in, ataque1, defensa2, vida2, 1);
                if (vida2 > 0) vida1 = realizarAtaque(in, ataque2, defensa1, vida1, 2);
            } else {
                vida1 = realizarAtaque(in, ataque2, defensa1, vida1, 2);
                if (vida1 > 0) vida2 = realizarAtaque(in, ataque1, defensa2, vida2, 1);
            }

            System.out.println("Vida del Jugador 1: " + Math.max(0, vida1));
            System.out.println("Vida del Jugador 2: " + Math.max(0, vida2));
            ronda++;
        }

        // Determinación del ganador
        if (vida1 <= 0 && vida2 <= 0) {
            System.out.println("¡Ambos jugadores han caído! Es un empate.");
        } else if (vida1 <= 0) {
            System.out.println("¡Jugador 2 ha ganado!");
        } else if (vida2 <= 0) {
            System.out.println("¡Jugador 1 ha ganado!");
        } else {
            System.out.println("La batalla terminó en un empate después de " + maxRondas + " rondas.");
        }

        in.close();
    }

    // Función de ataque con elección de habilidades (usando estructuras de control
        System.out.println("Jugador " + jugador + ", elige una habilidad:");
        System.out.println("1. Ataque Potente (Aumenta daño en 20%)");
        System.out.println("2. Defensa Extra (Reduce el daño recibido en 20%)");
        System.out.println("3. Curación (Recupera 10 de vida)");

        int habilidad = in.nextInt();
        int danio = ataque - defensaOponente;
        if (danio < 1) danio = 1;

        switch (habilidad) {
            case 1:
                danio *= 1.2;
                System.out.println("Jugador " + jugador + " usa Ataque Potente. Daño causado: " + danio);
                vidaOponente -= danio;
                break;
            case 2:
                danio *= 0.8;
                System.out.println("Jugador " + jugador + " usa Defensa Extra. Daño causado reducido a: " + danio);
                vidaOponente -= danio;
                break;
            case 3:
                System.out.println("Jugador " + jugador + " usa Curación y recupera 10 puntos de vida.");
                vidaOponente += 10;
                if (vidaOponente > 200) vidaOponente = 200; // Máximo de vida permitido
                break;
            default:
                System.out.println("Habilidad no válida. Ataque básico usado. Daño: " + danio);
                vidaOponente -= danio;
                break;
        }
    }
}


            /*
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
*/



