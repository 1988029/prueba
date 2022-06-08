
package com.mycompany.mavenproject1;


import static java.lang.Math.cbrt;
public class NewMain {

    
    
    public static void main(String[] args) {
     float sol;
     float soltemp;
     
     
     
        for (double i = 1; i < Double.MAX_VALUE; i++) {
            
            for (double j = 2; j < i; j++) {
                
                sol = (float) cbrt((i*i*i) + (j*j*j));
                soltemp = sol;
                
                while(soltemp>1){
                soltemp = soltemp-1;                
                }
                
                if (soltemp == 1) {                
                    System.out.println(i+"  "+ j+"  " + sol);                    
                    System.out.println(sol+" es un número sin decimales");
                }
            }
        }
        
        
        
        
    }
    
}
