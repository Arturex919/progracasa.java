package Tema2_Ejercicos;
import java.util.Random;
import java.util.Scanner;
public class JUEGO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char opciones;
        int jugador_1, velocidad = 0, ataque = 0, defensa = 0, lifepoint = 0;
        System.out.println("El maximo de poder de su personaje no debe de pasar de 500P");
        System.out.println("Las caracteristicas del jugador debe rondar entre 1P - 200P");
        System.out.print("¿Deseas continuar? (Y/N): ");
        opciones = in.next().charAt(0);
        //colocamos un SWICHT para que el usuario si desea entre o no al juego
        // dentor del swicht colocamos un while para que no sobrepase el valor maximo
        // y que lo pueda corregir en caso de que falle//
        switch (opciones) {
            case 'Y' -> {
                //cree un booleano cin caracteristicas correcta para saber si lo datos
                //que introducidos son correcto o no en caso de que no vuelve hasta que
                //sean correcto, despues añadimos un do whilepara que este se pueda utilizar
                //con el booleano//
                boolean caracteristica_correctas, caracteriticas_correctas2;
                do {
                    caracteristica_correctas = true;

                    System.out.println("ingrese la velocidad del Jugador 1");
                    velocidad = in.nextInt();
                    while (velocidad > 200 || velocidad < 1) {
                        System.out.println("La velocidad no puede ser mayor de 200 ni menor que 1.");
                        System.out.println("Intente de nuevo");
                        System.out.print("Ingrese la velocidad del jugador 1: ");
                        velocidad = in.nextInt();
                    }
                    System.out.println("Ingrese la ataque del jugador 1");
                    ataque = in.nextInt();
                    while (ataque > 200 || ataque < 1) {
                        System.out.println("el ataque no puede ser mayor de 200 ni menor que 1.");
                        System.out.println("Intente de nuevo");
                        System.out.print("Ingrese el ataque del jugador 1: ");
                        ataque = in.nextInt();
                    }
                    System.out.println("ingrese la defensa del jugador 1");
                    defensa = in.nextInt();
                    while (defensa > 200 || defensa < 1) {
                        System.out.println("La defensa no puede ser mayor de 200 ni menor que 1.");
                        System.out.println("Intente de nuevo");
                        System.out.print("Ingrese la defensa del jugador 1: ");
                        defensa = in.nextInt();
                    }
                    System.out.println("ingrese la vida del jugador 1");
                    lifepoint = in.nextInt();
                    while (lifepoint > 200 || lifepoint < 1) {
                        System.out.println("la vida no puede ser mayor de 200 ni menor que 1.");
                        System.out.println("Intente de nuevo");
                        System.out.println("ingrese la vida del jugador 1");
                        lifepoint = in.nextInt();
                    }
                    jugador_1 = velocidad + ataque + defensa + lifepoint;
                    if (jugador_1 > 500) {
                        System.out.println("ERROR");
                        System.out.println("ingrese correctamente los datos...");
                        caracteristica_correctas = false;
                    }
                } while (!caracteristica_correctas);
                System.out.println("FELICIDADES");
                System.out.println("Su personaje tiene un total de: " + jugador_1 + "P");
                System.out.println("Listo Empecemos el juego");
                //iniciamos Jugador 2//
                int jugador_2, velocidad_2 = 0, ataque_2 = 0, defensa_2 = 0, lifepoint_2 = 0;
                do {
                    caracteriticas_correctas2 = true;
                    System.out.println("Ingrese la velocidad del Jugador 2");
                    velocidad_2 = in.nextInt();
                    while (velocidad_2 > 200 || velocidad_2 < 1) {
                        System.out.println("La velocidad no puede ser mayor de 200 ni menor que 1.");
                        System.out.println("Intente de nuevo");
                        System.out.print("Ingrese la velocidad del jugador 2: ");
                        velocidad_2 = in.nextInt();
                    }
                    System.out.println("ingrese la ataque del jugador 2");
                    ataque_2 = in.nextInt();
                    while (ataque_2 > 200 || ataque_2<1) {
                        System.out.println("el ataque no puede ser mayor de 200 ni menor que 1.");
                        System.out.println("Intente de nuevo");
                        System.out.print("Ingrese el ataque del jugador 2: ");
                        ataque_2 = in.nextInt();
                    }
                    System.out.println("ingrese la defensa del jugador 2:");
                    defensa_2 = in.nextInt();
                    while (defensa_2 > 200 || defensa_2 < 1) {
                        System.out.println("La defensa no puede ser mayor de 200 ni menor que 1.");
                        System.out.println("Intente de nuevo");
                        System.out.print("Ingrese la defensa del jugador 2: ");
                        defensa_2 = in.nextInt();
                    }
                    System.out.println("ingrese la vida del jugador 2");
                    lifepoint_2 = in.nextInt();
                    while (lifepoint_2 > 200 || lifepoint_2 < 1) {
                        System.out.println("la vida no puede ser mayor de 200 ni menor que 1.");
                        System.out.println("Intente de nuevo");
                        System.out.println("ingrese la vida del jugador 2");
                        lifepoint_2 = in.nextInt();
                    }
                    jugador_2 = velocidad_2 + ataque_2 + defensa_2 + lifepoint_2;
                    if (jugador_2 > 500) {
                        System.out.println("ERROR");
                        System.out.println("ingrese correctamente los datos...");
                        caracteriticas_correctas2 = false;
                    }
                } while (!caracteriticas_correctas2);
                System.out.println("FELICIDADES");
                System.out.println("Su personaje tiene un total de: " + jugador_2 + "P");
                System.out.println("Listo Empecemos el juego");
                System.out.println("##############################################################################\n" +
                        "#░█▀▄░▀█▀░█▀▀░█▀█░█░█░█▀▀░█▀█░▀█▀░█▀▄░█▀█░█▀▀░░░█▀█░█░░░░░▀▀█░█░█░█▀▀░█▀▀░█▀█#\n" +
                        "#░█▀▄░░█░░█▀▀░█░█░▀▄▀░█▀▀░█░█░░█░░█░█░█░█░▀▀█░░░█▀█░█░░░░░░░█░█░█░█▀▀░█░█░█░█#\n" +
                        "#░▀▀░░▀▀▀░▀▀▀░▀░▀░░▀░░▀▀▀░▀░▀░▀▀▀░▀▀░░▀▀▀░▀▀▀░░░▀░▀░▀▀▀░░░▀▀░░▀▀▀░▀▀▀░▀▀▀░▀▀▀#\n" +
                        "##############################################################################");
                System.out.println("JUGADOR 1");
                System.out.println("Velocidad:"+velocidad+"P");
                System.out.println("Ataque:"+ataque+"P");
                System.out.println("Defensa:"+defensa+"P");
                System.out.println("Puntos de vida:"+lifepoint+"P");
                System.out.println("");
                System.out.println("");
                System.out.println("JUGADOR 2");
                System.out.println("Velocidad:"+velocidad_2+"P");
                System.out.println("Ataque:"+ataque_2+"P");
                System.out.println("Defensa:"+defensa_2+"P");
                System.out.println("Puntos de vida:"+lifepoint_2+"P");
                System.out.println("habilidades:Golpe Cañon,Lanzallamas");
                //colocas un radom para que la habilidades no tenga un solo valor y puedas bajar vida//
                int ronda=1;
                Random random= new Random();
                while (jugador_1>0 &&jugador_2>0){
                    System.out.println("===========================================================================");
                    System.out.println("-----------------RONDA"+ronda+"----------------");
                    System.out.println("Jugador 1");
                }
            }
            case 'N'->{
                System.out.println("+============================================================================+\n" +
                        "|░█░█░█▀█░█▀▀░▀█▀░█▀█░░░█░░░█▀█░░░█▀█░█▀▄░█▀█░█░█░▀█▀░█▄█░█▀█░█▀█░█▀█░█▀█░█▀█|\n" +
                        "|░█▀█░█▀█░▀▀█░░█░░█▀█░░░█░░░█▀█░░░█▀▀░█▀▄░█░█░▄▀▄░░█░░█░█░█▀█░█▀█░█▀█░█▀█░█▀█|\n" +
                        "|░▀░▀░▀░▀░▀▀▀░░▀░░▀░▀░░░▀▀▀░▀░▀░░░▀░░░▀░▀░▀▀▀░▀░▀░▀▀▀░▀░▀░▀░▀░▀░▀░▀░▀░▀░▀░▀░▀|\n" +
                        "+============================================================================+");
            }
            default -> {
                System.out.println("opcion no valida");
            }
        }
    }}



