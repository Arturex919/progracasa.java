package Tema2_Ejercicos;

import java.util.Random;
import java.util.Scanner;

public class vspc {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        // Variables generales
        int pc, multiplayer, juego;
        int ataquePc, defensaPc, velocidadPc, lifepointPc,jugador1pc;
        int ataqueJugador2 = 0, defensaJugador2 = 0, velocidadJugador2 = 0, lifepoint2 = 0;

        System.out.println("Seleccione la forma en la que quiere jugar:");
        System.out.println("1. Jugar contra la máquina");
        System.out.println("2. Multiplayer");
        System.out.print("Elija (1 o 2): ");
        juego = in.nextInt();

        if (juego == 1) {
            // Variables para el Jugador 1 (Usuario)
            boolean caracteristicasCorrectas;
            int jugador_1 = 0;

            do {
                caracteristicasCorrectas = true;

                // Ingreso de atributos del Jugador 1
                System.out.println("Ingrese la velocidad del Jugador 1 (1 a 200): ");
                velocidadPc = in.nextInt();
                while (velocidadPc > 200 || velocidadPc < 1) {
                    System.out.println("Error: la velocidad debe estar entre 1 y 200. Intente de nuevo:");
                    velocidadPc = in.nextInt();
                }

                System.out.println("Ingrese el ataque del Jugador 1 (1 a 200): ");
                ataquePc = in.nextInt();
                while (ataquePc > 200 || ataquePc < 1) {
                    System.out.println("Error: el ataque debe estar entre 1 y 200. Intente de nuevo:");
                    ataquePc = in.nextInt();
                }

                System.out.println("Ingrese la defensa del Jugador 1 (1 a 200): ");
                defensaPc = in.nextInt();
                while (defensaPc > 200 || defensaPc < 1) {
                    System.out.println("Error: la defensa debe estar entre 1 y 200. Intente de nuevo:");
                    defensaPc = in.nextInt();
                }

                System.out.println("Ingrese la vida del Jugador 1 (1 a 200): ");
                lifepointPc = in.nextInt();
                while (lifepointPc > 200 || lifepointPc < 1) {
                    System.out.println("Error: la vida debe estar entre 1 y 200. Intente de nuevo:");
                    lifepointPc = in.nextInt();
                }

                // Verificar si la suma de los atributos no excede el límite
                jugador1pc = velocidadPc + ataquePc + defensaPc + lifepointPc;
                if (jugador_1 > 500) {
                    System.out.println("ERROR: La suma de los atributos no puede exceder los 500 puntos.");
                    caracteristicasCorrectas = false;
                }

            } while (!caracteristicasCorrectas);

            System.out.println("FELICIDADES, tu personaje tiene un total de: " + jugador1pc + " puntos.");

            boolean salir = false;
            while (!salir) {
                System.out.println("¿Qué deseas hacer ahora?");
                System.out.println("1. Ver atributos del personaje");
                System.out.println("2. Corregir los atributos del personaje");
                System.out.println("3. Continuar al siguiente personaje");
                System.out.println("4. Salir del juego");
                int opcion = in.nextInt();

                switch (opcion) {
                    case 1 -> {
                        // Mostrar los atributos del Jugador 1
                        System.out.println("Atributos del Jugador 1:");
                        System.out.println("=====================================================");
                        System.out.println("⚡" + "Velocidad:" + velocidadPc + "P");
                        System.out.println("⚔️" + "Ataque:" + ataquePc + "P");
                        System.out.println("🛡️" + "Defensa:" + defensaPc + "P");
                        System.out.println("❤️" + "Vida:" + lifepointPc + "P");
                        System.out.println("El total de puntos del Jugador 1 es : " + jugador1pc);
                    }

                    case 2 -> {
                        // Opción para corregir atributos
                        boolean corregirpc = false;
                        while (!corregirpc) {
                            System.out.println("¿Qué atributo deseas corregir?");
                            System.out.println("1. Velocidad");
                            System.out.println("2. Ataque");
                            System.out.println("3. Defensa");
                            System.out.println("4. Vida");
                            System.out.println("5. Regresar al menú");
                            int atributo = in.nextInt();

                            switch (atributo) {
                                case 1 -> {
                                    System.out.println("Ingrese la nueva velocidad (1 a 200):");
                                    velocidadPc = in.nextInt();
                                    while (velocidadPc > 200 || velocidadPc < 1) {
                                        System.out.println("La velocidad no puede ser mayor de 200 ni menor que 1.");
                                        System.out.println("Intente de nuevo");
                                        System.out.print("Ingrese la velocidad del jugador : ");
                                        velocidadPc = in.nextInt();
                                    }
                                }
                                case 2 -> {
                                    System.out.println("Ingrese el nuevo ataque (1 a 200):");
                                    ataquePc = in.nextInt();
                                    while (ataquePc > 200 || ataquePc < 1) {
                                        System.out.println("el ataque no puede ser mayor de 200 ni menor que 1.");
                                        System.out.println("Intente de nuevo");
                                        System.out.print("Ingrese el ataque del jugador : ");
                                        ataquePc = in.nextInt();
                                    }
                                }
                                case 3 -> {
                                    System.out.println("Ingrese la nueva defensa (1 a 200):");
                                    defensaPc = in.nextInt();
                                    while (defensaPc > 200 || defensaPc < 1) {
                                        System.out.println("La defensa no puede ser mayor de 200 ni menor que 1.");
                                        System.out.println("Intente de nuevo");
                                        System.out.print("Ingrese la defensa del jugador 2: ");
                                        defensaPc = in.nextInt();
                                    }
                                }
                                    case 4 -> {
                                        System.out.println("Ingrese la nueva vida (entre 1 y 200): ");
                                        lifepointPc = in.nextInt();
                                        while (lifepointPc > 200 || lifepointPc < 1) {
                                            System.out.println("la vida no puede ser mayor de 200 ni menor que 1.");
                                            System.out.println("Intente de nuevo");
                                            System.out.println("ingrese la vida del jugador 2");
                                            lifepointPc = in.nextInt();
                                        }
                                    }
                                case 5 -> {
                                    System.out.println("No se realizo ningun cambio");// Salir de corrección
                                }
                                default -> System.out.println("Opción no válida.");
                            }
                        }
                    }

                    case 3 -> {
                        // Continuar al combate con Jugador 2
                        System.out.println("Selecciona la dificultad para el Jugador 2 (computadora):");
                        System.out.println("1. Fácil");
                        System.out.println("2. Medio");
                        System.out.println("3. Difícil");
                        System.out.println("4. Kaos");
                        System.out.println("5. Al azar");
                        int dificultad = in.nextInt();

                        switch (dificultad) {
                            case 1 -> ataqueJugador2 = defensaJugador2 = velocidadJugador2 = lifepoint2 = 50;
                            case 2 -> ataqueJugador2 = defensaJugador2 = velocidadJugador2 = lifepoint2 = 100;
                            case 3 -> ataqueJugador2 = defensaJugador2 = velocidadJugador2 = lifepoint2 = 150;
                            case 4 -> ataqueJugador2 = defensaJugador2 = velocidadJugador2 = lifepoint2 = 200;
                            case 5 -> {
                                int dificultadAleatoria = (int) (Math.random() * 4) + 1;
                                System.out.println("Se ha asignado dificultad " + dificultadAleatoria);
                                switch (dificultadAleatoria) {
                                    case 1 -> ataqueJugador2 = defensaJugador2 = velocidadJugador2 = lifepoint2 = 50;
                                    case 2 -> ataqueJugador2 = defensaJugador2 = velocidadJugador2 = lifepoint2 = 100;
                                    case 3 -> ataqueJugador2 = defensaJugador2 = velocidadJugador2 = lifepoint2 = 150;
                                    case 4 -> ataqueJugador2 = defensaJugador2 = velocidadJugador2 = lifepoint2 = 200;
                                }
                            }
                            default ->
                                    ataqueJugador2 = defensaJugador2 = velocidadJugador2 = lifepoint2 = 50; // Valores por defecto
                        }

                        // Inicio del combate
                        System.out.println("Combate iniciado...");
                        boolean combateTerminado = false;
                        int vidaJugador1 = lifepointPc;
                        int vidaJugador2 = lifepoint2;

                        while (!combateTerminado) {
                            boolean jugador1AtacaPrimero = velocidadPc > velocidadJugador2
                                    || (velocidadPc == velocidadJugador2 && Math.random() > 0.5);

                            if (jugador1AtacaPrimero) {
                                int daño = Math.max(ataquePc - defensaJugador2, 0);
                                vidaJugador2 -= daño;
                                System.out.println("Jugador 1 ataca y causa " + daño + " de daño. Vida Jugador 2: " + vidaJugador2);
                                combateTerminado = vidaJugador2 <= 0;
                                if (combateTerminado) {
                                    System.out.println("¡Jugador 1 ha ganado!");
                                }
                            } else {
                                int daño = Math.max(ataqueJugador2 - defensaPc, 0);
                                vidaJugador1 -= daño;
                                System.out.println("Jugador 2 ataca y causa " + daño + " de daño. Vida Jugador 1: " + vidaJugador1);
                                combateTerminado = vidaJugador1 <= 0;
                                if (combateTerminado) {
                                    System.out.println("¡Jugador 2 ha ganado!");
                                }
                            }
                        }
                    }

                    case 4 -> salir = true;

                    default -> System.out.println("Opción no válida.");
                }
            }
            System.out.println("Gracias por jugar. ¡Hasta la próxima!");
            in.close();
        }}}
