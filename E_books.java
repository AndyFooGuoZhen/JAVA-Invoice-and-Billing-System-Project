import javax.swing.JOptionPane;

public class E_books extends Items
{
	String bookName[]= {"DORK diaries","Lord of the rings","Percy Jackson","The Hobbit", "The Hunger Games",
			            "Harry Potter", "The Famous Five", "Warren Bufett","Life of Pi","IT","Frankenstein",
			            "The Davinci Code","Anne Frank","Robinhood","The Martian","I am Mamala","Lord of the Flies",
			            "Dracula","Encyclopedia","Sherlock Holmes","Freedom","Love after Love","The Alice Network",
			            "The Great Gatsby","Oliver Twist","Careless Whisper","Brokeback Mountain","eclipse",
			            "Rich Dad Poor Dad","Life Without Limits"};
	
	double bookPrice[]= {16.00,43.45,23.40,43.45,33.00,23.67,17.00,35.55,25.70,22.10,18.50,36.85,35.00,
			             9.00,45.00,26.46,19.30,17.80,120.00,35.80,21.25,27.60,24.00,31.20,40.00,16.70,
			             14.67,29.00,37.00,42.55};
	
	String bookList[]=new String[bookName.length];
	
	public E_books ()
	{
		choiceList();
		String n=(String)JOptionPane.showInputDialog(null,"PLease select one E-book","E-book selection",JOptionPane.QUESTION_MESSAGE,null,bookList,bookList[bookList.length-1]);
		
		if(n!=null)
		{
			recordCart(setBookIndex(n));
		}
	}
	
	public void choiceList()
	{
		for(int i=0;i<bookName.length;i++)
		{
			bookList[i]=String.format("%s     RM %.2f", bookName[i],bookPrice[i]);	
		}
	}
	
	public int setBookIndex(String output)
	{
		int index=0;
		
		for(int i=0;i<bookName.length;i++)
		{
			if(bookList[i].equals(output)) 
			{
				index=i;
			}
		}
		
		return index;
		
	}
	
	public void recordCart(int indexNumber)
	{
		addItemNameAndPrice(bookName[indexNumber],bookPrice[indexNumber],"Purchase");
	}
	
}
