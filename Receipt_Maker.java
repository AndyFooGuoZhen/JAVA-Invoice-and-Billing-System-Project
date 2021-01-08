import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


import java.io.FileOutputStream;
import java.util.List;

public class Receipt_Maker 
{
	public Receipt_Maker(String name, String customerType,String ID,List<String>cartItemNames,List<Double>cartItemPrices,List<String>cartItemTransaction,double totalPrice, double discountedPrice)
	{
		System.out.println("Your receipt is printed.");
		
		try 
		{	Document doc = new Document();
			PdfWriter.getInstance(doc, new FileOutputStream("Receipt.pdf"));
			doc.open();
			Font f1=new Font(Font.FontFamily.HELVETICA,25,Font.BOLD);
				doc.add(new Paragraph("MusicStop  Malaysia",f1));
				doc.add(new Paragraph("-------------------------------------------------------------------------------------------------------------------------------"));
				doc.add(new Paragraph("C  A  S  H         R   E   C   E   I   P   T"));
				doc.add(Chunk.NEWLINE);
				doc.add(Chunk.NEWLINE);
				doc.add(new Paragraph("Name                : " + name));
				doc.add(new Paragraph("Date                  : 12/8/2020 "));
				doc.add(new Paragraph("Customer Type : " + customerType));
				doc.add(new Paragraph("Customer ID     : " + ID));
				doc.add(Chunk.NEWLINE);
			
			Font tableTitle=new Font(Font.FontFamily.TIMES_ROMAN,17,Font.BOLD);
				PdfPTable table=new PdfPTable(4);
				table.setWidthPercentage(100);
				table.setWidths(new int[] {1,6,4,2});
				PdfPCell ce1=new PdfPCell(new Paragraph("No.",tableTitle));
				PdfPCell ce2=new PdfPCell(new Paragraph("Item Description",tableTitle));
				PdfPCell ce3=new PdfPCell(new Paragraph("Transaction Mode",tableTitle));
				PdfPCell ce4=new PdfPCell(new Paragraph("Price",tableTitle));
				
				table.addCell(ce1);
				table.addCell(ce2);
				table.addCell(ce3);
				table.addCell(ce4);
				
				for(int i=0;i<cartItemNames.size();i++)
				{
					 ce1=new PdfPCell(new Paragraph(Integer.toString(i+1)));
					 ce2=new PdfPCell(new Paragraph(cartItemNames.get(i)));
					 ce3=new PdfPCell(new Paragraph(cartItemTransaction.get(i)));
					 ce4=new PdfPCell(new Paragraph(String.format("RM %.2f", cartItemPrices.get(i))));
					 
					 table.addCell(ce1);
					 table.addCell(ce2);
					 table.addCell(ce3);
					 table.addCell(ce4);
				}
				
				doc.add(table);
				doc.add(Chunk.NEWLINE);
				
				if(totalPrice!=discountedPrice)
				{
					doc.add(new Paragraph(String.format("%125s%.2f", "Subtotal: RM ",totalPrice)));
					doc.add(new Paragraph(String.format("%125s%.2f", "Discount: -RM ",totalPrice-discountedPrice)));
					doc.add(Chunk.NEWLINE);
				}
				
				PdfPTable Total=new PdfPTable(1);
				Total.setWidthPercentage(100);
				ce1=new PdfPCell(new Paragraph(String.format("TOTAL%85s%.2f", "RM ",discountedPrice),tableTitle));
				Total.addCell(ce1);
				doc.add(Total);
				
				doc.close();	
				
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}


