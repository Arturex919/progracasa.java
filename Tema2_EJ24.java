package Tema2_Ejercicos;

import java.util.Scanner;

public class Tema2_EJ24 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double a;
        int b,c;
        b=0;
        c=0;
        System.out.println("para saber el numero de alumnos suspendidos cerrar con un numero negativo");
        while (0==0){
            System.out.println("introduzca la nota del alumno");
            a= in.nextDouble();
            if (a<0){
                break;
            }
            if (a>=5){
                b++;

            }else {
                c++;
            }
        }
        System.out.println("el numeros de aprobado es:"+b);
        System.out.println("el numeros de reprobado es:" +c);
    }
}
