
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Administrator
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Game {
  public  Player player [] =new Player [4];
  public  Card deck []= new Card [52];
  public int [] score = new int [4];
    int check =21;
    static int c =0;
    
    
       public void deck ()
       {
         
    
    for (int i = 0; i < 4; i++)
    { 
      for (int j = 0; j < 13; j++)
      {                                                  
    
          
       
      if (j >= 10)
      { 
          deck [c]= new Card (i , j ,10);
          
                  
      }   
       else { 
          deck[c]= new Card(i, j, j+1); 
          
        } 
            
           c++;   
            
      }      
    
    }
   
       }
       public Card   draw ( Card card)
       {
           Random rand = new Random ();
           
           for (int i = 0 ; i <52 ;i++)
           {
             
               
        deck (i , rand.nextInt(52)) ;

          player [i].card[player[i].card_num]= new card (deck[rand]);
           player [i].score+= deck[rand].getValue();
           
                              deck [i]= Null;
                              card = deck[i];
           }
           
          
           return card;
                   
           
       }
       public void set ()
       {
           Scanner input = new Scanner (System.in);
           for (int i =0 ; i <player.length ; i ++)
           {
              System.out.println(i);
              player[i]= new Player ();
              player[i].name= input.next();
               for (int j =0 ; j <2 ; j++)
               {
                   player [j] = new Player();
                   player [j].draw(deck);
                   
               }
                       
           }
           
       }
               
    
       
       
}
          
            
     


