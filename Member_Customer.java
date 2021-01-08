import javax.swing.JOptionPane;

public class Member_Customer extends Customer 
{
	int memberflag=0;
	private double Discount[]= {0.1,0.2,0.3};
	private String memberID;
	private double TotalPrice;
	private double discountedPrice=0;
	
	public Member_Customer(String name,String ID)
	{
		checkMember();
		
		if(memberflag==1)
		{
			setCustomerType("Member Customer");
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
			printReceipt(name,getCustomerType(),memberID,i1.getItemNames(),i1.getItemPrice(),i1.getItemTranaction(),TotalPrice,discountedPrice);
		}
		
		else
		{
			if(memberflag==0)
			{
				JOptionPane.showMessageDialog(null,"Member ID has expired! ","Error",JOptionPane.ERROR_MESSAGE);
				
			}
			
			JOptionPane.showMessageDialog(null,"You will shop as a Non-Member Customer ","Error",JOptionPane.ERROR_MESSAGE);
			Non_Member_Customer n1=new Non_Member_Customer(name,ID);
		}
		
	}
	
	public void discountCheck()
	{
		discountedPrice=TotalPrice;
		
		if(discountedPrice>=100 && discountedPrice <200)
		{
			discountedPrice=discountedPrice-(discountedPrice*Discount[0]);
		}
		
		else if(discountedPrice>=200 && discountedPrice <300)
		{
			discountedPrice=discountedPrice-(discountedPrice*Discount[1]);
		}
		
		else if(discountedPrice>=300)
		{
			discountedPrice=discountedPrice-(discountedPrice*Discount[2]);
		}
	}
	
	public void checkMember()
	{
		int date[]=new int[3];
		int todayDate[]= {12,8,2020};
		
		memberID=JOptionPane.showInputDialog(null,"Date: 12/8/2020   Enter memberID (EX:1300850XXX):",null,JOptionPane.PLAIN_MESSAGE); 
		
		 
		switch(memberID)  // Used this in C++ last time
		{
			case "1300850001":
			date=new int[]{17,10,2019};
			break;
			 
			case "1300850002":
			date=new int[]{22,9,2021};
			break;
			
			case "1300850003":
			date=new int[]{8,5,2017};
			break;
				 
			case "1300850004":
			date=new int[]{12,4,2021};
			break;
			
			case "1300850005":
			date=new int[]{23,6,2020};
			break;
			
			case "1300850006":
			date=new int[]{22,7,2019};
			break;
			
			case "1300850007":
			date=new int[]{10,2,2018};
			break;
			
			case "1300850008":
			date=new int[]{3,5,2022};
			break;
			
			case "1300850009":
			date=new int[]{17,4,2020};
			break;
			
			case "1300850010":
			date=new int[]{6,5,2020};
			break;
			
			case "1300850011":
			date=new int[]{7,11,2018};
			break;
			
			case "1300850012":
			date=new int[]{2,2,2022};
			break;
			
			case "1300850013":
			date=new int[]{1,10,2019};
			break;
			
			case "1300850014":
			date=new int[]{13,11,2018};
			break;
			
			case "1300850015":
			date=new int[]{1,3,2017};
			break;
			
			case "1300850016":
			date=new int[]{6,4,2017};
			break;
			
			case "1300850017":
			date=new int[]{3,7,2018};
			break;
			
			case "1300850018":
			date=new int[]{27,2,2020};
			break;
			
			case "1300850019":
			date=new int[]{6,5,2019};
			break;
			
			case "1300850020":
			date=new int[]{15,5,2020};
			break;
			
			case "1300850021":
			date=new int[]{4,7,2022};
			break;
			
			case "1300850022":
			date=new int[]{27,2,2021};
			break;
			
			case "1300850023":
			date=new int[]{6,12,2021};
			break;
			
			case "1300850024":
			date=new int[]{9,1,2022};
			break;
			
			case "1300850025":
			date=new int[]{16,3,2019};
			break;
			
			case "1300850026":
			date=new int[]{21,5,2018};
			break;
			
			case "1300850027":
			date=new int[]{22,5,2019};
			break;
			
			case "1300850028":
			date=new int[]{9,12,2017};
			break;
			
			case "1300850029":
			date=new int[]{14,2,2018};
			break;
			
			case "1300850030":
			date=new int[]{9,11,2017};
			break;
			
			case "1300850031":
			date=new int[]{18,10,2018};
			break;
			
			case "1300850032":
			date=new int[]{2,6,2019};
			break;
			
			case "1300850033":
			date=new int[]{30,4,2017};
			break;
			
			case "1300850034":
			date=new int[]{1,12,2020};
			break;
			
			case "1300850035":
			date=new int[]{11,10,2020};
			break;
			
			case "1300850036":
			date=new int[]{22,10,2018};
			break;
			
			case "1300850037":
			date=new int[]{19,8,2020};
			break;
			
			case "1300850038":
			date=new int[]{6,4,2020};
			break;
			
			case "1300850039":
			date=new int[]{5,12,2020};
			break;
			
			case "1300850040":
			date=new int[]{5,10,2019};
			break;
			
			case "1300850041":
			date=new int[]{12,8,2017};
			break;
			
			case "1300850042":
			date=new int[]{25,6,2021};
			break;
			
			case "1300850043":
			date=new int[]{24,8,2018};
			break;
			
			case "1300850044":
			date=new int[]{11,2,2022};
			break;
			
			case "1300850045":
			date=new int[]{24,11,2021};
			break;
			
			case "1300850046":
			date=new int[]{20,10,2021};
			break;
			
			case "1300850047":
			date=new int[]{22,3,2018};
			break;
			
			case "1300850048":
			date=new int[]{31,3,2018};
			break;
			
			case "1300850049":
			date=new int[]{18,5,2017};
			break;
			
			case "1300850050":
			date=new int[]{20,6,2021};
			break;
			
			default:
			JOptionPane.showMessageDialog(null,"Member ID not found! ","Error",JOptionPane.ERROR_MESSAGE);
			memberID="NONE";
			memberflag=2;		}
		
		
		if(date[2]>todayDate[2])
		{
			memberflag=1;
		}
		
		else if(date[2]==todayDate[2])
		{
			if(date[1]>todayDate[1])
			{
				memberflag=1;
			}
			
			else if(date[1]==todayDate[1])
			{
				if(date[0]>=todayDate[0])
				{
					memberflag=1;
				}
				
			}
		}
	
	}
		
}
	
	
	
	

