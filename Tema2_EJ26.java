package Tema2_Ejercicos;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Tema2_EJ26 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num,divi;
        System.out.println("ingrese un numero");
        num=in.nextInt();
        //vemos si el numero que metemos es igual que uno//
        // si es igual a uno no es primo porque solo tiene un divisor//
        if (num==1){
            System.out.println("no es primo");
        }else{
            divi=2;
            while (num%divi!=0){
                divi++;
                //entonces dividimos el numero que ingresamos para que este vaya sacando//
                // los numero que son primos mientras se va incrementando el valor//
            }
            if (divi==num){
                System.out.println("su numero es primo");
            }else{
                System.out.println("su numero no es primo");
            }
            //si el nuestro divisor es igual al numero que insertamos este va a decir//
            //si es primo o no//
        }
        in.close();
    }
}