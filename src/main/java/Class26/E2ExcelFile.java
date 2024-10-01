package Class26;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E1ExcelFile {
    public static void main(String[] args) throws IOException {
        String Location="C:\\Users\\malik\\IdeaProjects\\JavaReview\\files\\Salaries.xlsx";
        FileInputStream excel=new FileInputStream(Location);
        // it should use just foe Excel file
        XSSFWorkbook workbook=new XSSFWorkbook(excel);
        Sheet sheet=workbook.getSheet("sheet1");
        Row row=sheet.getRow(1);
        Cell cell=row.getCell(3);
        System.out.println(cell);
    }
}
