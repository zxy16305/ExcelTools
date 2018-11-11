package top.kiswich.excelTool

class ExcelAnnotationParser<T : Any> (var excelObject: T) {

    init {
        val kClass = excelObject.javaClass;
    }

    fun parse(){
        val javaClass = excelObject.javaClass
        val annotatedInterfaces = javaClass.annotatedInterfaces
        javaClass.annotations.forEach { println(it.toString()) }
//        annotatedInterfaces.forEach {  print(it.type)}
        println()
        javaClass.methods.forEach { println(it.toString()) }
        println()

        javaClass.fields.forEach { println(it.toString()) }
        println()

        javaClass.declaredFields.forEach { println(it.toString()) }
    }
}

//data class ExcelObject(var name:String,var old:Number);
//
//fun getKClass( o :Any):KClass<Any> = o.javaClass.kotlin;
//
//fun main(args: Array<String>) {
//    val kClass = getKClass(1)
//    print( kClass)
//    val excelObject = ExcelObject("小红", 18)
//    excelObject.javaClass.constructors
//}