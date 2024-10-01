package Class26;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E3ExcelFile {
    public static void main(String[] args) throws IOException {
        // read all data from excel file
        String Location = "C:\\Users\\malik\\IdeaProjects\\JavaReview\\files\\Salaries.xlsx";
        FileInputStream excel = new FileInputStream(Location);
        // it should use just foe Excel file
        XSSFWorkbook workbook = new XSSFWorkbook(excel);
        Sheet sheet = workbook.getSheet("sheet1");


        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);

            // getPhysicalNumbersOfCells is like size or length to read the number of row
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                System.out.print(row.getCell(j)+" ");
            }
            System.out.println();
        }
    }
}
