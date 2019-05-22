


package blackjack;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import com.sun.accessibility.*;
//import com.sun.tools.javac.main.*;



public class Gamble {
	//JFrame blackjack;
//	JButton hit, hold, start, bet;
	
	//static JTextArea area;
	
	
	
	
    public static void main(String[] args) {
//        boolean check = true;
//        Random rand = new Random();
//        
//        Vector hand = new Vector();
//        Vector compHand = new Vector();
//        
//        compHand.add(Dealer());
//        compHand.add(Dealer());
//        
    	
    	
    	//This creates popout window
    	
            
            
            
   
    		
    	
    	
    			JFrame blackjack = new JFrame("Black Jack Game The Rich Way!");//window variable that holds jframe objects 
    	        blackjack.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of the window without keeping program running
    	        blackjack.setSize(800, 600);//width, height
    	        JPanel panel = new JPanel();
    	        blackjack.add(panel);
    			JButton button = new JButton("HIT!");
    			JButton button1 = new JButton("BET!");
    			JButton button2 = new JButton("Start Game!");
    			JButton button3 = new JButton("End Game!");
    			JButton button4 = new JButton("Hold!");
    			blackjack.add(button,BorderLayout.WEST);
    			blackjack.add(button1, BorderLayout.EAST);
    			blackjack.add(button2, BorderLayout.NORTH);
    			blackjack.add(button3, BorderLayout.SOUTH);
    			blackjack.add(button4, BorderLayout.CENTER);
    			blackjack.setVisible(true);
    			
    		
    	
    		  
    		
    	
            				
       
		
    

     
        
       
    	
       
	
        
       
		
       
		
	
	
		
	
        
       
     
        
       
        
//        System.out.println("Computer's Hand" + compHand);
//        System.out.println("Computer totals is: " + add(compHand));
//        
//        int secret = rand.nextInt(2);
//        System.out.println(secret);
//        System.out.println("What you see: " + compHand.get(secret));
//        
//        hand.add(Dealer());
//        hand.add(Dealer());
//        
//        System.out.println("Our Hand" + hand);
//        System.out.println("Your total is: " + add(hand));
//        
//        System.out.println("Type 1 to deal");
//        System.out.println("Type 2 to Hold");
//        
//        Scanner input = new Scanner(System.in);
//        int userInput = input.nextInt();
//        
//        
//        do {
//            hand.add(Dealer());
//            
//            System.out.println("Our Hand" + hand);
//            System.out.println("Your total is " + add(hand));
//            if(add(hand) > 21) {
//                //System.out.println("You lose");
//                check = false;
//                break;
//            }
//            userInput = input.nextInt();
//        } while(userInput == 1);
//       
//            
//        //System.out.println("Your Done");
//    
//    
//    if(add(compHand) < add(hand) && check == true) {
//        System.out.println("Winner winner chicken Dinner!");
//        
//    } else {
//        System.out.println("You lost");
//    }
//    
//    
//    
//    
//    }
//    

//    
//    
//    private static void getCompCard() {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//
//	public static int add(Vector hand) {
//        int sum = 0;
//        for(int i = 0; i < hand.size(); i++ ) {
//        sum = sum + (int) hand.get(i);
//        }
//        return sum;
//    }
//    
//    public static int Dealer() {
//        Random rand = new Random();
//        int card = rand.nextInt(10)+1;
//        return card;
//    }
//    
//




   	
}}
 

		
    




			

			
	