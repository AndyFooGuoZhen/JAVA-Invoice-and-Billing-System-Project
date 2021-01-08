import javax.swing.JOptionPane;

public class Digital_Movies extends Items
{
	String movieName[]= {"Bladerunner", "Avengers", "Westworld", "Spiderman","Avatar","Deadpool","Star Wars",
					     "Thor", "Transformers", "Star Trek", "Terminator","Up","Rocky","Interstellar","Inception",
					     "Ghostbusters","Gladiator","Batman","Titanic","Battleship","Toy Story","Alien","JAWS",
					     "Forrest Gump", "Indiana Jones", "Joker","1917","Tenet","Iron Man","2012"};
	
	double movieRentPrice[]= {15.00,16.00,13.00,14.50,24.00,17.00,11.00,18.50,14.45,16.35,17.50,10.00,9.00,
							  23.00,18.00,11.00,12.00,16.65,11.45,14.35,15.00,17.80,12.50,15.45,11.20,18.00,
							  16.75,26.00,16.78,13.00};
	
	double moviePurchasePrice[]= {45.00,50.00,23.00,27.00,67.20,24.00,22.20,43.00,19.00,23.40,27.00,15.00,13.50,
							      67.00,56.40,18.00,21.00,26.00,16.73,19.00,22.80,34.00,17.30,23.90,15.30,25.00,
							      32.00,71.43,24.00,19.00};
	
	String movieList[]=new String[movieName.length];
	
	public Digital_Movies ()
	{
		String renORbuy[]= {"Rent","Purchase"};
		int renbuymethod=JOptionPane.showOptionDialog(null, "Would you like to Rent ot Purchase Digital Movies?", "Shop Method",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, renORbuy, renORbuy[1]);
		rentChoice(renbuymethod);
		String n=(String)JOptionPane.showInputDialog(null,"PLease select one movie from list","Movie selection",JOptionPane.QUESTION_MESSAGE,null,movieList,movieList[movieList.length-1]);
		
		if(n!=null)
		{
			recordCart(setMovieIndex(n),renbuymethod);
		}
	}
	
	public void rentChoice(int select)
	{
		if(select==0)
		{
			for(int i=0;i<movieName.length;i++)
			{
				movieList[i]=String.format("%s     RM %.2f", movieName[i],movieRentPrice[i]);
			}
		}
		
		else
		{
			for(int i=0;i<movieName.length;i++)
			{
				movieList[i]=String.format("%s     RM %.2f", movieName[i],moviePurchasePrice[i]);
			}
		}
	}
	
	public int setMovieIndex(String output)
	{
		int index=0;
		
		for(int i=0;i<movieName.length;i++)
		{
			if(movieList[i].equals(output)) 
			{
				index=i;
			}
		}
		
		return index;
		
	}
	
	public void recordCart(int indexNumber, int rentbuyOption)
	{
		if(rentbuyOption==0)
		{
			addItemNameAndPrice(movieName[indexNumber],movieRentPrice[indexNumber],"Rent");
		}
		
		else
		{
			addItemNameAndPrice(movieName[indexNumber],moviePurchasePrice[indexNumber],"Purchase");
		}
	}
	
}


