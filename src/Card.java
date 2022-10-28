
public class Card {

	    int value;
	    String name;
	    public Card(int value, String name)
	    {
	        this.value = value;
	        this.name = name;
	    }
	   
	    public String getname()
	    {
	        return this.name;
	    }
	   
	    public int getvalue()
	    {
	        return this.value;
	    }
	   
	    public void describe()
	    {
	       System.out.println("name: " + getname() + " value:" + getvalue());
	    }
	
}
