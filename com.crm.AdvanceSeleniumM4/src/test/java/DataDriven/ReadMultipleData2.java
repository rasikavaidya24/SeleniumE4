package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData2 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.out.println("multiple data redaing...");
	    FileInputStream fis = new FileInputStream("C:\\Users\\RASIKA\\Desktop\\Selenium\\login.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sheet = wb.getSheet("Sheet1");
	    
	    int row= sheet.getPhysicalNumberOfRows();
	    int colom = sheet.getRow(0).getPhysicalNumberOfCells();
	    System.out.println(row+" "+colom);
	    Thread.sleep(1000);
	    
	    for(int i = 0;i <row; i++)
	    {
	    	for(int j = 0; j <colom; j++)
	    	{
	    		String data = sheet.getRow(i).getCell(j).toString();
	    		System.out.println(data);
	    		Thread.sleep(1500);
	    	
	}

	    }
	}
	
}
