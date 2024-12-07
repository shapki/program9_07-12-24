/*Дан массив целых чисел nums и целое число k, вернуть значение true, если в массиве есть два различных индекса i и j,
такие что nums[i] == nums[j] и abs(i - j) <= k*/

import kotlin.system.measureTimeMillis
fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val indexMap = mutableMapOf<Int, Int>()

    for (i in nums.indices) {
        if (indexMap.containsKey(nums[i])) {
            val lastIndex = indexMap[nums[i]]!!
            if (i - lastIndex <= k) {
                return true
            }
        }
        indexMap[nums[i]] = i
    }

    return false
}

fun readInput(): Pair<IntArray, Int> {
    print("| Массив: ")
    val nums = readLine()?.split(Regex("[,\\s]+"))?.map { it.toInt() }?.toIntArray() ?: intArrayOf()
    print("| Целое число k: ")
    val k = readLine()?.toIntOrNull() ?: 0
    return Pair(nums, k)
}

fun main() {
    val (nums, k) = readInput()
    testContainsNearbyDuplicate(nums, k)
}

fun testContainsNearbyDuplicate(nums: IntArray, k: Int) {
    val startTime = System.currentTimeMillis()
    val result = containsNearbyDuplicate(nums, k)
    val endTime = System.currentTimeMillis()
    val time = endTime - startTime
    println("Вывод: $result, Время: $time мс")
}