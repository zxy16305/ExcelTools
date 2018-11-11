package top.kiswich.excelTool.annotation.manager
@Target(AnnotationTarget.TYPE,AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class ExcelImport (
    val inputMethod : ImportMethod  = ImportMethod.TEMPLATE
)

enum class ImportMethod{
    TEMPLATE,//模板导入

}