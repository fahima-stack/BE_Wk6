import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	 List<Card> cards = new ArrayList<Card>();
     String[] names = {"clubs", "diamonds", "hearts", "spades"};
   
    public Deck()
    {
        makedeck();
    }
   
    public void makedeck()
    {
        for(int i = 0; i < names.length; i++)
            for(int j = 2; j <= 14; j++)
            {
                this.cards.add(new Card(j, names[i]));
            }
    }
   
    public void shuffle()
    {
        Collections.shuffle(cards);
    }
   
   public Card draw()
   {
       return this.cards.remove(0);
   }
}
