package Principal;

import java.util.Scanner;

public class inicio {
    public double pesor(Double peso, double altura){
        Double medicion=peso/altura;
        return medicion;

   
    
}
public static void main(String[] args) {
    Scanner leer=new Scanner (System.in);
    Double peso;
    Double altura;
    System.out.println("ingrese  su peso");
    peso=leer.nextDouble();
    System.out.println("ingrese su altura");
    altura=leer.nextDouble();

  
}
}
