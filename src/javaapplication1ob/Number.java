
package javaapplication1ob;

/**
 *
 * @author Miguel
 */
public class Number {
    
    private float number1;
    
    public Number(float number1){
    this.number1 = number1;
    }

    public Number() {
        this.number1 = 0;
    }

    public float getNumber() {
        return number1;
    }

    public void setNumber(float number1) {
        this.number1 = number1;
    }
    
    public void textNumber(){
    
         if (this.number1 > 0)
        {
            System.out.println("el numero es positivo");
        }else{
            if(this.number1<0){
                System.out.print("el numero es negativo");
            }
            else{
                System.out.print("Es neutro");
            }
        }
        
    }
    public String textNumberReturn(){
        String msn ="";
       
        
         if (this.number1 > 0)
        {
            msn ="el numero es positivo";
        }else{
            if(this.number1<0){
               msn = "el numero es negativo";
            }
            else{
                msn = "Es neutro";
            }
        }
          return msn;
    }
    public String textNumberReturn(float n1){
        String msn ="";
       
        
         if (n1 > 0)
        {
            msn ="el numero es positivo";
        }else{
            if(n1 <0){
               msn = "el numero es negativo";
            }
            else{
                msn = "Es neutro";
            }
        }
          return msn;
    }
    
}
