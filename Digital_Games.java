import javax.swing.JOptionPane;

public class Digital_Games extends Items
{
	String gameName[]= {"Assasin's Creed Rogue","Assasin's Creed Unity", "Battlefield 1", "Call of Duty","Dark Souls",
				        "Deus Ex","Dishonored","Dishonored 2","Fallout 4","Gta 5","Gta 4", "Gta 3","Gta 2", 
				        "Gta Vice City","Pes 2020", "FIFA 19", "NBA2K19", "Overwatch", "Minecraft", "Titanfall", 
				        "Rainbow's Siege", "Tekken 7","Burnout Revenge","Star Wars", "Rocket League", "Destiny 2", 
				        "Animal Crossing", "Cyberpunk2077", "Horizon Zero Dawn", "Ghost Recon"};
	
	double gamePrice[]= {67.00,120.45,45.40,50.23,33.00,86.47,29.30,53.55,37.20,79.10,65.20,43.15,20.00,
						 5.00,60.70,40.35,41.30,33.80,85.30,25.90,32.45,23.40,15.70,89.20,20.90,16.70,
						 80.67,140.50,79.00,69.55};
	
	String gameList[]=new String[gameName.length];
	
	public Digital_Games()
	{
		choiceList();
		String n=(String)JOptionPane.showInputDialog(null,"PLease select one game","Digital games selection",JOptionPane.QUESTION_MESSAGE,null,gameList,gameList[gameList.length-1]);
		
		if(n!=null)
		{
			recordCart(setGameIndex(n));
		}
	}

	public void choiceList()
	{
		for(int i=0;i<gameName.length;i++)
		{
			gameList[i]=String.format("%s     RM %.2f", gameName[i],gamePrice[i]);
		}
	}
	
	public int setGameIndex(String output)
	{
		int index=0;
		
		for(int i=0;i<gameName.length;i++)
		{
			if(gameList[i].equals(output)) 
			{
				index=i;
			}
		}
		
		return index;
	}
	
	public void recordCart(int indexNumber)
	{
		addItemNameAndPrice(gameName[indexNumber],gamePrice[indexNumber],"Purchase");
	}
}	
			
			
	


