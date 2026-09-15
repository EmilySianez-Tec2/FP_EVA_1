/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_vehiculo;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA1_6_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String marca;
        String modelo;
        int year;
        String color;
        int kilometraje;
        double precio;
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura la marca de tu vehiculo");
        marca = captu.nextLine();
        System.out.println("Captura el modelo de tu vehiculo");
        modelo = captu.nextLine();
        System.out.println("Captura el año");
        year = captu.nextInt();
        captu.nextLine();
        System.out.println("Captura el color de tu vehiculo");
        color = captu.nextLine();
        System.out.println("Captura el kilometraje de tu vehiculo");
        kilometraje = captu.nextInt();
        captu.nextLine();
        System.out.println("Captura el precio de tu vehiculo");
        precio = captu.nextInt();
        captu.nextLine();
        System.out.println("Datos capturados");
        System.out.print("Marca");
        System.out.println(marca);  
        System.out.print("Modelo");
        System.out.println(modelo);
        System.out.print("Year");
        System.out.println(year);
        System.out.print("color");
        System.out.println(color);
        System.out.print("Kilometraje");
        System.out.println(kilometraje);
        System.out.print("Precio");
        System.out.println(precio);
    
        
    }
    
}
    