/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_temperatura;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA_1_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double temp, far, kelvin;
        Scanner captu = new Scanner (System.in);
        //SOLICITAR LOS DATOS AL USUARIOS 
        //HACER EL CALCULO
        // MOSTRAR RESULTADOS AL USUARIO
        System.out.println("Introduce la temperatura en Centigrados");
        temp = captu.nextDouble();
        System.out.println("");
        //HACER EL CALCULO
        far = (temp * 1.8) + 32; //GRADOS FAHRENHEIT
        kelvin = temp + 273.15; //KELVIN
        //MOSTRAR RESULTADOS
        System.out.println(temp + "°C = " + far + "°F");
        System.out.println(temp + "°C = " + kelvin + "°K");
        
        
    }
    
}
