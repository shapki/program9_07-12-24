# МДК.01.03 Разработка мобильных приложений
### Coroutines | 10 задач

> Решить задачи, представленные ниже. Для каждого запуска выводить информацию о времени, затраченном на выполнение программы

------------

### Задача 9
Дан массив целых чисел nums и целое число k, вернуть значение true, если в массиве есть два различных индекса i и j, такие что nums[i] == nums[j] и abs(i - j) <= k

**Example 1:**

    Input: nums = [1,2,3,1], k = 3
    Output: true

**Example 2:**

    Input: nums = [1,0,1,1], k = 1
    Output: true

**Example 3:**

    Input: nums = [1,2,3,1,2,3], k = 2
    Output: false
    Constraints:
    
    1 <= nums.length <= 105
    -109 <= nums[i] <= 109
    0 <= k <= 105
