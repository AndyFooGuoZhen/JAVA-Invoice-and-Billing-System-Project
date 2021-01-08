import javax.swing.JOptionPane;

public class Digital_News extends Items
{
	String newsName[]= {"The Edge","The Star","Utusan Malaysia","China Press","Sin Chew Daily","Berita Harian",
			            "New Straits Times","Malaysia Kini","Forbes","VOGUE", "TIME","Motor Trader",
			            "Men's Health","WIRED","NATIONAL GEOGRAPHIC","Reader's digest","Entrepreneur",
			            "PCGAMER","BYTE","ELLE","Top10","Topgear","T3", "CHIP","Hypertune","POPCLUB",
			            "THE WALL STREET JOURNAL","Bloomberg Businessweek","Women's Health","TED"};
	
	double newsPrice[]= {120.00,50.80,28.60,23.34,30.50,25.65,80.00,22.40,83.20,75.30,65.50,28.20,32.30,58.00,
			             130.00,45.40,28.30,21.30,48.70,66.90,34.55,56.00,47.70,33.20,28.50,22.50,87.40,
			             79.70,32.30,46.50};
	
	String newsList[]=new String[newsName.length];
	
	public Digital_News()
	{
		choiceList();
		String n=(String)JOptionPane.showInputDialog(null,"PLease select one form of news media from list","News subscription selection",JOptionPane.QUESTION_MESSAGE,null,newsList,newsList[newsList.length-1]);
		
		if(n!=null)
		{
			recordCart(setNewsIndex(n));
		}
		 
	}
	
	public void choiceList()
	{
		for(int i=0;i<newsName.length;i++)
		{
			newsList[i]=String.format("%s    RM %.2f", newsName[i],newsPrice[i]);		
		}
	}
	
	public int setNewsIndex(String output)
	{
		int index=0;
		
		for(int i=0;i<newsName.length;i++)
		{
			if(newsList[i].equals(output)) 
			{
				index=i;
			}
		}
		
		return index;
		
	}

	public void recordCart(int indexNumber)
	{
		addItemNameAndPrice(newsName[indexNumber],newsPrice[indexNumber],"Subscription");
	}
	
}	


