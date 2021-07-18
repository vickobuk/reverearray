fun main (){
    val list1: List<Int> = listOf(3,4,8,5,9,7)
    println(reverse(list1))
    val list2: List<Int> = listOf(2,5,8)
    println(reverse(list2))
}

fun reverse(list:List<Int>):List<Int>{

    val result:ArrayList<Int> = arrayListOf<Int>()
    for (i:Int in 0 until list.size /1){
        val number :Int = list[list.size-1 -i]
        result.add(number)
    }
 return result
}

