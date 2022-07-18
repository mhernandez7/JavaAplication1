
package javaapplication1ob;

import java.util.Scanner;
/**
 *
 * @author Miguel
 */
public class JavaApplication1Ob {

  
    public static void main(String[] args) {
        
        Scanner palabra = new Scanner(System.in);
        Number n1 = new Number();
        Number n2 = new Number();
        Number n3 = new Number();
        Number n4 = new Number();
        Number n5 = new Number();
        Number n6 = new Number();
        
        float number1 = 0, number2 = 0, number3 = 0;
        
        n1.setNumber(4);
       System.out.println(n1.getNumber());
        n1.textNumber();
        
        n2.setNumber(-727);
        System.out.println("el "+n2.getNumber()+" es: "+n2.textNumberReturn());
        
        System.out.println("el numero "+n3.getNumber()+" "+n3.textNumberReturn(0));
       
        System.out.println("ahora con el metodo Scanner: ");
        System.out.println("--------------------------------");
        
        System.out.println("ingrese un numero: ");
        number1 = palabra.nextFloat();
        
        System.out.println("ingrese el segundo numero: ");
        number2 = palabra.nextFloat();
        
        System.out.println("ingrese el tercer numero: ");
        number3 = palabra.nextFloat();
        
        n4.setNumber(number1);
        n5.setNumber(number2);
       
        System.out.println("el numero "+n4.getNumber()+" ");
        n4.textNumber();
        
        System.out.println("el numero "+n5.getNumber()+" "+n5.textNumberReturn());
        
        System.out.println("el numero "+n6.getNumber()+" "+n6.textNumberReturn(number3));
        

        
    }
    
}
