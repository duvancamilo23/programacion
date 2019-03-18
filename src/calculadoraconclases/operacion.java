/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraconclases;

public class operacion {
     private static Object op;
     private static Object opr;
     
    public static void main(String[] args) {
        
      op = new aritmetica();
   aritmetica.aritmeticas();
           
        opr = new trigonometrica();
    trigonometrica.trigonometricas();
    
        double result;
        int num1 = 0;
        int num2 = 0;
        
        result=num1+num2;
   imprimir imp=new imprimir();
   imp.mostrar(result);
        
  
    }
                    
}
