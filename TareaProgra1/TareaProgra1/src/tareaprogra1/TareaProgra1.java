/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaprogra1;

import java.util.Scanner;

/**
 *
 * @author Gloria
 */
public class TareaProgra1 {

    
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nombre;
       double cantidad;
       double resultado;
       int opcion;
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Ingrese  su nombre: ");
       nombre = sc.nextLine();
       System.out.println("Ingrese una cantidad de dinero: ");
       cantidad = sc.nextDouble();
       
           System.out.println("1. Dólares.");
           System.out.println("2. Euros.");
           System.out.println("3. Yuanes.");
           System.out.println("4. Deseo salir.");
            
           System.out.println("¿A qué desea convertirlo?");
           opcion = sc.nextInt();
           
           switch(opcion){
               case 1:
                   resultado = cantidad * 7.75;
                   System.out.println("El resultado es: " + resultado);
                   break;
               case 2:
                    resultado = cantidad * 9.15;
                   System.out.println("El resulto es: " + resultado);
                   break;
                case 3:
                   resultado = cantidad * 1.20;
                   System.out.println("El resulto es: " + resultado);
                   break;
                case 4:
                   break;
                default:
                   System.out.println("Esa opción no existe");
           
            
       }
    }
    
    
   
}
