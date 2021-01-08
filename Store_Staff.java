
public class Store_Staff extends Customer
{
	private double discount=0.3;
	private double TotalPrice=0;
	private double discountedPrice=0;
	
	public Store_Staff(String name,String ID)
	{
		
		setCustomerType("Store Staff");
		
		
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
		
		discountedPrice=TotalPrice;
		
		discountedPrice=discountedPrice-(discountedPrice*discount);
		
		printReceipt(name,getCustomerType(),ID,i1.getItemNames(),i1.getItemPrice(),i1.getItemTranaction(),TotalPrice,discountedPrice);
	}
	
}
