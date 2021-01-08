import javax.swing.JOptionPane;

import java.util.List;


public class Customer 
{
	private String name;
	private String customerType;
	private String ID="NONE";
	
	public void setName() 
	{
		name=JOptionPane.showInputDialog(null,"Enter name:",null,JOptionPane.PLAIN_MESSAGE);
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setCustomerType(String type)
	{
		customerType=type;
	}
	
	public String getCustomerType()
	{
		return customerType;
	}
	
	public void setCustomerType() 
	{
		setName();
		String[] type = { "STAFF", "MEMBER CUSTOMER", "NON-MEMBER CUSTOMER"};
		int selectedType=JOptionPane.showOptionDialog(null, "Select customer category", "Type",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, type, type[2]);
		
		if(selectedType==0)
		{	
			Store_Staff s1= new Store_Staff(name,ID);
		}
		
		else if(selectedType==1)
		{
			Member_Customer m1=new Member_Customer(name,ID);
		}
		
		
		else
		{
			Non_Member_Customer n1=new Non_Member_Customer(name,ID);
		}	
	}
	
	public void printReceipt(String name, String customerType,String ID,List<String>cartItemNames,List<Double>cartItemPrices,List<String>cartItemTransaction,double totalPrice, double discountedPrice)
	{
		Receipt_Maker R1=new Receipt_Maker(name,customerType,ID,cartItemNames,cartItemPrices,cartItemTransaction,totalPrice,discountedPrice);
	}
	
}





