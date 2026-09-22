/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_14_formula_general;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA_1_14_FORMULA_GENERAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c, x1, x2;
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura el valor de a = ");
        a = captu.nextDouble();
        System.out.println("Captura el valor de b = ");
        b = captu.nextDouble();
        System.out.println("Captura el valor de c = ");
        c = captu.nextDouble();
        x1 = (-1 * b + Math.sqrt((b*b) - (4 * a * c))) / (2 * a);
        x2 = (-1 * b + Math.sqrt((b*b) - (4 * a * c))) / (2 * a);
        
        //resultados 
        System.out.println(" Raiz 1 = " + x1);
        System.out.println(" Raiz 1 = " + x2);
        
        
    }
    
}
