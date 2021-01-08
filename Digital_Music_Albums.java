import javax.swing.JOptionPane;

public class Digital_Music_Albums extends Items
{
	String musicName[]= {"Justin Bieber","Michael Jackson","Ariana Grande","Taylor Swift","Billie Eilish",
			             "Beyonce","ACDC","Katty Perry","Eminem","Lady Gaga","Queen","Bon Jovi","Journey",
			             "Weeknd","One Direction","Rihanna","Adele","Pitbull","Selena Gomez","Alan Walker",
			             "Avril Lavigne","Shakira","Snoopdogg", "Shawn Mendes","Camila Cabello","Dua Lipa",
			             "Blackpink","IU","Khalid","Bebe Rexha"};
	
	double musicRentPrice[]= {16.00,15.00,18.00,18.50,14.45,9.00,12.50,14.50,24.00,16.65,26.00,10.00,17.00,
			                  23.00,13.00,11.20,18.00,16.35,15.00,15.45,11.45,13.00,11.00,14.35,11.00,12.00,
			                  16.75,17.50,16.78,17.80};
	
	
	double musicPurchasePrice[]= {50.00,45.00,56.40,43.00,19.00,13.50,17.30,27.00,67.20,26.00,71.43,15.00,24.00,
								  67.00,23.00,15.30,25.00,23.40,22.80,23.90,16.73,19.00,22.20,19.00,18.00,21.00,
		                          32.00,27.00,24.00,34.00};
	
	String musicList[]=new String[musicName.length];
	
	public Digital_Music_Albums ()
	{
		String renORbuy[]= {"Rent","Purchase"};
		int renbuymethod=JOptionPane.showOptionDialog(null, "Would you like to Rent ot Purchase Digital Music albums?", "Shop Method",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, renORbuy, renORbuy[1]);
		rentChoice(renbuymethod);
		String n=(String)JOptionPane.showInputDialog(null,"PLease select one music album from list","Music albums selection",JOptionPane.QUESTION_MESSAGE,null,musicList,musicList[musicList.length-1]);
		
		if(n!=null)
		{
			recordCart(setMusicIndex(n),renbuymethod);
		}
		
	}
	
	
	public void rentChoice(int select)

	{
		if(select==0)
		{
			for(int i=0;i<musicName.length;i++)
			{
				musicList[i]=String.format("%s     RM %.2f", musicName[i],musicRentPrice[i]);
			}
		}
		
		else
		{
			for(int i=0;i<musicName.length;i++)
			{
				musicList[i]=String.format("%s     RM %.2f", musicName[i],musicPurchasePrice[i]);
			}
		}
	}
	
	public int setMusicIndex(String output)
	{
		int index=0;
		
		for(int i=0;i<musicName.length;i++)
		{
			if(musicList[i].equals(output)) 
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
			addItemNameAndPrice(musicName[indexNumber],musicRentPrice[indexNumber],"Rent");
		}
		
		else
		{
			addItemNameAndPrice(musicName[indexNumber],musicPurchasePrice[indexNumber],"Purchase");
		}
	}
	
	
}

