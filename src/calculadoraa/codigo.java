/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadoraa;



import java.util.Scanner;



public class codigo {

    public codigo() {
    }
    
  
 
    public float num1;
    public float num2;
    public float res;
    
    public Scanner teclado;
    
    

    public void suma()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero 1");
        num1= teclado.nextFloat();

        System.out.println("Ingrese el numero 2");
        num2= teclado.nextFloat();

         res=num1+num2;
         System.out.println("El resultado de la suma de: "+num1+" + " + num2+" = "+res);
        
    }

    public void resta()
    {
         Scanner teclado = new Scanner(System.in);
         System.out.println("Ingrese el numero 1");
         num1= teclado.nextFloat();

         System.out.println("Ingrese el numero 2");
          num2= teclado.nextFloat();

         res=num1-num2;
         System.out.println("El resultado de la resta de: "+num1+" - " + num2+" = "+res);

    }

    public void multiplicacion()
    {
         Scanner teclado = new Scanner(System.in);
         System.out.println("Ingrese el numero 1");
         num1= teclado.nextFloat();

         System.out.println("Ingrese el numero 2");
         num2= teclado.nextFloat();

          res=num1*num2;
          System.out.println("El resultado de la multiplicación de: "+num1+" x " + num2+" = "+res);

    }

    public void division()
    {
         Scanner teclado = new Scanner(System.in);
         System.out.println("Ingrese el numero 1");
         num1= teclado.nextFloat();

         System.out.println("Ingrese el numero 2");
         num2= teclado.nextFloat();

             if(num2==0)
                {
                     System.out.println("ERROR, No es posible la división de: "+num1+"/"+num2);
                    
                }
             else
                {
                    res=num1/num2;
                    System.out.println("El resultado de la división de: "+num1+" / " + num2+" = "+res);
                }

    }

    public void seno()
    {
       Scanner teclado = new Scanner(System.in);
         System.out.println("Ingrese el numero a calcular");
         num1= teclado.nextFloat();

        res= (float) Math.sin(num1);
        System.out.println("El resultado del seno de: "+num1+" es: "+res);

    }

    public void coseno()
    {
        Scanner teclado = new Scanner(System.in);
         System.out.println("Ingrese el numero a calcular");
         num1= teclado.nextFloat();

        res= (float) Math.cos(num1);
        System.out.println("El resultado del coseno de: "+num1+" es: "+res);

    }

    public void tangente()
    {
        Scanner teclado = new Scanner(System.in);
         System.out.println("Ingrese el numero a calcular");
         num1= teclado.nextFloat();

        res= (float) Math.cos(num1);
        System.out.println("El resultado del tangente de: "+num1+" es: "+res);

    }

    public void raiz()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero n de la raiz");
         num1= teclado.nextFloat();

        System.out.println("Ingrese el numero de la base");
         num2= teclado.nextFloat();
         if(num2>=0)
         {
             
        float g;
        g=(1/num1);

        res= (float) Math.pow(num2, g);

        System.out.println("El resultado del valor de la raiz enésima es de: "+res);
         }
         
         else
         {
              System.out.println("ERROR, No es posible obtener la raiz enesima de: "+num2);
         }

    }

    public void potencia()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero n del exponente");
         num1= teclado.nextFloat();
         
        System.out.println("Ingrese el numero de la base");
        num2= teclado.nextFloat();

        res=1;
            for(int i=1;i<=num1;i++)
                {

                    res=res*num2;
                }

                System.out.println("El resultado del valor de la potencia enésima de: "+num2+"^"+num1+" es de: "+res);

    }

    public void iva()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero a calcular el IVA 19%");
         num1= teclado.nextFloat();

        res=((num1*19)/100);
        System.out.println(";El resultado de calcular el IVA de:"+num1+" es de: "+res);

    }
}
