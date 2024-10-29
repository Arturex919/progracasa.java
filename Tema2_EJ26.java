package Tema2_Ejercicos;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Tema2_EJ26 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,cont=0;
        int aux;
        System.out.println("introduzca un numero");
        a=in.nextInt();
        for (b=1; b<=a;b++){
            aux=b%a;
        }
        if (cont<=2){
            System.out.println("el numero es primo");
        }else{
            System.out.println("el numero no es primo");

        }


    }


}
