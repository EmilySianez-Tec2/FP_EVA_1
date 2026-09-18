/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_13_circulo;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA_1_13_CIRCULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radio, perimetro, area, volumen;
        Scanner captu = new Scanner (System.in);
        System.out.println(" Introduce el radio del circulo");
        radio = captu.nextDouble();
        perimetro = 2 * 3.1416 * radio;
        area = 3.1416 * (radio * radio);
        volumen = (4/3.0) * 3.1416 * (radio * radio * radio);
        System.out.println(radio + ("r = ") + perimetro + ("p"));
        System.out.println(radio + ("r = ") + area + ("a"));
        System.out.println(radio + ("r = ") + volumen + ("v"));
        
        
    }
    
}
