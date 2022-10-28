
public class App {

	 public static void main(String[] args) {
         
	        int num1 = 0;
	        int num2 = 0;
	        
	        Deck mydeck = new Deck();
	        Player player_1 = new Player("player 1");
	        Player player_2 = new Player("player 2");
	        mydeck.shuffle();
	        for(int i = 1; i <= 52; i++)
	        {
	            if(i %2 == 1)
	            {
	                player_1.draw(mydeck);
	            }
	            
	            else
	            {
	                player_2.draw(mydeck);
	            }
	        }
	        
	        for(int i = 0; i < 26; i++)
	        {
	            num1 = player_1.flip().getvalue();
	            num2 = player_2.flip().getvalue();
	           
	            
	            if(num1 > num2)
	            {
	                player_1.incrementScore();
	            }
	            else if(num2 > num1)
	            {
	                player_2.incrementScore();
	            }
	            else
	            {
	                continue;
	            }
	        }
	        
	        System.out.println("final score of player 1 is: " + player_1.getscore());
	        System.out.println("final score of player 2 is: " + player_2.getscore());
	        
	        if(player_1.getscore() > player_2.getscore())
	        {
	            System.out.println("This years winner is: " +  player_1.getname());
	        }
	        
	        else if(player_2.getscore() > player_1.getscore())
	        {
	            System.out.println("This years winner is: " +  player_2.getname());
	        }
	        
	        else
	        {
	            System.out.println("This year ended in a draw");
	        }
	        
	 }
}
