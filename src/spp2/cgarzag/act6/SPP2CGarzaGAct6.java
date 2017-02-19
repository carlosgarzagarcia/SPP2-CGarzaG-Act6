/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.cgarzag.act6;
import java.util.Scanner;
/**
 *
 * @author Carlos Rafael
 */
public class SPP2CGarzaGAct6 {

 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     int factorial=1;   
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = entrada.nextInt();
         if(num==10){
            System.exit(0);
        }
         else{
             
        for (int contador = num; contador > 0; contador--) {
            factorial = factorial * contador;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
         }
    }
}
