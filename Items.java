
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Items
{	
	private List<String> listName = new ArrayList<String>();
	private List<Double> listPrice = new ArrayList<Double>();
	private List<String> listTransactionMode = new ArrayList<String>();
	private String itemName;
	private double itemPrice;
	private String itemTransaction;
	int shopFlag=0;
	 
	
	public void addItemNameAndPrice(String inheritedClassItemName, double inheritedClassItemPrice, String itemTransMode) 
	{
		 itemName=inheritedClassItemName;
		 itemPrice=inheritedClassItemPrice;
		 itemTransaction=itemTransMode;
	}
	
	public String returnItemName()
	{
		return itemName;
	}
	
	public Double returnItemPrice()
	{
		return itemPrice;
	}
	
	public String returnItemTransaction()
	{
		return itemTransaction;
	}
	
	public void listItemNamesAndPrice(String itemName,double itemPrice, String itemTransMode) 
	 {
		if(itemName!=null)
		{
			listName.add(itemName);
			listPrice.add(itemPrice);
			listTransactionMode.add(itemTransMode);
		}
	 }
	
	public List<String> getItemNames() 
	{
		 return listName;
	}
	
	public List<Double> getItemPrice() 
	{
		 return listPrice;
	}
	
	public List<String> getItemTranaction() 
	{
		 return listTransactionMode;
	}
	
	
	public void shopType()
	{
		String[] options = { "Digital Movies", "Digital Music Albums", "E-Books","Digital Games","Digital News"};
		int selected=JOptionPane.showOptionDialog(null, "Choose type of items to shop", "Category",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,options, options[4]);
		
		if(selected==0)
		{
			Digital_Movies d1=new Digital_Movies();
			listItemNamesAndPrice(d1.returnItemName(), d1.returnItemPrice(),d1.returnItemTransaction());
		}
		
		else if(selected==1)
		{
			Digital_Music_Albums mu1=new Digital_Music_Albums();
			listItemNamesAndPrice(mu1.returnItemName(), mu1.returnItemPrice(),mu1.returnItemTransaction());
		}
		
		else if(selected==2)
		{
			E_books b01=new E_books();
			listItemNamesAndPrice(b01.returnItemName(), b01.returnItemPrice(),b01.returnItemTransaction());
		}
		
		else if(selected==3)
		{
			Digital_Games ga1=new Digital_Games();
			listItemNamesAndPrice(ga1.returnItemName(), ga1.returnItemPrice(),ga1.returnItemTransaction());
		}
		
		else if(selected==4)
		{
			Digital_News ne=new Digital_News();
			listItemNamesAndPrice(ne.returnItemName(), ne.returnItemPrice(),ne.returnItemTransaction());
		}
		
	}
	
	public int shopOrcheckout()
	{
		shopFlag = JOptionPane.showConfirmDialog (null, "Would you like to continue shopping?","Shop or Checkout",JOptionPane.YES_NO_OPTION);
		return shopFlag;
	}
	
	
}
