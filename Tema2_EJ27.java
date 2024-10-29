package Tema2_Ejercicos;

import java.util.Scanner;

import static Tema2_Ejercicos.Tema2_EJ28.esPrimo;

public class Tema2_EJ27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont=0 ,num=2,a;
        System.out.println("los 20 numeros primos son");

        while (cont<=20){
            if (esPrimo (num)){
                System.out.println(num+"");
                cont++;
            }
            num++;
            if (num<=1);
            for (a=1;a<=Math.sqrt(num);a++){
            if (num%a==0);
            }
        }
    }
}

