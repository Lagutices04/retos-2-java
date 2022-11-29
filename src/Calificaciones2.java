import java.util.Scanner;

public class Calificaciones2 {


    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        
        int sumacalificaciones=0;

        int [] calificaciones = new int [5];
        for(int i=0; i<calificaciones.length; i++){
            System.out.println("dame tus notas");
            calificaciones[i]=leer.nextInt();
        }
        for(int i=0; i<calificaciones.length; i++){
            System.out.println(calificaciones[i]);
        }
        for(int i=0; i<calificaciones.length; i++){
            sumacalificaciones = sumacalificaciones + calificaciones[i];

        }
        System.out.println("la suma de tus notas es"+sumacalificaciones);
        double promedio = sumacalificaciones/calificaciones.length;
        System.out.println("el promedio fue de"+promedio);

     

        if (promedio>=5){
            System.out.println("el alumno aprobo con superior la materia");
           
             System.out.println("el promedio fue de"+promedio);
        }else

        if (promedio>=3){
            System.out.println("el alumno paso raspando la materia");
           
            System.out.println("el promedio fue de"+promedio);

        }else

        if (promedio<=3){
            System.out.println("el alumno reprobo la materia");
           
            System.out.println("el promedio fue de"+promedio);   
        }else

      



          




















        leer.close();



}
}

