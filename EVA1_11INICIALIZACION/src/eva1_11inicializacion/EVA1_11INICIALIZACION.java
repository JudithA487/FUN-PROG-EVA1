/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11inicializacion;

/**
 *
 * @author invitado
 */
public class EVA1_11INICIALIZACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //los paréntesis denotan una función:
        //println ()<<--- funcion
        //main()<<--- funcion
        System.out.println("Hola mundo");
        int valor = 0; //inicializar la variable para usarla
        System.out.println(valor);
        
        //declaramos e inicializamos 3 variables del tipo double
        double salario = 0, iva = 0.16, subtotal = 10000;
        
        final int CALIFA_PASAR = 70;
        final String ESCUELA  = "Instituto Tecnológico de Chihuahua 2";
        
        System.out.println(ESCUELA);
        System.out.println("La califa minima para pasar es:");
        System.out.println(CALIFA_PASAR);
        
        //error: solo se puede asignar una sola vez
        //califa_pasar = 100;
        //califa_pasar = 20;
        
        byte valores = 120;
        //valores = 128;
        int miValor = Integer.MAX_VALUE;
        System.out.println(miValor + 1);
        
        
    }
    
}
