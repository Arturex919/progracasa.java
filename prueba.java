package Tema2_Ejercicos;

import java.util.Random;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random
                random = new Random();

        int vidaJugador1 = 100;
        int vidaJugador2 = 100;
        int ronda = 1;

        while (vidaJugador1 > 0 && vidaJugador2 > 0) {
            System.out.println("************************************************************************************************");
            System.out.println("RONDA " + ronda);
            System.out.printf("Jugador 1: %d -----------------------------------------------------------------------------------%n", vidaJugador1);
            System.out.printf("Jugador 2: %d -----------------------------------------------------------------------------------%n", vidaJugador2);

            // Decidir quién golpea primero
            boolean jugador2GolpeaPrimero = (ronda % 2 == 1); // Jugador 2 golpea primero en rondas impares

            // Daño aleatorio entre 0 y 10
            int danioJugador1 = calcularDanio(random);
            int danioJugador2 = calcularDanio(random);

            // Aplicar habilidades especiales
            boolean habilidadJugador1 = random.nextBoolean(); // true si se activa la habilidad
            boolean habilidadJugador2 = random.nextBoolean(); // true si se activa la habilidad

            if (jugador2GolpeaPrimero) {
                danioJugador1 = aplicarHabilidad(danioJugador1, habilidadJugador1, "Jugador 1");
                System.out.println("Jugador 2 golpea primero con " + danioJugador2 + " de daño");
                vidaJugador1 -= danioJugador2;
                if (vidaJugador1 <= 0) vidaJugador1 = 0;

                System.out.println("Jugador 1 golpea con " + danioJugador1 + " de daño");
                vidaJugador2 -= danioJugador1;
                if (vidaJugador2 <= 0) vidaJugador2 = 0;

            } else {
                danioJugador2 = aplicarHabilidad(danioJugador2, habilidadJugador2, "Jugador 2");
                System.out.println("Jugador 1 golpea primero con " + danioJugador1 + " de daño");
                vidaJugador2 -= danioJugador1;
                if (vidaJugador2 <= 0) vidaJugador2 = 0;

                System.out.println("Jugador 2 golpea con " + danioJugador2 + " de daño");
                vidaJugador1 -= danioJugador2;
                if (vidaJugador1 <= 0) vidaJugador1 = 0;
            }

            // Mostrar la vida después de la ronda
            System.out.printf("Jugador 1: %d -----------------------------------------------------------------------------------%n", vidaJugador1);
            System.out.printf("Jugador 2: %d -----------------------------------------------------------------------------------%n", vidaJugador2);

            // Pausar para la siguiente ronda
            if (vidaJugador1 > 0 && vidaJugador2 > 0) {
                System.out.print("Introduce cualquier caracter para continuar: ");
                scanner.nextLine();
            }

            System.out.println("************************************************************************************************");
            ronda++;
        }

        // Determinar el ganador
        if (vidaJugador1 > 0) {
            System.out.println("¡Jugador 1 ha ganado la batalla!");
        } else if (vidaJugador2 > 0) {
            System.out.println("¡Jugador 2 ha ganado la batalla!");
        } else {
            System.out.println("¡Es un empate!");
        }

        scanner.close();
    }

    // Método que calcula el daño, incluyendo la posibilidad de golpe crítico
    public static int calcularDanio(Random random) {
        int danioBase = random.nextInt(11); // Daño entre 0 y 10
        boolean esCritico = random.nextDouble() < 0.2; // 20% de probabilidad de crítico

        if (esCritico) {
            System.out.println("¡Golpe crítico! Daño aumentado a 1.5x");
            return (int)(danioBase * 1.5); // Daño crítico es 1.5 veces el daño base
        } else {
            return danioBase;
        }
    }

    // Método que aplica la habilidad especial si está activa
    public static int aplicarHabilidad(int danio, boolean habilidadActiva, String jugador) {
        if (habilidadActiva) {
            System.out.println(jugador + " activa su habilidad especial: Doble golpe!");
            danio += (int)(danio * 0.5); // Aumenta el daño en un 50%
        }
        return danio;
    }}


