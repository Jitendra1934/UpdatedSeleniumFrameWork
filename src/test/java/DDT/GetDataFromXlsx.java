package DDT;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

public class GetDataFromXlsx {

    static Workbook workbook;
    static Sheet sheet;

    //public static String sheetPath = System.getProperty("User Directory"+"src/test/Resources/ExcelBook1.xlsx");

    public static String sheetPath = System.getProperty("user.dir") + "/src/test/Resources/ExcelBook1.xlsx";

    public Object[][] getDataFromXl(String sheetName) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(sheetPath);

        workbook = WorkbookFactory.create(fileInputStream);
        sheet= workbook.getSheet(sheetName);

       Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

               for(int i=0;i<sheet.getLastRowNum();i++){

                   for(int j=0;j<sheet.getRow(0).getLastCellNum();j++){

                       data[i][j] = sheet.getRow(i+1).getCell(j).toString();
                   }
               }
        return data;
    }

    @DataProvider
    public Object[][] getData() throws IOException {

        return getDataFromXl("Sheet1");
    }

}
