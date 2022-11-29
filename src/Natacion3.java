import java.util.Scanner;

public class Natacion3 {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        String [] nombre = new String [3];
        for(int i=0; i<nombre.length; i++){
            System.out.println("dame el nombre de los jugadores");
            nombre[i]=leer.nextLine();
        }
        for(int i=0; i<nombre.length; i++){
            System.out.println(nombre[i]);
            
        }
        int [] tiempo = new int [3];
     
        for(int i=0; i<tiempo.length; i++){
            System.out.println("dame el tiempo de los jugadores");
            tiempo[i]=leer.nextInt();

        }
        for(int i=0; i<tiempo.length; i++){
            System.out.println(tiempo[i]);
        }
        double tiempofinal=tiempo.length;

        if(tiempofinal>=60){
         
            System.out.println("el jugador perdio la partida "+nombre);

        }else

        if(tiempofinal<=60){
            System.out.println("el jugador gano la partida "+nombre);
        }else

        
        
        
        
        
        
        
        
        
        
        leer.close();

}
}