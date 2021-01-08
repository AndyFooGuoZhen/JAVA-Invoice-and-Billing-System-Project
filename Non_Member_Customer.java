
public class Non_Member_Customer extends Customer
{
	 private double TotalPrice;
	 private double discountedPrice=0;
	 private double discount=0.1;
	
	
	public Non_Member_Customer(String name,String ID) 
	{
		
		setCustomerType("Non-Member Customer");
		
		
		Items i1=new Items();
		
		while(i1.shopFlag==0)
		{
			TotalPrice=0;
			i1.shopType();
			System.out.println("Current cart: " + i1.getItemNames());
			
			for(int i=0;i<i1.getItemPrice().size();i++)
			{
				TotalPrice=i1.getItemPrice().get(i)+TotalPrice;
			}
			
			System.out.printf("Total price of cart: %.2f \n\n" ,TotalPrice);
			
			i1.shopOrcheckout();
			
		}
		
		discountCheck();
		printReceipt(name,getCustomerType(),ID,i1.getItemNames(),i1.getItemPrice(),i1.getItemTranaction(),TotalPrice,discountedPrice);
		
	}
	
	public void discountCheck()
	{
		discountedPrice=TotalPrice;
		
		if(discountedPrice>=300)
		{
			discountedPrice=discountedPrice-(discountedPrice*discount);
		}
	}
	
}
 