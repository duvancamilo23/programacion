/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraconclases;
import java.util.Scanner;  
public class aritmetica {

public static double aritmeticas(){
    
  
    double result;
    Scanner reader = new Scanner(System.in); 
    String seguir;
       do{
    
        System.out.println("Estas en Aritmetica");
        System.out.println("Seleccione la opción que desea realizar");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion");
        System.out.println("4. division");
        int opcionAritmetica = reader.nextInt();
        System.out.println("Digita el primer número");
        float num1 = reader.nextFloat();
        System.out.println("Digita el segundo número");
        float num2 = reader.nextFloat();
        
        switch(opcionAritmetica){
            case 1:    result = num1 + num2;
               System.out.println("EL RESULTADO ES "+ result);
                break;
            case 2:    result = num1 - num2 ;
               System.out.println("EL RESULTADO ES "+ result);
                break;
            case 3:    result = num1 * num2;
               System.out.println("EL RESULTADO ES "+ result);
                break;
            case 4:   
                if (num2==0)  System.out.println("NO ES POSIBLE REALIZAR ESTA OPERACION "); 
                else       System.out.println("EL RESULTADO ES "+ (num1/num2));
                           
                break;
            default: System.out.println("Opción No valida");
                     break;
                     
     
    }
       
            System.out.println("Desea continuar Si/No");
            seguir = reader.next();
            seguir = seguir.toLowerCase();
            }while(seguir.equals("si"));
       
            return 0;
       
       
            }    
       
}



