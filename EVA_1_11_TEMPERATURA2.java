/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_11_temperatura.pkg2;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA_1_11_TEMPERATURA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double fare, cel, kelvin;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce los grados Fahrenhheit");
        fare = captu.nextDouble();
        //conversion
        cel = (fare - 32) / 1.8; //aqui si importa el parentesis
        kelvin = (fare - 32) * (5/9.0) + 273.15; //ojo: 5 / 9 da cero, 5 / 9.0 da o.5
        //imprimir resultados 
        System.out.println(fare + "°F = " + cel + "°C");
        System.out.println(fare + "°F = " + kelvin + "°K");
                
    }
    
}
