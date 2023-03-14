
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JsonUtil {

    public JsonUtil() {
    }
public static String studentsToJSON(String str) throws IOException {
        List<Student> listStudents = new ArrayList();
    FileInputStream fis = new FileInputStream(str);
    XSSFWorkbook workbook = new XSSFWorkbook(fis);
    XSSFSheet sheetStudents = workbook.getSheetAt(0);
    Iterator<Row> rowIteratorStudents = sheetStudents.iterator();
    rowIteratorStudents.next();
    while (rowIteratorStudents.hasNext()) {
        Row rowStudents = rowIteratorStudents.next();
        Student student = new Student();
        listStudents.add(student);
        student.setUniversityId(rowStudents.getCell(0).getStringCellValue());
        student.setFullName(rowStudents.getCell(1).getStringCellValue());
        student.setCurrentCourseNumber((int) rowStudents.getCell(2).getNumericCellValue());
        student.setAvgExamScore((float) rowStudents.getCell(3).getNumericCellValue());

    }
    return null;
}

}
