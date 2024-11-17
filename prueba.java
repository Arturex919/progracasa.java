package Tema2_Ejercicos;

import java.util.Random;
import java.util.Scanner;

public class prueba{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        // Atributos básicos
        int lifepoint= 100, lifepoint_2 = 100; // Puntos de vida iniciales de ambos jugadores
        int defensa = 20, ataque = 50; // Atributos de Jugador 1
        int defensa_2 = 20, ataque_2 = 50; // Atributos de Jugador 2

        System.out.println(".   :%. .. .    . .    .  .    .  .    .  \n" +
                " .       .       .       .       . . t;% %88@SS8.   .     .      .       .      \n" +
                "   .  .    .  .    .  .    .  .   . S;.:....:;;8t8..   .    . .    .  .    .  . \n" +
                "  .    .  .    .  .    .  .    .  . 8;;8888X;:..S;. .    .      .   .   .   .   \n" +
                "    .       .       .       .     . 8.;@8St   S::.. . .    .  .   .   .   .    .\n" +
                "  .   . .    .  .    .  .    .  .  .;8  .8:%@:tS@:8 .   .       .       .    .  \n" +
                "    .     .    .  .    .  .    .  . ; 8888@888X8S%8..     . .      . .     .    \n" +
                "  .    .   .       .       .        .t88; 8S888888@ .  .      .  .     .     .  \n" +
                "     .   .   .  .    .  .    .  . . .;.@888:%88S88S. .   .  .   .   .    . .   .\n" +
                "  .    .      .   .   .   .   .    . S8X@@S.8888@t .      .   .   .   .      .  \n" +
                "    .     . .   .   .   .   .    . . X;8:@8888SX8... . .                .  .    \n" +
                "  .   .           .       .    .   .S%;@tX@88X8XX;tXS  8t. . .  .  . .    .   . \n" +
                "    .   . .  . .     . .    . . ;@%;8.:88%;t88%8888X8888% @      .     .        \n" +
                "  .         .    .       .  :@X8X% S88 XXS%tSS88@XS@SX8 @XXS8t..    .   .  . .  \n" +
                "     . .  .    .   . ...  t8XS8t.S 8S@S;8t;%%@8SS88%88888X888XX 8..   .        .\n" +
                "  .          .      .  ;8t@X8 88XX8888S 8.S;t;:8;8X8%8X@@:88t888@. . .   .  .   \n" +
                "    .  . . .    . . t@ :%;S88;;8t@88888S8%X:%XS.8@8@8888888.t8888@ %.  .   .  . \n" +
                "  .           .  :8;Xt 8@8t%.:t%%88S8XXt8;88:888@@%@88888X;888 8.%@8SS.  .      \n" +
                "    . .  .  . . 8X  %8%8@t88:88%% 88 8.S.88X@8@SXS8X88S@88.t8%8:.:8X@X .    .  .\n" +
                "  .       .  .8@  ;888X8SSt888:888@@@88:8.@@S XSX@8X@;88XS::t %S:@@88; .  .     \n" +
                "     . .   .@8   .%8;%@8XSt8@t8@S@%88@8@888888888%8888S@ .  . %:@SX@@X .    . . \n" +
                "  .      . S %St;8S888 .:  . 8888888%@tSS8@SX8XS S@8888% .  . 8:8S8%: .  .      \n" +
                "    .  . . :888@XS@8@.t...  .8XS:t@@ 8%@8888.8S8%8XX88 :. . . 8 8XS; .    .  .  \n" +
                "  .        .;;88888@S@X%. ..  .888XX@:88 8@%8888X@8X::8..%8X::t%t;8..   .      .\n" +
                "    . . .   .  8.%888S88  . . 88@@8  S:.%X88XSXt%8;:@8%:X@@S;t8X;:.   .   . .   \n" +
                "  .       .  ...8S8%S8X@S @..:@888888 @888;%%.S8t@X8t 8 .8888@S:;   .         . \n" +
                "     .  .       .  8XX.;@@8 S 88 8SXt.888t8%8888.8@8SSXX@8@SX t   .    . . .    \n" +
                "  .       .   .    .:;8;::88@@: .S%8.88@  S88t@8%Xt@8%.t;. 88        .       .  \n" +
                "    . .    .     .     .X .Xt@@@888X%.St8%S8t88tt;8 X%;%t%.:   .  .     .  .   .\n" +
                "  .     .    .       .  .  :.:X;;tttX@S.888SX88:8888tS    .     .   . .   .     \n" +
                "     .   .    . .  .        :;@ t8t8@8X8;  8X8S888:XtS     .  .         .   . . \n" +
                "  .    .   .     .    .    . t88%.88SSS8;888ttX888t88; .    .   . .  .    .     \n" +
                "   .  .     .  .   .   . .  .S888@88..8 8:t8@88 888@ .");}}