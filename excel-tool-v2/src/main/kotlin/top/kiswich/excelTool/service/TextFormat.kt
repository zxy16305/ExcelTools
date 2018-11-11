package top.kiswich.excelTool.service

/**
 * 转换器 提供 时间： time date timedate timestamp
 */
interface TextFormat {
    fun format(text: String){
        text.replace("{timestamp}","")

    }
}