import java.util.Scanner;


public class Natacion2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        String [] player1 = new String [1];
        for(int i=0; i<player1.length; i++){
            System.out.println("dame el nombre del primer jugador");
            player1[i]=leer.nextLine();
        }
        for(int i=0; i<player1.length; i++){
            System.out.println(player1[i]);
        }


        String [] player2 = new String [1];
        for(int i=0; i<player2.length; i++){
            System.out.println("dame el nombre del segundo jugador");
            player2[i]=leer.nextLine();
        }
        for(int i=0; i<player2.length; i++){
            System.out.println(player2[i]);
        }

        String [] player3 = new String [1];
        for(int i=0; i<player3.length; i++){
            System.out.println("dame el nombre del tercer jugador");
            player3[i]=leer.nextLine();
        }
        for(int i=0; i<player3.length; i++){
            System.out.println(player3[i]);
        }

        int [] time1 = new int [1];
        for(int i=0; i<time1.length; i++){
            System.out.println("dame el primer tiempo del primer jugador");
            time1[i]=leer.nextInt();

        }
        for(int i=0; i<time1.length; i++){
            System.out.println(time1[i]);
        }


        int [] time2 = new int [1];
        for(int i=0; i<time2.length; i++){
            System.out.println("dame el segundo tiempo del segundo jugador");
            time2[i]=leer.nextInt();

        }
        for(int i=0; i<time2.length; i++){
            System.out.println(time2[i]);
        }

        int [] time3 = new int [1];
        for(int i=0; i<time3.length; i++){
            System.out.println("dame el tercer tiempo del tercer jugador");
            time3[i]=leer.nextInt();

        }
        for(int i=0; i<time3.length; i++){
            System.out.println(time3[i]);
        }

        double tiempofinal1=time1.length;
        double tiempofinal2=time2.length;
        double tiempofinal3=time3.length;

        int winner1=player1.length;
        int winner2=player2.length;
        int winner3=player3.length;


        if(winner1>=60 && tiempofinal1>60) {
            System.out.println("el jugador perdio por demorarse  tanto"+player1);
        }else if(winner1<60 && tiempofinal1<60){
            System.out.println("el jugador gano por no demorarse"+player1);
        }else



        if(winner2>=60 && tiempofinal2<60){
            System.out.println("el jugador perdio por demorarse  tanto"+player2);
        }else if(winner2<=60 && tiempofinal2<60){
            System.out.println("el jugador gano por  no demorarse  "+player2);
        }else


        
        if(winner3>=60 && tiempofinal3<60){
            System.out.println("el jugador perdio por demorarse  tanto"+player3);
        }else if(winner3<=60 && tiempofinal3<60){
            System.out.println("el jugador gano por  no demorarse  "+player3);
        }else





     

        

        



        
        
        
        
        
        
        
        leer.close();

}
}
