import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileOutputStream;
import java.io.IOException;


public class xlsx {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook xlsxWorkbook = new XSSFWorkbook();
        Sheet sheet = xlsxWorkbook.createSheet("FirstSheet");


        for (int i = 0; i < 100000 ; i++) {
            Row row = sheet.createRow(i);
            for (int j = 0; j < 112 ; j++) {
                Cell cell = row.createCell(j);
                cell.setCellValue(j);
            }
            if (i%2000 == 1 ){
                System.out.println(i);
            }
        }

        xlsxWorkbook.write(new FileOutputStream("file.xlsx"));
        xlsxWorkbook.close();

    }
}
