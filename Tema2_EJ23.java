package Tema2_Ejercicos;

import java.util.Scanner;

public class Tema2_EJ23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double suma = 0;
        int num,cont=0;

        System.out.println("ingrese un numero");
        num= in.nextInt();
        while (num >=0){
            cont++;
            suma=suma+num;
            System.out.println("la media es = "+suma/cont);
            System.out.println("ingrese un numero");
            num= in.nextInt();
        }



    }
     }
