package Class26;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E4ReadAllDataFromExcelFile {
    public static void main(String[] args) throws IOException {
        // read all data from excel file
        String Location = "C:\\Users\\malik\\IdeaProjects\\JavaReview\\files\\Salaries.xlsx";
        FileInputStream excel = new FileInputStream(Location);
        // it should use just foe Excel file
        XSSFWorkbook workbook = new XSSFWorkbook(excel);
        Sheet sheet = workbook.getSheet("sheet1");
        // a nested data structure that is going to hold all th e info the sheet
        List<Map<String ,String >> empListMap=new ArrayList<>();

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++){
            Row row = sheet.getRow(i);
            Map<String ,String >rowMap=new LinkedHashMap<>();

            // getPhysicalNumbersOfCells is like size or length to read the number of row
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                System.out.print(row.getCell(j)+" ");
            }
            empListMap.add(rowMap);
            System.out.println();
        }

    }
}
