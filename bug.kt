fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    val numbers = mutableListOf(1,2,3,4,5)
    val doubled = numbers.map{it * 2}
    println(doubled) //Output: [2, 4, 6, 8, 10]

    val updatedNumbers = numbers.map { it * 2 }
    println(updatedNumbers) //Output: [2, 4, 6, 8, 10]
    println(numbers) //Output: [1, 2, 3, 4, 5] 
}