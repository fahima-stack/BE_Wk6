import java.util.ArrayList;
import java.util.List;

public class Player {
	
	    int score;
	    String name;
	    List<Card> hand = new ArrayList<Card>();
	    
	    public Player(String name)
	    {
	        this.score = 0;
	        this.name = name;
	    }
	    
	    public int getscore()
	    {
	        return this.score;
	    }
	    
	     public String getname()
	    {
	        return this.name;
	    }
	    
	    public void describe()
	   {
	       System.out.println("players name: " + this.name);
	       System.out.println("players score: " + this.score);
	       for(int i = 0; i < hand.size(); i++)
	       {
	           this.hand.get(i).describe();
	       }
	   }
	   
	   public Card flip()
	   {
	       return this.hand.remove(0);
	   }
	   
	   public void draw(Deck deck)
	   {
	        this.hand.add(deck.draw());
	   }
	   
	   public void incrementScore()
	   {
	       this.score ++;
	   }
}
