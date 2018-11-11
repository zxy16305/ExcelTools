package top.kiswich.excelTool;

import top.kiswich.excelTool.annotation.pojo.ExcelTable;

@ExcelTable(title = "notile")
public class ExcelTestObj {

    private String name;

    private Integer age;

    private String mark;

    public String idCard;

    public String getName() {
        return name;
    }

    public ExcelTestObj setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public ExcelTestObj setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getMark() {
        return mark;
    }

    public ExcelTestObj setMark(String mark) {
        this.mark = mark;
        return this;
    }

    public static void main(String[] args) {
       new ExcelAnnotationParser<ExcelTestObj>( new ExcelTestObj()).parse();

    }
}
