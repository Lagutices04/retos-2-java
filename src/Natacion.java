import java.util.Scanner;

 

public class Natacion {
    public static void main(String[] args) throws Exception{

        Scanner leer=new Scanner (System.in);
        String player1;
        String player2;
        String player3;
        float time1;
        float time2;
        float time3;


      
        

        System.out.println("dame el nombre del primer jugador");
        player1=leer.nextLine();
        System.out.println("dame el nombre del segundo jugador");
        player2=leer.nextLine();
        System.out.println("dame el nombre del tercer jugador");
        player3=leer.nextLine();

        System.out.println("dame el tiempo del primer jugador");
        time1=leer.nextFloat();
        System.out.println("dame el tiempo del segundo jugador");
        time2=leer.nextFloat();
        System.out.println("dame el tiempo del tercer jugador");
        time3=leer.nextFloat();

        if (time1>60.0) {
            System.out.println("el"+player1+"obtuvo un tiempo de"+time1+"por lo tanto perdio");
            
        }else if(time1<60.0){
            System.out.println("el"+player1+"obtuvo un tiempo de"+time1+"por lo tanto gano");
        }else



        if (time2>60.0){
            System.out.println("el"+player2+"obtuvo un tiempo de"+time2+"por lo tanto perdio");
        }else if(time2<60.0){
            System.out.println("el"+player2+"obtuvo un tiempo de"+time2+"por lo tanto gano");
        }else


        if (time3>60.0){
            System.out.println("el"+player3+"obtuvo un tiempo de"+time3+"por lo tanto perdio");
        }else if(time3<60.0){
            System.out.println("el"+player3+"obtuvo un tiempo de"+time3+"por lo tanto perdio");
        }

    








        
    

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        leer.close();


    }
    
    
}
