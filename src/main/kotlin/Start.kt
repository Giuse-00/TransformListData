
fun main(){

    val list = listOf(3, 7, 9).map { it.toString() }

    list.forEach { it -> println("Item list: ${it}") }
}