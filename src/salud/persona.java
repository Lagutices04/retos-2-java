package salud;

import java.util.Scanner;

public class persona {
    //atributos
    public String nombre;
    public String  apellido;
    public String edad;
    public String tipodoc;
    public String  documento;
    public double peso;
    public double altura;
 

    public void registrarpersona(){
        
        
        Scanner leer=new Scanner (System.in);
        System.out.println("ingrese su nombre");
        nombre=leer.nextLine();
        System.out.println("ingrese su apellido");
        apellido=leer.nextLine();
        System.out.println("ingrese su edad");
        edad=leer.nextLine();
        System.out.println("ingrese su tipo de documento");
        tipodoc=leer.nextLine();
        System.out.println("ingrese su documento");
        documento=leer.nextLine();
        System.out.println("ingrese su peso");
        peso=leer.nextDouble();
        System.out.println("ingrese su altura");
        altura=leer.nextDouble();
            
        leer.close();
        
    }

    public persona(){

    }
    public persona(String nombre,String apellido,String edad,String tipodoc,String documento,double peso,double altura){
        this.altura=altura;
        this.apellido=apellido;
        this.documento=documento;
        this.edad=edad;
        this.nombre=nombre;
        this.peso=peso;
        this.tipodoc=tipodoc;

    }

    public void  calcularmc(double pesoactual){
        pesoactual=peso/altura;

        if(pesoactual<=20){
            System.out.println("si su peso esta "+pesoactual+"es 20 kilos esta muy delagado ");
        }
         else if(pesoactual>=20 && pesoactual>=25){
            System.out.println("si su peso esta"+pesoactual+"tiene un peso ideal");
        }
       else  if(pesoactual>25){
        System.out.println("si su peso esta"+pesoactual+"tiene sobrepeso");
       }
       else;        

    }








}
