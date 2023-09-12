/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_entradas_salidas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_6_ENTRADAS_SALIDAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    String marca;
    String modelo;
    int anio;
    Scanner ola = new Scanner(System.in);
    //Hay un paquete System, dentro un paquete out, y dentro
    //de out, la instrucción println
    System.out.println("Introduce la marca del auto");
    marca = ola.nextLine();
    System.out.println("Introduce el modelo del auto");
    modelo = ola.nextLine();
    System.out.println("Introduce el anio del auto");
    anio = ola.nextInt();
    System.out.println(marca);
    System.out.println(modelo);
    System.out.println(anio);
    }
    
}
