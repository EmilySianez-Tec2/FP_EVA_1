/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_captura;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA1_4_Captura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //SI VAMOS USAR VARIABLE, SE TIENE QUE DECLARAR ANTES DE USAR 
       //declarar-->crear la varibale para su uso en el programa 
       //TIPO_DATO_NOMBRE_IDENTIFICADOR 
       //USAR NOMBRE SIGNIFICATIVOS -->DEBE DECIR PARA QUE SE USA 
       String nombre; // declaracion de la variable 
       System.out.println("Captura el nombre");
       //ENTRADA DE DATOS DEL TECLADO (JAVA)
       Scanner captu = new Scanner(System.in); //otra variable --> captu de tipo scanner
       
       System.out.println("Captura el nombre");
       
       //VARIABLES CREARLAS--> DECLARAR LA VARIABLE, ASIGNAR UN TIPO DE DATO 
       //PONERLE NOMBRE A LA VARIABLE 
       //CAPTURAR DEL TECLADO PONERLE EN LA VARIABLE NOMBRE
       //ESCRIBIT EN LA VARIABLE (PONER UN VALOR) ASIGNACION
       nombre = captu.nextLine();
       System.out.println("El valor capturado es");
        System.out.println(nombre);
    }
    
}
