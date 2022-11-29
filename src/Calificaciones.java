import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner (System.in);
        int calif1;
        int calif2;
        int calif3;
        int calif4;
        int calif5;
        int promedio;

        System.out.println("dame tu primera calificacion");
        calif1=leer.nextInt();
        System.out.println("dame tu segunda calificacion");
        calif2=leer.nextInt();
        System.out.println("dame tu tercera calificacion");
        calif3=leer.nextInt();
        System.out.println("dame tu cuarta calificacion");
        calif4=leer.nextInt();
        System.out.println("dame tu quinta calificacion");
        calif5=leer.nextInt();
       promedio=(calif1 + calif2 + calif3 + calif4 + calif5)/5;
       System.out.println("el promedio del alumno es"+promedio);

       

      
       if (promedio>=5){
       System.out.println("el alumno aprobo con superior la materia");
       promedio=(calif1 + calif2 + calif3 + calif4 + calif5)/5;
       System.out.println("el promedio del alumno es"+promedio);
       }else
       if (promedio<
       3){
        System.out.println("el alumno reprobo");
        promedio=(calif1 + calif2 + calif3 + calif4 + calif5)/5;
        System.out.println("el promedio del alumno es"+promedio);
       }else
       if (promedio>=3){
        System.out.println("el alumno paso raspando  la materia");
        promedio=(calif1 + calif2 + calif3 + calif4 + calif5)/5;
        System.out.println("el promedio del alumno es"+promedio);
       
       }else

        
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        leer.close();


    
}
}
