import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

 

public class Data_provider_demo {

	public static void main(String[] args) throws IOException {
		String sheetPath=System.getProperty("user.dir")
				+"\\src\\Test_Data\\Data.xlsx";
		
		FileInputStream fis=new FileInputStream(sheetPath);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int lastRowNum = sh.getLastRowNum();//4
		int firstRowNum=sh.getFirstRowNum();
		System.out.println(firstRowNum);
		int totalRows=lastRowNum - firstRowNum;
		
		Row row  = sh.getRow(0);
		int lastCellNum = row.getLastCellNum();
		System.out.println(lastCellNum);

	}

}
