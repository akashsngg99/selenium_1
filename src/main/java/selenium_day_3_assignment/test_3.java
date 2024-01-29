package selenium_day_3_assignment;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import java.io.FileInputStream;
import java.io.IOException;



public class test_3 {

	XSSFWorkbook wb;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "D:/softwares/selenium/edgedriver_win64/msedgedriver.exe");

	    WebDriver driver = new EdgeDriver();
	    driver.get("https://seleniumbase.io/demo_page");
	    
        String excelFilePath = "D:\\akash.xlsx";

        FileInputStream fis = new FileInputStream(excelFilePath);
        
        //Workbook workbook = WorkbookFactory.create(fis);
        
        
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet st=wb.getSheet("Sheet1");
        
        int rows = st.getLastRowNum() + 1;
        int cols = st.getRow(0).getLastCellNum();
        //System.out.println(rows + "  " + cols);
        String cellData = st.getRow(rows - 1).getCell(cols - 1).toString();
        /*System.out.println(cellData);
        for(int i =1;i<=rows;i++) {
        	for(int j=1;j<=cols;j++) {
        		System.out.println(st.getRow(i - 1).getCell(j - 1).toString());
        	}
        }*/
        
        WebElement textBox = driver.findElement(By.xpath("//input[@id='myTextInput']"));
        textBox.sendKeys(cellData);
        System.out.println(cellData);

        wb.close();	
        driver.close();
	}

}
