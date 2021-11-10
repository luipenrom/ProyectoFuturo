package proyectofuturo2;

import java.util.Scanner;

public class ProyectoFuturo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String n ;
        String h ;
             
        System.out.print("Estudiante: ");
        nombre = sc.nextLine();
        System.out.print("Módulos matriculados: ");
        h = sc.nextLine();
        System.out.print("Horas semanales de estudio: ");
        n = sc.nextLine();
        
        String Veredicto1 = veredicto(n,h);
        System.out.println(Veredicto1);
    }
         static String veredicto(String valor1, String valor2) {

            if (valor1.equals(valor2)) {
             return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
         }
         if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
             return "Poco tiempo de estudio. Debes dedicar más tiempo.";
         }
         return "Ideal. Trabajas los contenidos en casa.";
    }
}