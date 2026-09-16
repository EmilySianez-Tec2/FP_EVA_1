/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_12_temperatura_3;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA_1_12_TEMPERATURA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double kelvin, fare, celsius;
        Scanner captu = new Scanner (System.in);
        System.out.println("Introduce los grados Kelvin");
        kelvin = captu.nextDouble();
        fare = (kelvin - 273.15) * (9 / 5) + 32;
        celsius = (kelvin + 273.15);
        System.out.println(kelvin + "°K = " + fare + "°F");
        System.out.println(kelvin + "°K = " + celsius + "°C");
    }
    
}
