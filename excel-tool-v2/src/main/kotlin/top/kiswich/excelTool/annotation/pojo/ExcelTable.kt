package top.kiswich.excelTool.annotation.pojo

@Target(AnnotationTarget.TYPE,AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class ExcelTable(
        val title:String,
        val fontSize: Int = 40
)