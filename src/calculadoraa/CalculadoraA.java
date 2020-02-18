
package calculadoraa;

import java.util.Scanner;

//hola

public class CalculadoraA {

   public Scanner teclado;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int op,op2;
        
        codigo ob = new codigo();                       //Creacion del objeto
       
         
         do{
        
         System.out.println("------ CALCULADORA ------ \n" +
            "     \n"+
            "1. SUMA\n" +
            "2. RESTA\n" +
            "3. MULTIPLICACIÓN\n" +
            "4. DIVISIÓN\n" +
            "5. FUNCIONES TRIGONOMÉTRICAS\n" +
            "6. RAIZ ENÉSIMA\n" +
            "7. POTENCIA ENÉSIMA\n" +
            "8. IVA 19%\n"+
                 "     \n"+
            "9. SALIR\n");
         
         
             System.out.println("Ingrese la opcion");
         op= teclado.nextInt();

    switch(op)
    
    {
         case 1:
              
               ob.suma();
               break;
                
         case 2:
             
               ob.resta();
               break;
         
               
         case 3:
             
               ob.multiplicacion();
               break;
               
               
         case 4:
             
               ob.division();
               break;
               
               
               
         case 5:
             
             
             System.out.println("------ FUNCIONES TRIGONOMÉTRICAS ------ \n" +
            " "+
            "1. SENO\n" +
            "2. COSENO\n" +
            "3. TANGENTE\n");
             
              System.out.println("Ingrese la opcion");
         op2= teclado.nextInt();
             switch(op2)
             {
                 case 1:
                     
                      ob.seno();
                     break;
                     
                 case 2:
                     
                    ob.coseno();
                     break;
                     
                 case 3:
                     
                      ob.tangente();
                     break;
                     
                     
                  default:
 
                      System.out.println("la opcion no esta en el menu");
         
             }
               break;
               
               
        case 6:
                   
              ob.raiz();
              break;
        case 7:
            
              ob.potencia();
              break;
               
         case 8:
  
              ob.iva();
               break;
               
          case 9:
                    
                     System.exit(0);
             
               break;
          default:
                    
                  System.out.println("La Opcion No Esta En El Menu");
   
    }
    
       
    
    }while(op!=9);
            
    }
    }


