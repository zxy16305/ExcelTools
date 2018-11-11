package top.kiswich.excelTool.annotation.pojo

@Target(AnnotationTarget.TYPE,AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class ExcelColumn (
        val title:String,
        val fontSize: Int = 40,
        val order:Int = Int.MAX_VALUE
)