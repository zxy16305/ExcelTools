package top.kiswich.excelTool;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;


@Data
public class EasyExcelTestObject extends BaseRowModel {
    @ExcelProperty(index = 0,value = "編碼")
    private String id;

    @ExcelProperty(index = 1,value = "姓名")
    private String name;

    @ExcelProperty(value = {"不固定表头"})
    private String auto;

}
