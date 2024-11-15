package Tema2_Ejercicos;

import java.util.Random;
import java.util.Scanner;

public class Juego {public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // entero para eleccion de personaje//
    int personajes  ;

    // para el if de entrar al juego- tiene Y//
    int opciones;

    // int para las opcions del switch del menu//
    int opcions = 0;

    //caracteristicas del multijugador - Jugador 1//
    int jugador_1, velocidad = 0, ataque = 0, defensa = 0, lifepoint = 0, sal = 0, pp ;

    //boolean para salir del juego en cualquier momento//
    boolean salir = false;

    System.out.println("El maximo de poder de su personaje no debe de pasar de 500P");
    System.out.println("Las caracteristicas del jugador debe rondar entre 1P - 200P");
    System.out.print("¿Deseas continuar? (Y/N): ");

    // opciones con toUpperCase para que no importe si con mayuscula o no en la eleccion//
    opciones = in.next().toUpperCase().charAt(0);

    // dentro del if colocamos un booleano para que no digas cuales son nuestros valores reales o falso
    //  y creamos un do while para que no sobrepase el valor maximo
    // y que lo pueda corregir en caso de que falle//
    if (opciones == 'Y') {
        //creas stings para que añada los nombres y la habilidad de los personajes//
        //NOTA AGG LAS OTRAS HABILIDADES//
        String personaje="";
        String habilidad_final="";
        System.out.println("Seleccione a su personaje");
        System.out.println("1. Destructor");
        System.out.println("2. El vini");
        System.out.println("3. Kong's");
        personajes=in.nextInt();
        switch (personajes){
         case 1 ->{
            personaje="Destructor";
             System.out.println("DESTRUIR EL MUNDO QUIERO YO");
             System.out.println("GRAAHHHHHWWW");
             System.out.println("─────────▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄─────────\n" +
                     "───────▄▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▀▄───────\n" +
                     "──────▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌──────\n" +
                     "──────▐▒▒▒███▒▒▒▒▒▒▒▒███▒▒▒▌──────\n" +
                     "▄▄────▐▒▒▒███▒▒▒▒▒▒▒▒███▒▒▒▌────▄▄\n" +
                     "▌▒▀▄──▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌──▄▀▒▐\n" +
                     "▌▒▒▒▀▄█▒▒▒▄▀▄▄▀▀▄▄▀▀▄▄▀▄▒▒▒█▄▀▒▒▒▐\n" +
                     "▀▄▒▒▒▒▐▒▒▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌▒▒▌▒▒▒▒▄▀\n" +
                     "──▀▄▒▒▐▒▒▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌▒▒▌▒▒▄▀──\n" +
                     "────▀▄▐▒▒▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌▒▒▌▄▀────\n" +
                     "──────█▒▒▐▄▀▄▀▀▄▄▀▀▄▄▀▀▄▌▒▒█──────\n" +
                     "──────▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌──────\n" +
                     "──────▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌──────\n" +
                     "──────▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌──────\n" +
                     "──────▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌──────\n" +
                     "──────▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌──────\n" +
                     "──────▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌──────\n" +
                     "──────▐▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▌──────\n" +
                     "──────▐▒▒▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▒▒▌──────\n" +
                     "──────▐▒▒▒▒▒▒▓▓▄▀▀▄▓▓▒▒▒▒▒▒▌──────\n" +
                     "──────▐▒▒▒▒▒▒▒▒▌──▐▒▒▒▒▒▒▒▒▌──────\n" +
                     "──────▐▒▒▒▒▒▒▒▒▌──▐▒▒▒▒▒▒▒▒▌──────\n" +
                     "──────▐▒▒▒▒▒▒▒▒▌──▐▒▒▒▒▒▒▒▒▌──────\n" +
                     "──────▐▒▒▒▒▒▒▒▒▌──▐▒▒▒▒▒▒▒▒▌──────\n" +
                     "───────▀▀▀▀▀▀▀▀────▀▀▀▀▀▀▀▀──────");
             habilidad_final="Habilidad Final:Veneno-Veneno";
         }
          case 2 -> {
            System.out.println("el vini");
              System.out.println("Habilidad Final:Falsa ");

          }
            case 3->{
            System.out.println("Kong`s");
            System.out.println("Habilidad Final: Llama a sus Gangs");

            }
         default -> {
             System.out.println("opcion invalida");
         }
        }
        System.out.println("Has seleccionado: " + personaje);
        System.out.println("Habilidad Final: "+habilidad_final);
        //cree un booleano con caracteristicas correcta para saber si lo datos
        //que introducidos son correcto o no en caso de que no vuelve hasta que
        //sean correcto,lo colocamos arriba del do y lo volvemos añadir en el do, despues añadimos un do-while para que en el do contenga lo que es
        // la caracteristicas=true y añadimos el if para que este se pueda utilizar
        // para salir en cualquier momento y finalizar el juego//
        boolean caracteristica_correctas;
        do {
            caracteristica_correctas = true;
            if (!salir) {//sustituir a char
                System.out.println("Toque 0 para salir o 1 para continuar");
                sal = in.nextInt();

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
                }

            jugador_1 = velocidad + ataque + defensa + lifepoint;
            if (jugador_1 > 500) {
                System.out.println("ERROR");
                System.out.println("ingrese correctamente los datos...");
                caracteristica_correctas = false;
            }
            //creo un do while porque hasta que el booleano me diga que es falso este se va a repetir hasta
            //que se complete o me valide los datos ya qu eme verifica los datos hasta que sea correcto//
        } while (!caracteristica_correctas);

        System.out.println("FELICIDADES");
        System.out.println("Su personaje tiene un total de: " + jugador_1 + "P");
        System.out.println("Listo Empecemos el juego");
        System.out.println();
        //En este caso, !salir indica que el ciclo continua ejecutándose mientras salir sea
        // false. Este while es principal  ya que con este podemos hacer el menú en el que el jugador puede
        // hacer varias acciones como:
        while (!salir) {
            System.out.println("¿Qué deseas hacer ahora?");
            System.out.println("1. Ver atributos del personaje");
            System.out.println("2. Corregir los atributos del personaje");
            System.out.println("3. Continuar al siguiente personaje");
            System.out.println("4. Salir del juego");
            opcions = in.nextInt();
            switch (opcions) {
                case 1 -> {
                    System.out.println("Atributos del Jugador 1:");
                    System.out.println("=====================================================");
                    System.out.println("Velocidad: " + velocidad + "P");
                    System.out.println("Ataque: " + ataque + "P");
                    System.out.println("Defensa: " + defensa + "P");
                    System.out.println("Vida: " + lifepoint + "P");
                    System.out.println("El total de puntos del Jugador 2 es : " + jugador_1);
                }
                case 2 -> {
                    System.out.println("¿Qué atributo deseas corregir?");
                    System.out.println("1. Velocidad");
                    System.out.println("2. Ataque");
                    System.out.println("3. Defensa");
                    System.out.println("4. Vida");
                    System.out.println("5. Salir ");
                    int Corregir = in.nextInt();

                    switch (Corregir) {
                        case 1 -> {
                            System.out.println("Ingrese la nueva velocidad (debe estar entre 1 y 200)");
                            velocidad = in.nextInt();
                        }
                        case 2 -> {
                            System.out.println("Ingrese el nuevo ataque (entre 1 y 200): ");
                            ataque = in.nextInt();
                        }
                        case 3 -> {
                            System.out.println("Ingrese la nueva defensa (entre 1 y 200): ");
                            defensa = in.nextInt();
                        }
                        case 4 -> {
                            System.out.println("Ingrese la nueva vida (entre 1 y 200): ");
                            lifepoint = in.nextInt();
                        }
                        case 5 -> {
                            System.out.println("no se ha cambiando ningun atributo");
                        }

                        default -> System.out.println("opcion no valida");
                    }
                }
                case 3 -> {
                    System.out.println("Turno del Jugador 2");
                    System.out.println("añada los atributos del Jugador 2 ");
                    int jugador_2, velocidad_2 = 0, ataque_2 = 0, defensa_2 = 0, lifepoint_2 = 0;
                    boolean caracteristica_correctas2;
                    do {
                        caracteristica_correctas2 = true;

                                System.out.println("ingrese la velocidad del Jugador 2");
                                velocidad_2 = in.nextInt();
                                while (velocidad_2 > 200 || velocidad_2 < 1) {
                                    System.out.println("La velocidad no puede ser mayor de 200 ni menor que 1.");
                                    System.out.println("Intente de nuevo");
                                    System.out.print("Ingrese la velocidad del jugador 2: ");
                                    velocidad_2 = in.nextInt();
                                }

                                System.out.println("Ingrese la ataque del jugador 2");
                                ataque_2 = in.nextInt();
                                while (ataque_2 > 200 || ataque_2 < 1) {
                                    System.out.println("el ataque no puede ser mayor de 200 ni menor que 1.");
                                    System.out.println("Intente de nuevo");
                                    System.out.print("Ingrese el ataque del jugador 2: ");
                                    ataque_2 = in.nextInt();
                                }

                                System.out.println("ingrese la defensa del jugador 2");
                                defensa_2 = in.nextInt();
                                while (defensa_2 > 200 || defensa_2 < 1) {
                                    System.out.println("La defensa no puede ser mayor de 200 ni menor que 1.");
                                    System.out.println("Intente de nuevo");
                                    System.out.print("Ingrese la defensa del jugador 2: ");
                                    defensa_2 = in.nextInt();
                                }

                                System.out.println("");
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
                            caracteristica_correctas2 = false;
                        }

                    } while (!caracteristica_correctas2);
                    System.out.println("FELICIDADES");
                    System.out.println("Su personaje tiene un total de: " + jugador_2 + "P");
                    System.out.println("Listo Empecemos el juego");
                    System.out.println();

                    while (!salir) {
                        System.out.println("¿Qué deseas hacer ahora?");
                        System.out.println("1. Ver atributos del personaje");
                        System.out.println("2. Corregir los atributos del personaje");
                        System.out.println("3. Empezar el juego");
                        System.out.println("4. Salir del juego");
                        opcions = in.nextInt();
                        switch (opcions) {
                            case 1 -> {
                                System.out.println("Atributos del Jugador 2:");
                                System.out.println("=====================================================");
                                System.out.println("Velocidad: " + velocidad_2 + "P");
                                System.out.println("Ataque: " + ataque_2 + "P");
                                System.out.println("Defensa: " + defensa_2 + "P");
                                System.out.println("Vida: " + lifepoint_2 + "P");
                                System.out.println("El total de puntos del Jugador 2 es : " + jugador_2);
                            }
                            case 2 -> {
                                System.out.println("¿Qué atributo deseas corregir?");
                                System.out.println("1. Velocidad");
                                System.out.println("2. Ataque");
                                System.out.println("3. Defensa");
                                System.out.println("4. Vida");
                                int Corregir_2 = in.nextInt();

                                switch (Corregir_2) {
                                    case 1 -> {
                                        System.out.println("Ingrese la nueva velocidad (debe estar entre 1 y 200)");
                                        velocidad_2 = in.nextInt();
                                    }
                                    case 2 -> {
                                        System.out.println("Ingrese el nuevo ataque (entre 1 y 200): ");
                                        ataque_2 = in.nextInt();
                                    }
                                    case 3 -> {
                                        System.out.println("Ingrese la nueva defensa (entre 1 y 200): ");
                                        defensa_2 = in.nextInt();
                                    }
                                    case 4 -> {
                                        System.out.println("Ingrese la nueva vida (entre 1 y 200): ");
                                        lifepoint_2 = in.nextInt();
                                    }
                                    case 5 -> {
                                        System.out.println("no se ha cambiando ningun atributo");
                                    }
                                    default -> System.out.println("opcion no valida");
                                }
                            }
                            case 3 -> {
                                System.out.println("##############################################################################\n" +
                                        "#░█▀▄░▀█▀░█▀▀░█▀█░█░█░█▀▀░█▀█░▀█▀░█▀▄░█▀█░█▀▀░░░█▀█░█░░░░░▀▀█░█░█░█▀▀░█▀▀░█▀█#\n" +
                                        "#░█▀▄░░█░░█▀▀░█░█░▀▄▀░█▀▀░█░█░░█░░█░█░█░█░▀▀█░░░█▀█░█░░░░░░░█░█░█░█▀▀░█░█░█░█#\n" +
                                        "#░▀▀░░▀▀▀░▀▀▀░▀░▀░░▀░░▀▀▀░▀░▀░▀▀▀░▀▀░░▀▀▀░▀▀▀░░░▀░▀░▀▀▀░░░▀▀░░▀▀▀░▀▀▀░▀▀▀░▀▀▀#\n" +
                                        "##############################################################################");
                                System.out.println("CARACTERISTICA DE CADA JUGADOR");
                                System.out.println("=====================================================");
                                System.out.println("JUGADOR 1");
                                System.out.println("Velocidad:" + velocidad + "P");
                                System.out.println("Ataque:" + ataque + "P");
                                System.out.println("Puntos de ataque:");
                                System.out.println("Defensa:" + defensa + "P");
                                System.out.println("Puntos de vida:" + lifepoint + "P");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("=====================================================");
                                System.out.println("JUGADOR 2");
                                System.out.println("Velocidad:" + velocidad_2 + "P");
                                System.out.println("Ataque:" + ataque_2 + "P");
                                System.out.println("Defensa:" + defensa_2 + "P");
                                System.out.println("Puntos de vida:" + lifepoint_2 + "P");
                                System.out.println("habilidades:Golpe Cañon,Lanzallamas");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                // si creamos una ronda para que sea el contador//
                                // creamos un booleano que nos detrminara si acaba o no el juego//
                                int danio=0;
                                int danio2=0;
                                int total_danio,total_danio2;
                                Random random=new Random();
                                int ronda=1;
                                boolean fin_del_juego=false;
                                //punto de accion: caracteristica que nos avisa cuanto punto de ataque va a tener//
                                int puntos_de_accion,puntos_de_accion2;
                                puntos_de_accion=velocidad/2;
                                puntos_de_accion2=velocidad_2/2;
                                int daño_recibido,daño_recibido2;

                                //creados para restar los puntos de accion//
                                int menospa,menospa2;

                                //creamos un int y un booleano critico para saber si esta acierta al punto si lo acierta
                                //el golpe va a ser un critico//
                                int probabilidad_critico=25;
                                boolean critico=random.nextInt(50)<probabilidad_critico;
                                //creamos el while para determinar si el fin del juego es verdadero o no en caso de no
                                //serlo sigue y en caso de que el juego haya acabado este sera true//

                                while(!fin_del_juego){
                                    System.out.println("========================================");
                                    System.out.println("Ronda"+ronda);
                                    if (velocidad >= velocidad_2) {
                                        System.out.println("El player 1 es:"+velocidad);
                                    } else {
                                        System.out.println("El player 2 es:"+velocidad_2);
                                    }
                                    System.out.println("Player 1:");
                                    System.out.println("- Que deseas hacer:");
                                    System.out.println("1.Atacar");
                                    System.out.println("2.Defensa");
                                    System.out.println("3.Habilidad final");
                                    //creamos una opcion pelea para crea el switch que nos va ayudar a elegir las
                                    // opciones que necesitamos//
                                    int oppelea;
                                    oppelea= in.nextInt();

                                    //se creo para el swicth de ataquez//
                                    int ataquesz ;
                                    ataquesz=in.nextInt();
                                    //creamos un int de habilidad final y un ramdon para quue esta nos varie el daño y
                                    // se crea un conthabilidadfinal para que  solo podamos usarla 3 veces//
                                    int habilidad_finaldanio;
                                    int conthabilidadfinal=3;

                                    switch (oppelea){
                                        case 1->{
                                            System.out.println("Que ataques vas a realizar: ");

                                            switch (ataquesz){
                                                case 1->{
                                                    System.out.println("1.Mordedura de cierra");
                                                    danio = ataque - (defensa_2 / 2);
                                                    if (critico){
                                                        System.out.println("¡Crítico!");
                                                        //al usar (int) este convierte el decimal en entero//
                                                        danio = (int)(danio * 1);
                                                    }
                                                    total_danio = Math.max(0, danio - random.nextInt(3));
                                                    lifepoint_2 -= total_danio;
                                                    menospa=puntos_de_accion-3;
                                                    System.out.println("Haz utilizado Mordedura,les has quitado al jugador 1 :"+total_danio+"vida");
                                                }
                                                case 2->{
                                                    System.out.println("2.Llanto mortal");
                                                    danio = ataque - (defensa_2 / 2);
                                                    if (critico) {
                                                        System.out.println("¡Crítico!");
                                                        danio = (int) (danio * 1);
                                                    }
                                                    total_danio = Math.max(0, danio - random.nextInt(3));
                                                    lifepoint_2 -= total_danio;
                                                    menospa=puntos_de_accion-4;
                                                    System.out.println("Haz utilizado Llanto Mortal,les has quitado al jugador 1 :"+total_danio+"vida");
                                                }
                                                case 3->{
                                                    System.out.println("3.Respaldo");
                                                    danio = ataque - (defensa_2 / 2);
                                                    if (critico) {
                                                        System.out.println("¡Crítico!");
                                                        danio = (int) (danio * 1);
                                                    }
                                                    total_danio = Math.max(0, danio - random.nextInt(3));
                                                    lifepoint_2 -= total_danio;
                                                    menospa=puntos_de_accion-2;
                                                    System.out.println("Haz utilizado Respaldo,les has quitado al jugador 1 :"+total_danio+"vida");
                                                }
                                                case 4 ->{
                                                    System.out.println("4.Explocion");
                                                    danio = ataque - (defensa_2 / 2);
                                                    if (critico) {
                                                        System.out.println("¡Crítico!");
                                                        danio = (int) (danio * 1.5);
                                                    }
                                                    total_danio = Math.max(0, danio - random.nextInt(3));
                                                    lifepoint_2 -= total_danio;
                                                    menospa=puntos_de_accion-3;
                                                    System.out.println("Haz utilizado Explocion,les has quitado al jugador 1 :"+total_danio+"vida");
                                                    System.out.println("Sus PP son :"+menospa);
                                                }
                                                default -> {
                                                    System.out.println("comando no reconocido");
                                                }
                                            }
                                        }case 2->{
                                            System.out.println("¿Deseas aumentar tu defensa un 10% por reducir tu vida un 5%?");
                                            String elige;
                                            elige= in.nextLine();
                                            switch (elige){
                                                case "SI"->{
                                                    int defensa_extra = (int) (defensa * 0.1); // Aumentar la defensa un 10%

                                                    // Aplicar defensa adicional
                                                    defensa += defensa_extra;

                                                    // Reducción del 5% de vida como penalización
                                                    int vidaPerdida = (int) (lifepoint * 0.05); // 5% de la vida
                                                    lifepoint -= vidaPerdida;
                                                    System.out.println("Defensa aumentada en " + defensa_extra + " puntos.");
                                                    System.out.println("Jugador 1 perdió " + vidaPerdida + " puntos de vida al defenderse.");
                                                    menospa=puntos_de_accion-6;
                                                    System.out.println("Sus PP son :"+menospa);
                                                }
                                                case "NO"->{
                                                    System.out.println("El jugador no hizo ningun cambio");
                                                }
                                                default -> {
                                                    System.out.println("El jugador uno uso defensa");

                                                }

                                            }
                                        }
                                        case 3-> {
                                            System.out.println("El jugador utilizo su Habilidad final." + habilidad_final);
                                            if (conthabilidadfinal > 0) {
                                                habilidad_finaldanio = (int) (ataque * 0.50) + random.nextInt(5) + 3;
                                                lifepoint_2 -= habilidad_finaldanio;
                                                System.out.println("La habilidad final causó " + habilidad_finaldanio + " de daño.");
                                                System.out.println("La vida del oponente ahora es: " + lifepoint_2);
                                                conthabilidadfinal--;
                                                System.out.println("Te quedan " + conthabilidadfinal + " usos de la habilidad final.");
                                            } else {
                                                // Si no quedan usos de la habilidad final
                                                System.out.println("Ya no tienes más usos de la habilidad final.");
                                            }
                                        }
                                            default -> System.out.println("Opción no reconocida");


                                        }
                                    }



//Notas cprregir el swicth que no aparece y cambiar ciertas palabras del opcion menu 2//



                                    }
                            }
                        }
                    }//!salir//
                }
            }
        }
        }
        }

