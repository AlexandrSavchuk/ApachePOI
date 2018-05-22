import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileOutputStream;
import java.io.IOException;

public class xls {
    public static void main(String[] args) throws IOException {
        HSSFWorkbook xlsWorkBook = new HSSFWorkbook();
        Sheet xlsSheet = xlsWorkBook.createSheet("xlsSheet1");
        Row row = xlsSheet.createRow(0);

        Cell cell = row.createCell(0);

        cell.setCellValue("firs val");

        xlsWorkBook.write(new FileOutputStream("file.xls"));
        xlsWorkBook.close();

    }
}
