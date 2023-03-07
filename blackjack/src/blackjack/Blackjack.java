/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Blackjack {

    /**
     * @param args the command line arguments
     */
   static Game game = new Game ();
    public static void main(String[] args) {
        
        GUI gui = new GUI();
        game.deck();
        game.set();
        gui.runGUI( game.deck, game.player[0].getCard() , game.player[1].getCard(), game.player[2].getCard(), game.player[3].getCard() );
       playing ();
        // TODO code application logic here
    }
    
    
    
    
    public static void  adding ( ){
        int i;
        Card c = game[i];
        game.player[i]= new Player();
        
    }
     public static void playing (){
Scanner scanner = new Scanner (System.in);
  String choice = "  " ;
 boolean d_win = true;
 int high =0;
  choice = scanner.toString();
    for (int i =0; i < 4; i++)
    {
        if (choice == "Hit")
        {
            
            adding();
            
        }
        else if (choice == "Stand")
        {
            continue ;
        }
        else 
        {
            System.out.println("udefined");
            
        }
        if ( game.score[i]>game.player[3].score)
        {
        d_win= false;
        
        }
        else 
        {
            high = game.player[i].score;
            adding();
        }
        
                
    }
  

}
   
}