/*
-

            System.out.println("##############################################################################\n" +
                    "#░█▀▄░▀█▀░█▀▀░█▀█░█░█░█▀▀░█▀█░▀█▀░█▀▄░█▀█░█▀▀░░░█▀█░█░░░░░▀▀█░█░█░█▀▀░█▀▀░█▀█#\n" +
                    "#░█▀▄░░█░░█▀▀░█░█░▀▄▀░█▀▀░█░█░░█░░█░█░█░█░▀▀█░░░█▀█░█░░░░░░░█░█░█░█▀▀░█░█░█░█#\n" +
                    "#░▀▀░░▀▀▀░▀▀▀░▀░▀░░▀░░▀▀▀░▀░▀░▀▀▀░▀▀░░▀▀▀░▀▀▀░░░▀░▀░▀▀▀░░░▀▀░░▀▀▀░▀▀▀░▀▀▀░▀▀▀#\n" +
                    "##############################################################################");

        }
        case 'N' -> {
            System.out.println("+============================================================================+\n" +
                    "|░█░█░█▀█░█▀▀░▀█▀░█▀█░░░█░░░█▀█░░░█▀█░█▀▄░█▀█░█░█░▀█▀░█▄█░█▀█░█▀█░█▀█░█▀█░█▀█|\n" +
                    "|░█▀█░█▀█░▀▀█░░█░░█▀█░░░█░░░█▀█░░░█▀▀░█▀▄░█░█░▄▀▄░░█░░█░█░█▀█░█▀█░█▀█░█▀█░█▀█|\n" +
                    "|░▀░▀░▀░▀░▀▀▀░░▀░░▀░▀░░░▀▀▀░▀░▀░░░▀░░░▀░▀░▀▀▀░▀░▀░▀▀▀░▀░▀░▀░▀░▀░▀░▀░▀░▀░▀░▀░▀|\n" +
                    "+============================================================================+");
        }
        default -> {
            System.out.println("opcion no valida");
        }
    }*/


