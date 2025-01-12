fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val emptyList = emptyList<Int>()
    val emptyResult = emptyList.map { it * 2 }
    println(emptyResult) // Output: []

    // Solution for handling potential empty lists
    val anotherList = listOf(6,7,8,9,0)
    val safeResult = anotherList.ifEmpty { listOf(0) }.map { it * 2 }
    println(safeResult) //Output: [12, 14, 16, 18, 0]

    val yetAnotherEmptyList = emptyList<Int>()
    val safeEmptyResult = yetAnotherEmptyList.ifEmpty { listOf(0) }.map { it * 2 }
    println(safeEmptyResult) //Output: [0]
} 