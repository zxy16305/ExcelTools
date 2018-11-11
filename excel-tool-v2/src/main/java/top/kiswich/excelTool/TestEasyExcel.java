package top.kiswich.excelTool;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class TestEasyExcel {
    public static void main(String[] args) throws IOException {
        testWrite();
    }

    public static void testRead() {
        InputStream systemResourceAsStream = ClassLoader.getSystemResourceAsStream("testRead.xlsx");
        ExcelReader excelReader = new ExcelReader(systemResourceAsStream, ExcelTypeEnum.XLSX, new AnalysisEventListener<EasyExcelTestObject>() {
            @Override
            public void invoke(EasyExcelTestObject object, AnalysisContext context) {
                System.out.println(object.toString());
            }

            @Override
            public void doAfterAllAnalysed(AnalysisContext context) {

            }
        });

        excelReader.read(new Sheet(1, 1, EasyExcelTestObject.class));
    }

    public static void testWrite() throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream("writeExcel.xlsx")) {

            ExcelWriter excelWriter = new ExcelWriter(fileOutputStream, ExcelTypeEnum.XLSX);

            ArrayList<EasyExcelTestObject> easyExcelTestObjects = new ArrayList<>();
            easyExcelTestObjects.add(new EasyExcelTestObject() {{
                setId("超長id超長id超長id超長id超長id超長id超長id超長id超長id超長id超長id");
                setName("222");
                setAuto("333");
            }});
            easyExcelTestObjects.add(new EasyExcelTestObject() {{
                setId("222");
                setName("333");
                setAuto("444");
            }});
            easyExcelTestObjects.add(new EasyExcelTestObject() {{
                setId("333");
                setName("444");
                setAuto("555");
            }});

            excelWriter.write(easyExcelTestObjects, new Sheet(1, 0, EasyExcelTestObject.class));
            excelWriter.finish();

        }

    }
}
