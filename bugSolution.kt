fun main() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    
    //Modifying the original list in place
    for (i in numbers.indices) {
        numbers[i] *= 2
    }
    println(numbers) // Output: [2, 4, 6, 8, 10]

    //Alternative using map and assigning back to original variable 
    val numbers2 = mutableListOf(1,2,3,4,5)
    numbers2.clear() //clear the list to avoid creating a new list
    numbers2.addAll(numbers2.map {it * 2})
    println(numbers2) //Output: [2, 4, 6, 8, 10]
} 